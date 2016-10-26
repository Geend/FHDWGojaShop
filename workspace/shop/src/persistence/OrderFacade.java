package persistence;

import model.*;

public class OrderFacade{



	public OrderFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOrder newOrder(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOrder)PersistentProxi.createProxi(idCreateIfLessZero, 147);
        long id = ConnectionHandler.getTheConnectionHandler().theAbstractOrderFacade.getNextId();
        Order result = new Order(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrder)PersistentProxi.createProxi(id, 147);
    }
    
    public PersistentOrder newDelayedOrder() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theAbstractOrderFacade.getNextId();
        Order result = new Order(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrder)PersistentProxi.createProxi(id, 147);
    }
    
    public Order getOrder(long OrderId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

