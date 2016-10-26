package persistence;

import model.*;

public class OrderQuantifiedArticleFacade{



	public OrderQuantifiedArticleFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOrderQuantifiedArticle newOrderQuantifiedArticle(long quantity,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOrderQuantifiedArticle)PersistentProxi.createProxi(idCreateIfLessZero, 148);
        long id = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticleFacade.getNextId();
        OrderQuantifiedArticle result = new OrderQuantifiedArticle(quantity,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderQuantifiedArticle)PersistentProxi.createProxi(id, 148);
    }
    
    public PersistentOrderQuantifiedArticle newDelayedOrderQuantifiedArticle(long quantity) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticleFacade.getNextId();
        OrderQuantifiedArticle result = new OrderQuantifiedArticle(quantity,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderQuantifiedArticle)PersistentProxi.createProxi(id, 148);
    }
    
    public OrderQuantifiedArticle getOrderQuantifiedArticle(long OrderQuantifiedArticleId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void articleSet(long OrderQuantifiedArticleId, PersistentOrderArticleWrapper articleVal) throws PersistenceException {
        
    }

}

