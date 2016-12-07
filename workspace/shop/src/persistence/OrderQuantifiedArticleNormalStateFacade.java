package persistence;

import model.*;

public class OrderQuantifiedArticleNormalStateFacade{



	public OrderQuantifiedArticleNormalStateFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOrderQuantifiedArticleNormalState newOrderQuantifiedArticleNormalState(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOrderQuantifiedArticleNormalState)PersistentProxi.createProxi(idCreateIfLessZero, 356);
        long id = ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticleStateFacade.getNextId();
        OrderQuantifiedArticleNormalState result = new OrderQuantifiedArticleNormalState(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderQuantifiedArticleNormalState)PersistentProxi.createProxi(id, 356);
    }
    
    public PersistentOrderQuantifiedArticleNormalState newDelayedOrderQuantifiedArticleNormalState() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticleStateFacade.getNextId();
        OrderQuantifiedArticleNormalState result = new OrderQuantifiedArticleNormalState(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderQuantifiedArticleNormalState)PersistentProxi.createProxi(id, 356);
    }
    
    public OrderQuantifiedArticleNormalState getOrderQuantifiedArticleNormalState(long OrderQuantifiedArticleNormalStateId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

