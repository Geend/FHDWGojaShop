package persistence;

import model.*;

import java.util.Iterator;

public class ShoppingCart_ArticlesProxi extends PersistentListProxi<PersistentShoppingCartQuantifiedArticle> {

  	private ShoppingCartQuantifiedArticleList list;
  	private ShoppingCart owner;

  	public ShoppingCart_ArticlesProxi(ShoppingCart owner) {
    	this.owner = owner;
  	}
  	public ShoppingCartQuantifiedArticleList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new ShoppingCartQuantifiedArticleList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theShoppingCartFacade.articlesGet(this.owner.getId());
      		}
      		this.data = this.list.data;
    	}
    	return this.list;
  	}
  	public Iterator<PersistentShoppingCartQuantifiedArticle> iterator() throws PersistenceException{
    	return this.getList().iterator(this);
  	}
  	public long getLength() throws PersistenceException{
	  	return this.getList().getLength();
  	}
  	public void add(PersistentShoppingCartQuantifiedArticle entry) throws PersistenceException {
    	if (entry != null) {
      		ShoppingCartQuantifiedArticleList list = this.getList();
      		long entryId = 0;
      		if (!this.owner.isDelayed$Persistence()) {
        		entry.store();  	
        		entryId = ConnectionHandler.getTheConnectionHandler().theShoppingCartFacade
        	               	.articlesAdd(owner.getId(), entry);
      		}
      		list.add((PersistentShoppingCartQuantifiedArticle)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theShoppingCartFacade.articlesRem(entry.getListEntryId());
    	}
    	
  	}
  	public ShoppingCart_ArticlesProxi copy(ShoppingCart owner) throws PersistenceException {
  		ShoppingCart_ArticlesProxi result = new ShoppingCart_ArticlesProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<PersistentShoppingCartQuantifiedArticle> entries = (this.list == null ? new java.util.Vector<PersistentShoppingCartQuantifiedArticle>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			PersistentShoppingCartQuantifiedArticle current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theShoppingCartFacade
            	           .articlesAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
