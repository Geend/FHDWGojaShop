package persistence;

import model.*;

public class PreOrderStateFacade{



	public PreOrderStateFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentPreOrderState newPreOrderState(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentPreOrderState)PersistentProxi.createProxi(idCreateIfLessZero, 337);
        long id = ConnectionHandler.getTheConnectionHandler().theOrderStatusFacade.getNextId();
        PreOrderState result = new PreOrderState(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentPreOrderState)PersistentProxi.createProxi(id, 337);
    }
    
    public PersistentPreOrderState newDelayedPreOrderState() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderStatusFacade.getNextId();
        PreOrderState result = new PreOrderState(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentPreOrderState)PersistentProxi.createProxi(id, 337);
    }
    
    public PreOrderState getPreOrderState(long PreOrderStateId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

