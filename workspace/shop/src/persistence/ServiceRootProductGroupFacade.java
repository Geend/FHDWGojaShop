package persistence;

import model.*;

public class ServiceRootProductGroupFacade{

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

	

	public ServiceRootProductGroupFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentServiceRootProductGroup newServiceRootProductGroup(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentServiceRootProductGroup)PersistentProxi.createProxi(idCreateIfLessZero, 265);
        long id = ConnectionHandler.getTheConnectionHandler().theServiceRootProductGroupFacade.getNextId();
        ServiceRootProductGroup result = new ServiceRootProductGroup(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentServiceRootProductGroup)PersistentProxi.createProxi(id, 265);
    }
    
    public PersistentServiceRootProductGroup newDelayedServiceRootProductGroup() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theServiceRootProductGroupFacade.getNextId();
        ServiceRootProductGroup result = new ServiceRootProductGroup(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentServiceRootProductGroup)PersistentProxi.createProxi(id, 265);
    }
    
    public ServiceRootProductGroup getServiceRootProductGroup(long ServiceRootProductGroupId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 265)) return 265;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long ServiceRootProductGroupId, Service4Public observerVal) throws PersistenceException {
        
    }
    public void observeeSet(long ServiceRootProductGroupId, RootProductGroup4Public observeeVal) throws PersistenceException {
        
    }
    public void ThisSet(long ServiceRootProductGroupId, ServiceRootProductGroup4Public ThisVal) throws PersistenceException {
        
    }

}

