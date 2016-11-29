package persistence;

import model.*;

public class CustomerServiceRootProductGroupFacade{

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

	

	public CustomerServiceRootProductGroupFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCustomerServiceRootProductGroup newCustomerServiceRootProductGroup(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCustomerServiceRootProductGroup)PersistentProxi.createProxi(idCreateIfLessZero, 322);
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerServiceRootProductGroupFacade.getNextId();
        CustomerServiceRootProductGroup result = new CustomerServiceRootProductGroup(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerServiceRootProductGroup)PersistentProxi.createProxi(id, 322);
    }
    
    public PersistentCustomerServiceRootProductGroup newDelayedCustomerServiceRootProductGroup() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerServiceRootProductGroupFacade.getNextId();
        CustomerServiceRootProductGroup result = new CustomerServiceRootProductGroup(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerServiceRootProductGroup)PersistentProxi.createProxi(id, 322);
    }
    
    public CustomerServiceRootProductGroup getCustomerServiceRootProductGroup(long CustomerServiceRootProductGroupId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 322)) return 322;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long CustomerServiceRootProductGroupId, CustomerService4Public observerVal) throws PersistenceException {
        
    }
    public void observeeSet(long CustomerServiceRootProductGroupId, RootProductGroup4Public observeeVal) throws PersistenceException {
        
    }
    public void ThisSet(long CustomerServiceRootProductGroupId, CustomerServiceRootProductGroup4Public ThisVal) throws PersistenceException {
        
    }

}

