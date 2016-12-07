package persistence;

import model.*;

public class ProcessingOrderStateFacade{



	public ProcessingOrderStateFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentProcessingOrderState newProcessingOrderState(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentProcessingOrderState)PersistentProxi.createProxi(idCreateIfLessZero, 335);
        long id = ConnectionHandler.getTheConnectionHandler().theOrderStatusFacade.getNextId();
        ProcessingOrderState result = new ProcessingOrderState(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentProcessingOrderState)PersistentProxi.createProxi(id, 335);
    }
    
    public PersistentProcessingOrderState newDelayedProcessingOrderState() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderStatusFacade.getNextId();
        ProcessingOrderState result = new ProcessingOrderState(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentProcessingOrderState)PersistentProxi.createProxi(id, 335);
    }
    
    public ProcessingOrderState getProcessingOrderState(long ProcessingOrderStateId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

