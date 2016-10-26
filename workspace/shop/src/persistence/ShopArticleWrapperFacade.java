package persistence;

import model.*;

public class ShopArticleWrapperFacade{



	public ShopArticleWrapperFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentShopArticleWrapper newShopArticleWrapper(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentShopArticleWrapper)PersistentProxi.createProxi(idCreateIfLessZero, 161);
        long id = ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade.getNextId();
        ShopArticleWrapper result = new ShopArticleWrapper(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentShopArticleWrapper)PersistentProxi.createProxi(id, 161);
    }
    
    public PersistentShopArticleWrapper newDelayedShopArticleWrapper() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade.getNextId();
        ShopArticleWrapper result = new ShopArticleWrapper(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentShopArticleWrapper)PersistentProxi.createProxi(id, 161);
    }
    
    public ShopArticleWrapper getShopArticleWrapper(long ShopArticleWrapperId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

