package persistence;

import model.*;

public class OwnerServiceOrderManagerFacade{

	static private Long sequencer = new Long(0);

	static protected long getTheNextId(){
		long result = -1;
		synchronized (sequencer) { 
			result = sequencer.longValue() + 1;
			sequencer = new Long(result);
		}
		return result;
	}

	protected long getNextId(){
		return getTheNextId();
	}

	

	public OwnerServiceOrderManagerFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOwnerServiceOrderManager newOwnerServiceOrderManager(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOwnerServiceOrderManager)PersistentProxi.createProxi(idCreateIfLessZero, 444);
        long id = ConnectionHandler.getTheConnectionHandler().theOwnerServiceOrderManagerFacade.getNextId();
        OwnerServiceOrderManager result = new OwnerServiceOrderManager(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOwnerServiceOrderManager)PersistentProxi.createProxi(id, 444);
    }
    
    public PersistentOwnerServiceOrderManager newDelayedOwnerServiceOrderManager() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOwnerServiceOrderManagerFacade.getNextId();
        OwnerServiceOrderManager result = new OwnerServiceOrderManager(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOwnerServiceOrderManager)PersistentProxi.createProxi(id, 444);
    }
    
    public OwnerServiceOrderManager getOwnerServiceOrderManager(long OwnerServiceOrderManagerId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 444)) return 444;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long OwnerServiceOrderManagerId, OwnerService4Public observerVal) throws PersistenceException {
        
    }
    public void observeeSet(long OwnerServiceOrderManagerId, GlobalOrderManager4Public observeeVal) throws PersistenceException {
        
    }
    public void ThisSet(long OwnerServiceOrderManagerId, OwnerServiceOrderManager4Public ThisVal) throws PersistenceException {
        
    }

}

