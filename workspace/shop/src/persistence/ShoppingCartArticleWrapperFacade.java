package persistence;

import model.*;

public class ShoppingCartArticleWrapperFacade{



	public ShoppingCartArticleWrapperFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentShoppingCartArticleWrapper newShoppingCartArticleWrapper(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentShoppingCartArticleWrapper)PersistentProxi.createProxi(idCreateIfLessZero, 163);
        long id = ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade.getNextId();
        ShoppingCartArticleWrapper result = new ShoppingCartArticleWrapper(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentShoppingCartArticleWrapper)PersistentProxi.createProxi(id, 163);
    }
    
    public PersistentShoppingCartArticleWrapper newDelayedShoppingCartArticleWrapper() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade.getNextId();
        ShoppingCartArticleWrapper result = new ShoppingCartArticleWrapper(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentShoppingCartArticleWrapper)PersistentProxi.createProxi(id, 163);
    }
    
    public ShoppingCartArticleWrapper getShoppingCartArticleWrapper(long ShoppingCartArticleWrapperId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

