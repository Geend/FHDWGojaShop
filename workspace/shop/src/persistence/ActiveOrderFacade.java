package persistence;

import model.*;

public class ActiveOrderFacade{



	public ActiveOrderFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentActiveOrder newActiveOrder(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentActiveOrder)PersistentProxi.createProxi(idCreateIfLessZero, 311);
        long id = ConnectionHandler.getTheConnectionHandler().theOrderStateFacade.getNextId();
        ActiveOrder result = new ActiveOrder(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentActiveOrder)PersistentProxi.createProxi(id, 311);
    }
    
    public PersistentActiveOrder newDelayedActiveOrder() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderStateFacade.getNextId();
        ActiveOrder result = new ActiveOrder(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentActiveOrder)PersistentProxi.createProxi(id, 311);
    }
    
    public ActiveOrder getActiveOrder(long ActiveOrderId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

