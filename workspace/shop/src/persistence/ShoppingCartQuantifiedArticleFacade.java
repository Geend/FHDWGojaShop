package persistence;

import model.*;

public class ShoppingCartQuantifiedArticleFacade{



	public ShoppingCartQuantifiedArticleFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentShoppingCartQuantifiedArticle newShoppingCartQuantifiedArticle(long quantity,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentShoppingCartQuantifiedArticle)PersistentProxi.createProxi(idCreateIfLessZero, 236);
        long id = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticleFacade.getNextId();
        ShoppingCartQuantifiedArticle result = new ShoppingCartQuantifiedArticle(quantity,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentShoppingCartQuantifiedArticle)PersistentProxi.createProxi(id, 236);
    }
    
    public PersistentShoppingCartQuantifiedArticle newDelayedShoppingCartQuantifiedArticle(long quantity) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticleFacade.getNextId();
        ShoppingCartQuantifiedArticle result = new ShoppingCartQuantifiedArticle(quantity,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentShoppingCartQuantifiedArticle)PersistentProxi.createProxi(id, 236);
    }
    
    public ShoppingCartQuantifiedArticle getShoppingCartQuantifiedArticle(long ShoppingCartQuantifiedArticleId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

