package persistence;

import model.*;

public class OrderQuantifiedArticleMarkedForReturnStateFacade{



	public OrderQuantifiedArticleMarkedForReturnStateFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOrderQuantifiedArticleMarkedForReturnState newOrderQuantifiedArticleMarkedForReturnState(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOrderQuantifiedArticleMarkedForReturnState)PersistentProxi.createProxi(idCreateIfLessZero, 355);
        long id = ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticleStateFacade.getNextId();
        OrderQuantifiedArticleMarkedForReturnState result = new OrderQuantifiedArticleMarkedForReturnState(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderQuantifiedArticleMarkedForReturnState)PersistentProxi.createProxi(id, 355);
    }
    
    public PersistentOrderQuantifiedArticleMarkedForReturnState newDelayedOrderQuantifiedArticleMarkedForReturnState() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticleStateFacade.getNextId();
        OrderQuantifiedArticleMarkedForReturnState result = new OrderQuantifiedArticleMarkedForReturnState(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderQuantifiedArticleMarkedForReturnState)PersistentProxi.createProxi(id, 355);
    }
    
    public OrderQuantifiedArticleMarkedForReturnState getOrderQuantifiedArticleMarkedForReturnState(long OrderQuantifiedArticleMarkedForReturnStateId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

