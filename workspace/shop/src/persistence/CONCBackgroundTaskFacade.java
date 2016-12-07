package persistence;

import model.*;

public class CONCBackgroundTaskFacade{



	public CONCBackgroundTaskFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCONCBackgroundTask newCONCBackgroundTask(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCONCBackgroundTask)PersistentProxi.createProxi(idCreateIfLessZero, 367);
        long id = ConnectionHandler.getTheConnectionHandler().theBackgroundTaskFacade.getNextId();
        CONCBackgroundTask result = new CONCBackgroundTask(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCONCBackgroundTask)PersistentProxi.createProxi(id, 367);
    }
    
    public PersistentCONCBackgroundTask newDelayedCONCBackgroundTask() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theBackgroundTaskFacade.getNextId();
        CONCBackgroundTask result = new CONCBackgroundTask(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCONCBackgroundTask)PersistentProxi.createProxi(id, 367);
    }
    
    public CONCBackgroundTask getCONCBackgroundTask(long CONCBackgroundTaskId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

