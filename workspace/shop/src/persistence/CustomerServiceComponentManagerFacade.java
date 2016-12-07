package persistence;

import model.*;

public class CustomerServiceComponentManagerFacade{

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

	

	public CustomerServiceComponentManagerFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCustomerServiceComponentManager newCustomerServiceComponentManager(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCustomerServiceComponentManager)PersistentProxi.createProxi(idCreateIfLessZero, 380);
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerServiceComponentManagerFacade.getNextId();
        CustomerServiceComponentManager result = new CustomerServiceComponentManager(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerServiceComponentManager)PersistentProxi.createProxi(id, 380);
    }
    
    public PersistentCustomerServiceComponentManager newDelayedCustomerServiceComponentManager() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerServiceComponentManagerFacade.getNextId();
        CustomerServiceComponentManager result = new CustomerServiceComponentManager(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerServiceComponentManager)PersistentProxi.createProxi(id, 380);
    }
    
    public CustomerServiceComponentManager getCustomerServiceComponentManager(long CustomerServiceComponentManagerId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 380)) return 380;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long CustomerServiceComponentManagerId, CustomerService4Public observerVal) throws PersistenceException {
        
    }
    public void observeeSet(long CustomerServiceComponentManagerId, ComponentManager4Public observeeVal) throws PersistenceException {
        
    }
    public void ThisSet(long CustomerServiceComponentManagerId, CustomerServiceComponentManager4Public ThisVal) throws PersistenceException {
        
    }

}

