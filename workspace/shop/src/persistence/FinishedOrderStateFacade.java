package persistence;

import model.*;

public class FinishedOrderStateFacade{



	public FinishedOrderStateFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentFinishedOrderState newFinishedOrderState(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentFinishedOrderState)PersistentProxi.createProxi(idCreateIfLessZero, 338);
        long id = ConnectionHandler.getTheConnectionHandler().theOrderStatusFacade.getNextId();
        FinishedOrderState result = new FinishedOrderState(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentFinishedOrderState)PersistentProxi.createProxi(id, 338);
    }
    
    public PersistentFinishedOrderState newDelayedFinishedOrderState() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderStatusFacade.getNextId();
        FinishedOrderState result = new FinishedOrderState(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentFinishedOrderState)PersistentProxi.createProxi(id, 338);
    }
    
    public FinishedOrderState getFinishedOrderState(long FinishedOrderStateId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

