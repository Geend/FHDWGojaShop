package persistence;

import model.*;

public class OrderArticleWrapperFacade{



	public OrderArticleWrapperFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOrderArticleWrapper newOrderArticleWrapper(common.Fraction priceAtOrder,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOrderArticleWrapper)PersistentProxi.createProxi(idCreateIfLessZero, 167);
        long id = ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade.getNextId();
        OrderArticleWrapper result = new OrderArticleWrapper(null,null,priceAtOrder,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderArticleWrapper)PersistentProxi.createProxi(id, 167);
    }
    
    public PersistentOrderArticleWrapper newDelayedOrderArticleWrapper(common.Fraction priceAtOrder) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade.getNextId();
        OrderArticleWrapper result = new OrderArticleWrapper(null,null,priceAtOrder,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderArticleWrapper)PersistentProxi.createProxi(id, 167);
    }
    
    public OrderArticleWrapper getOrderArticleWrapper(long OrderArticleWrapperId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void priceAtOrderSet(long OrderArticleWrapperId, common.Fraction priceAtOrderVal) throws PersistenceException {
        
    }

}

