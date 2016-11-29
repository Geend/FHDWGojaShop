package persistence;

import model.*;

public class FinishedOrderFacade{



	public FinishedOrderFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentFinishedOrder newFinishedOrder(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentFinishedOrder)PersistentProxi.createProxi(idCreateIfLessZero, 310);
        long id = ConnectionHandler.getTheConnectionHandler().theOrderStateFacade.getNextId();
        FinishedOrder result = new FinishedOrder(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentFinishedOrder)PersistentProxi.createProxi(id, 310);
    }
    
    public PersistentFinishedOrder newDelayedFinishedOrder() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderStateFacade.getNextId();
        FinishedOrder result = new FinishedOrder(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentFinishedOrder)PersistentProxi.createProxi(id, 310);
    }
    
    public FinishedOrder getFinishedOrder(long FinishedOrderId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

