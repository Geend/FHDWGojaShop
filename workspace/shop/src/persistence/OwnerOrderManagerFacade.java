package persistence;

import model.*;

public class OwnerOrderManagerFacade{



	public OwnerOrderManagerFacade() {
	}

    public PersistentOwnerOrderManager getTheOwnerOrderManager() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade.getNextId();
        OwnerOrderManager result = new OwnerOrderManager(null, null, null, null, id);
        PersistentInCacheProxi cached = Cache.getTheCache().putSingleton(result);
        return (PersistentOwnerOrderManager)PersistentProxi.createProxi(cached.getId()  * (cached.getTheObject().isTheSameAs(result) ? -1 : 1), 343);
    }
    
    public OwnerOrderManager getOwnerOrderManager(long OwnerOrderManagerId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void myCONCBackgroundTaskSet(long OwnerOrderManagerId, BackgroundTask4Public myCONCBackgroundTaskVal) throws PersistenceException {
        
    }

}

