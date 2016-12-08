package persistence;

import model.*;

import java.util.Iterator;

public class ReturnManager_ArticleReturnProxi extends PersistentListProxi<ArticleReturn4Public> {

  	private ArticleReturnList list;
  	private ReturnManager owner;

  	public ReturnManager_ArticleReturnProxi(ReturnManager owner) {
    	this.owner = owner;
  	}
  	public ArticleReturnList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new ArticleReturnList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theReturnManagerFacade.articleReturnGet(this.owner.getId());
      		}
      		this.data = this.list.data;
    	}
    	return this.list;
  	}
  	public Iterator<ArticleReturn4Public> iterator() throws PersistenceException{
    	return this.getList().iterator(this);
  	}
  	public long getLength() throws PersistenceException{
	  	return this.getList().getLength();
  	}
  	public void add(ArticleReturn4Public entry) throws PersistenceException {
    	if (entry != null) {
      		ArticleReturnList list = this.getList();
      		long entryId = 0;
      		if (!this.owner.isDelayed$Persistence()) {
        		entry.store();  	
        		entryId = ConnectionHandler.getTheConnectionHandler().theReturnManagerFacade
        	               	.articleReturnAdd(owner.getId(), entry);
      		}
      		list.add((ArticleReturn4Public)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theReturnManagerFacade.articleReturnRem(entry.getListEntryId());
    	}
    	
  	}
  	public ReturnManager_ArticleReturnProxi copy(ReturnManager owner) throws PersistenceException {
  		ReturnManager_ArticleReturnProxi result = new ReturnManager_ArticleReturnProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<ArticleReturn4Public> entries = (this.list == null ? new java.util.Vector<ArticleReturn4Public>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			ArticleReturn4Public current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theReturnManagerFacade
            	           .articleReturnAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
