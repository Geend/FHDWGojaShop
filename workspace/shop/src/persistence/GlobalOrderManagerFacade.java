package persistence;

import model.*;

public class GlobalOrderManagerFacade{



	public GlobalOrderManagerFacade() {
	}

    public PersistentGlobalOrderManager getTheGlobalOrderManager() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade.getNextId();
        GlobalOrderManager result = new GlobalOrderManager(null, null, null, id);
        PersistentInCacheProxi cached = Cache.getTheCache().putSingleton(result);
        return (PersistentGlobalOrderManager)PersistentProxi.createProxi(cached.getId()  * (cached.getTheObject().isTheSameAs(result) ? -1 : 1), 343);
    }
    
    public GlobalOrderManager getGlobalOrderManager(long GlobalOrderManagerId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void myCONCBackgroundTaskSet(long GlobalOrderManagerId, BackgroundTask4Public myCONCBackgroundTaskVal) throws PersistenceException {
        
    }

}

