package persistence;

import model.*;

import java.util.Iterator;

public class CustomerArticleLst_ArticlesProxi extends PersistentListProxi<ArticleWrapper4Public> {

  	private ArticleWrapperList list;
  	private CustomerArticleLst owner;

  	public CustomerArticleLst_ArticlesProxi(CustomerArticleLst owner) {
    	this.owner = owner;
  	}
  	public ArticleWrapperList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new ArticleWrapperList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theCustomerArticleLstFacade.articlesGet(this.owner.getId());
      		}
      		this.data = this.list.data;
    	}
    	return this.list;
  	}
  	public Iterator<ArticleWrapper4Public> iterator() throws PersistenceException{
    	return this.getList().iterator(this);
  	}
  	public long getLength() throws PersistenceException{
	  	return this.getList().getLength();
  	}
  	public void add(ArticleWrapper4Public entry) throws PersistenceException {
    	if (entry != null) {
      		ArticleWrapperList list = this.getList();
      		long entryId = 0;
      		if (!this.owner.isDelayed$Persistence()) {
        		entry.store();  	
        		entryId = ConnectionHandler.getTheConnectionHandler().theCustomerArticleLstFacade
        	               	.articlesAdd(owner.getId(), entry);
      		}
      		list.add((ArticleWrapper4Public)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theCustomerArticleLstFacade.articlesRem(entry.getListEntryId());
    	}
    	
  	}
  	public CustomerArticleLst_ArticlesProxi copy(CustomerArticleLst owner) throws PersistenceException {
  		CustomerArticleLst_ArticlesProxi result = new CustomerArticleLst_ArticlesProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<ArticleWrapper4Public> entries = (this.list == null ? new java.util.Vector<ArticleWrapper4Public>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			ArticleWrapper4Public current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theCustomerArticleLstFacade
            	           .articlesAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
