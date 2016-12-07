package persistence;

import model.*;

public class CustomerServiceOrderManagerFacade{

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

	

	public CustomerServiceOrderManagerFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCustomerServiceOrderManager newCustomerServiceOrderManager(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCustomerServiceOrderManager)PersistentProxi.createProxi(idCreateIfLessZero, 375);
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerServiceOrderManagerFacade.getNextId();
        CustomerServiceOrderManager result = new CustomerServiceOrderManager(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerServiceOrderManager)PersistentProxi.createProxi(id, 375);
    }
    
    public PersistentCustomerServiceOrderManager newDelayedCustomerServiceOrderManager() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerServiceOrderManagerFacade.getNextId();
        CustomerServiceOrderManager result = new CustomerServiceOrderManager(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerServiceOrderManager)PersistentProxi.createProxi(id, 375);
    }
    
    public CustomerServiceOrderManager getCustomerServiceOrderManager(long CustomerServiceOrderManagerId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 375)) return 375;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long CustomerServiceOrderManagerId, CustomerService4Public observerVal) throws PersistenceException {
        
    }
    public void observeeSet(long CustomerServiceOrderManagerId, CustomerOrderManager4Public observeeVal) throws PersistenceException {
        
    }
    public void ThisSet(long CustomerServiceOrderManagerId, CustomerServiceOrderManager4Public ThisVal) throws PersistenceException {
        
    }

}

