package persistence;

import model.*;

public class OrderQuantifiedArticleFacade{



	public OrderQuantifiedArticleFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOrderQuantifiedArticle newOrderQuantifiedArticle(long quantity,common.Fraction articlePriceAtOrderTime,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOrderQuantifiedArticle)PersistentProxi.createProxi(idCreateIfLessZero, 232);
        long id = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticleFacade.getNextId();
        OrderQuantifiedArticle result = new OrderQuantifiedArticle(quantity,null,null,null,articlePriceAtOrderTime,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderQuantifiedArticle)PersistentProxi.createProxi(id, 232);
    }
    
    public PersistentOrderQuantifiedArticle newDelayedOrderQuantifiedArticle(long quantity,common.Fraction articlePriceAtOrderTime) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticleFacade.getNextId();
        OrderQuantifiedArticle result = new OrderQuantifiedArticle(quantity,null,null,null,articlePriceAtOrderTime,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderQuantifiedArticle)PersistentProxi.createProxi(id, 232);
    }
    
    public OrderQuantifiedArticle getOrderQuantifiedArticle(long OrderQuantifiedArticleId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void articlePriceAtOrderTimeSet(long OrderQuantifiedArticleId, common.Fraction articlePriceAtOrderTimeVal) throws PersistenceException {
        
    }
    public void stateSet(long OrderQuantifiedArticleId, OrderQuantifiedArticleState4Public stateVal) throws PersistenceException {
        
    }

}

