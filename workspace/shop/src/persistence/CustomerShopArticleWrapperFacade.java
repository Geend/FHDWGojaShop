package persistence;

import model.*;

public class CustomerShopArticleWrapperFacade{



	public CustomerShopArticleWrapperFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCustomerShopArticleWrapper newCustomerShopArticleWrapper(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCustomerShopArticleWrapper)PersistentProxi.createProxi(idCreateIfLessZero, 298);
        long id = ConnectionHandler.getTheConnectionHandler().theComponentWrapperFacade.getNextId();
        CustomerShopArticleWrapper result = new CustomerShopArticleWrapper(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerShopArticleWrapper)PersistentProxi.createProxi(id, 298);
    }
    
    public PersistentCustomerShopArticleWrapper newDelayedCustomerShopArticleWrapper() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theComponentWrapperFacade.getNextId();
        CustomerShopArticleWrapper result = new CustomerShopArticleWrapper(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerShopArticleWrapper)PersistentProxi.createProxi(id, 298);
    }
    
    public CustomerShopArticleWrapper getCustomerShopArticleWrapper(long CustomerShopArticleWrapperId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

