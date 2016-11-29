package persistence;

import model.*;

public class PreOrderFacade{



	public PreOrderFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentPreOrder newPreOrder(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentPreOrder)PersistentProxi.createProxi(idCreateIfLessZero, 233);
        long id = ConnectionHandler.getTheConnectionHandler().theOrderStateFacade.getNextId();
        PreOrder result = new PreOrder(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentPreOrder)PersistentProxi.createProxi(id, 233);
    }
    
    public PersistentPreOrder newDelayedPreOrder() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderStateFacade.getNextId();
        PreOrder result = new PreOrder(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentPreOrder)PersistentProxi.createProxi(id, 233);
    }
    
    public PreOrder getPreOrder(long PreOrderId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

