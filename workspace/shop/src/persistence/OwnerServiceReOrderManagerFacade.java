package persistence;

import model.*;

public class OwnerServiceReOrderManagerFacade{

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

	

	public OwnerServiceReOrderManagerFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOwnerServiceReOrderManager newOwnerServiceReOrderManager(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOwnerServiceReOrderManager)PersistentProxi.createProxi(idCreateIfLessZero, 442);
        long id = ConnectionHandler.getTheConnectionHandler().theOwnerServiceReOrderManagerFacade.getNextId();
        OwnerServiceReOrderManager result = new OwnerServiceReOrderManager(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOwnerServiceReOrderManager)PersistentProxi.createProxi(id, 442);
    }
    
    public PersistentOwnerServiceReOrderManager newDelayedOwnerServiceReOrderManager() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOwnerServiceReOrderManagerFacade.getNextId();
        OwnerServiceReOrderManager result = new OwnerServiceReOrderManager(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOwnerServiceReOrderManager)PersistentProxi.createProxi(id, 442);
    }
    
    public OwnerServiceReOrderManager getOwnerServiceReOrderManager(long OwnerServiceReOrderManagerId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 442)) return 442;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long OwnerServiceReOrderManagerId, OwnerService4Public observerVal) throws PersistenceException {
        
    }
    public void observeeSet(long OwnerServiceReOrderManagerId, ReOrderManager4Public observeeVal) throws PersistenceException {
        
    }
    public void ThisSet(long OwnerServiceReOrderManagerId, OwnerServiceReOrderManager4Public ThisVal) throws PersistenceException {
        
    }

}

