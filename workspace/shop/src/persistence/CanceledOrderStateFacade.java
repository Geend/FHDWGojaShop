package persistence;

import model.*;

public class CanceledOrderStateFacade{



	public CanceledOrderStateFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCanceledOrderState newCanceledOrderState(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCanceledOrderState)PersistentProxi.createProxi(idCreateIfLessZero, 456);
        long id = ConnectionHandler.getTheConnectionHandler().theOrderStatusFacade.getNextId();
        CanceledOrderState result = new CanceledOrderState(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCanceledOrderState)PersistentProxi.createProxi(id, 456);
    }
    
    public PersistentCanceledOrderState newDelayedCanceledOrderState() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderStatusFacade.getNextId();
        CanceledOrderState result = new CanceledOrderState(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCanceledOrderState)PersistentProxi.createProxi(id, 456);
    }
    
    public CanceledOrderState getCanceledOrderState(long CanceledOrderStateId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

