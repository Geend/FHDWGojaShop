package persistence;

import model.*;

import java.util.Iterator;

public class ReOrderManagerReorderArticles_ObserveeProxi extends PersistentListProxi<ReOrderQuantifiedArticle4Public> {

  	private ReOrderQuantifiedArticleList list;
  	private ReOrderManagerReorderArticles owner;

  	public ReOrderManagerReorderArticles_ObserveeProxi(ReOrderManagerReorderArticles owner) {
    	this.owner = owner;
  	}
  	public ReOrderQuantifiedArticleList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new ReOrderQuantifiedArticleList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theReOrderManagerReorderArticlesFacade.observeeGet(this.owner.getId());
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
        		entryId = ConnectionHandler.getTheConnectionHandler().theReOrderManagerReorderArticlesFacade
        	               	.observeeAdd(owner.getId(), entry);
      		}
      		list.add((ReOrderQuantifiedArticle4Public)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		entry.register(this.owner);
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theReOrderManagerReorderArticlesFacade.observeeRem(entry.getListEntryId());
    	}
    	((ReOrderQuantifiedArticle4Public)entry).deregister(this.owner);
  	}
  	public ReOrderManagerReorderArticles_ObserveeProxi copy(ReOrderManagerReorderArticles owner) throws PersistenceException {
  		ReOrderManagerReorderArticles_ObserveeProxi result = new ReOrderManagerReorderArticles_ObserveeProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<ReOrderQuantifiedArticle4Public> entries = (this.list == null ? new java.util.Vector<ReOrderQuantifiedArticle4Public>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			ReOrderQuantifiedArticle4Public current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theReOrderManagerReorderArticlesFacade
            	           .observeeAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
