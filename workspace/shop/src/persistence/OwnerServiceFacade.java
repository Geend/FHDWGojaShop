package persistence;

import model.*;

public class OwnerServiceFacade{



	public OwnerServiceFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOwnerService newOwnerService(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOwnerService)PersistentProxi.createProxi(idCreateIfLessZero, -276);
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        OwnerService result = new OwnerService(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOwnerService)PersistentProxi.createProxi(id, -276);
    }
    
    public PersistentOwnerService newDelayedOwnerService() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        OwnerService result = new OwnerService(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOwnerService)PersistentProxi.createProxi(id, -276);
    }
    
    public OwnerService getOwnerService(long OwnerServiceId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void prmanagerSet(long OwnerServiceId, ProducerLst4Public prmanagerVal) throws PersistenceException {
        
    }

}

