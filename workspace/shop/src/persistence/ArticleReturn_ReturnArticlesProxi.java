package persistence;

import model.*;

import java.util.Iterator;

public class ArticleReturn_ReturnArticlesProxi extends PersistentListProxi<ReturnQuantifiedArticle4Public> {

  	private ReturnQuantifiedArticleList list;
  	private ArticleReturn owner;

  	public ArticleReturn_ReturnArticlesProxi(ArticleReturn owner) {
    	this.owner = owner;
  	}
  	public ReturnQuantifiedArticleList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new ReturnQuantifiedArticleList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theArticleReturnFacade.returnArticlesGet(this.owner.getId());
      		}
      		this.data = this.list.data;
    	}
    	return this.list;
  	}
  	public Iterator<ReturnQuantifiedArticle4Public> iterator() throws PersistenceException{
    	return this.getList().iterator(this);
  	}
  	public long getLength() throws PersistenceException{
	  	return this.getList().getLength();
  	}
  	public void add(ReturnQuantifiedArticle4Public entry) throws PersistenceException {
    	if (entry != null) {
      		ReturnQuantifiedArticleList list = this.getList();
      		long entryId = 0;
      		if (!this.owner.isDelayed$Persistence()) {
        		entry.store();  	
        		entryId = ConnectionHandler.getTheConnectionHandler().theArticleReturnFacade
        	               	.returnArticlesAdd(owner.getId(), entry);
      		}
      		list.add((ReturnQuantifiedArticle4Public)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theArticleReturnFacade.returnArticlesRem(entry.getListEntryId());
    	}
    	
  	}
  	public ArticleReturn_ReturnArticlesProxi copy(ArticleReturn owner) throws PersistenceException {
  		ArticleReturn_ReturnArticlesProxi result = new ArticleReturn_ReturnArticlesProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<ReturnQuantifiedArticle4Public> entries = (this.list == null ? new java.util.Vector<ReturnQuantifiedArticle4Public>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			ReturnQuantifiedArticle4Public current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theArticleReturnFacade
            	           .returnArticlesAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
