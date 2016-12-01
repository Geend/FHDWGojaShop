package persistence;

import model.*;

import java.util.Iterator;

public class ReOrderManager_ReorderArticlesProxi extends PersistentListProxi<ReOrderQuantifiedArticle4Public> {

  	private ReOrderQuantifiedArticleList list;
  	private ReOrderManager owner;

  	public ReOrderManager_ReorderArticlesProxi(ReOrderManager owner) {
    	this.owner = owner;
  	}
  	public ReOrderQuantifiedArticleList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new ReOrderQuantifiedArticleList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theReOrderManagerFacade.reorderArticlesGet(this.owner.getId());
      		}
      		this.data = this.list.data;
    	}
    	return this.list;
  	}
  	public Iterator<ReOrderQuantifiedArticle4Public> iterator() throws PersistenceException{
    	return this.getList().iterator(this);
  	}
  	public long getLength() throws PersistenceException{
	  	return this.getList().getLength();
  	}
  	public void add(ReOrderQuantifiedArticle4Public entry) throws PersistenceException {
    	if (entry != null) {
      		ReOrderQuantifiedArticleList list = this.getList();
      		long entryId = 0;
      		if (!this.owner.isDelayed$Persistence()) {
        		entry.store();  	
        		entryId = ConnectionHandler.getTheConnectionHandler().theReOrderManagerFacade
        	               	.reorderArticlesAdd(owner.getId(), entry);
      		}
      		list.add((ReOrderQuantifiedArticle4Public)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theReOrderManagerFacade.reorderArticlesRem(entry.getListEntryId());
    	}
    	
  	}
  	public ReOrderManager_ReorderArticlesProxi copy(ReOrderManager owner) throws PersistenceException {
  		ReOrderManager_ReorderArticlesProxi result = new ReOrderManager_ReorderArticlesProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<ReOrderQuantifiedArticle4Public> entries = (this.list == null ? new java.util.Vector<ReOrderQuantifiedArticle4Public>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			ReOrderQuantifiedArticle4Public current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theReOrderManagerFacade
            	           .reorderArticlesAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
