package persistence;

import model.*;

import java.util.Iterator;

public class AbstractOrder_ArticlesProxi extends PersistentListProxi<PersistentOrderQuantifiedArticle> {

  	private OrderQuantifiedArticleList list;
  	private AbstractOrder owner;

  	public AbstractOrder_ArticlesProxi(AbstractOrder owner) {
    	this.owner = owner;
  	}
  	public OrderQuantifiedArticleList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new OrderQuantifiedArticleList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theAbstractOrderFacade.articlesGet(this.owner.getId());
      		}
      		this.data = this.list.data;
    	}
    	return this.list;
  	}
  	public Iterator<PersistentOrderQuantifiedArticle> iterator() throws PersistenceException{
    	return this.getList().iterator(this);
  	}
  	public long getLength() throws PersistenceException{
	  	return this.getList().getLength();
  	}
  	public void add(PersistentOrderQuantifiedArticle entry) throws PersistenceException {
    	if (entry != null) {
      		OrderQuantifiedArticleList list = this.getList();
      		long entryId = 0;
      		if (!this.owner.isDelayed$Persistence()) {
        		entry.store();  	
        		entryId = ConnectionHandler.getTheConnectionHandler().theAbstractOrderFacade
        	               	.articlesAdd(owner.getId(), entry);
      		}
      		list.add((PersistentOrderQuantifiedArticle)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theAbstractOrderFacade.articlesRem(entry.getListEntryId());
    	}
    	
  	}
  	public AbstractOrder_ArticlesProxi copy(AbstractOrder owner) throws PersistenceException {
  		AbstractOrder_ArticlesProxi result = new AbstractOrder_ArticlesProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<PersistentOrderQuantifiedArticle> entries = (this.list == null ? new java.util.Vector<PersistentOrderQuantifiedArticle>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			PersistentOrderQuantifiedArticle current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theAbstractOrderFacade
            	           .articlesAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
