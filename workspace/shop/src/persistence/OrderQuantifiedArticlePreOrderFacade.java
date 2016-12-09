package persistence;

import model.*;

public class OrderQuantifiedArticlePreOrderFacade{



	public OrderQuantifiedArticlePreOrderFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOrderQuantifiedArticlePreOrder newOrderQuantifiedArticlePreOrder(long leftQuantity,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOrderQuantifiedArticlePreOrder)PersistentProxi.createProxi(idCreateIfLessZero, 451);
        long id = ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticleStateFacade.getNextId();
        OrderQuantifiedArticlePreOrder result = new OrderQuantifiedArticlePreOrder(null,null,leftQuantity,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderQuantifiedArticlePreOrder)PersistentProxi.createProxi(id, 451);
    }
    
    public PersistentOrderQuantifiedArticlePreOrder newDelayedOrderQuantifiedArticlePreOrder(long leftQuantity) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticleStateFacade.getNextId();
        OrderQuantifiedArticlePreOrder result = new OrderQuantifiedArticlePreOrder(null,null,leftQuantity,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderQuantifiedArticlePreOrder)PersistentProxi.createProxi(id, 451);
    }
    
    public OrderQuantifiedArticlePreOrder getOrderQuantifiedArticlePreOrder(long OrderQuantifiedArticlePreOrderId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void leftQuantitySet(long OrderQuantifiedArticlePreOrderId, long leftQuantityVal) throws PersistenceException {
        
    }

}

