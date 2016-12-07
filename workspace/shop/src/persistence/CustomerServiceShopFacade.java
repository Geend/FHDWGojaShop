package persistence;

import model.*;

public class CustomerServiceShopFacade{

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

	

	public CustomerServiceShopFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCustomerServiceShop newCustomerServiceShop(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCustomerServiceShop)PersistentProxi.createProxi(idCreateIfLessZero, 407);
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerServiceShopFacade.getNextId();
        CustomerServiceShop result = new CustomerServiceShop(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerServiceShop)PersistentProxi.createProxi(id, 407);
    }
    
    public PersistentCustomerServiceShop newDelayedCustomerServiceShop() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerServiceShopFacade.getNextId();
        CustomerServiceShop result = new CustomerServiceShop(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerServiceShop)PersistentProxi.createProxi(id, 407);
    }
    
    public CustomerServiceShop getCustomerServiceShop(long CustomerServiceShopId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 407)) return 407;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long CustomerServiceShopId, CustomerService4Public observerVal) throws PersistenceException {
        
    }
    public void observeeSet(long CustomerServiceShopId, Shop4Public observeeVal) throws PersistenceException {
        
    }
    public void ThisSet(long CustomerServiceShopId, CustomerServiceShop4Public ThisVal) throws PersistenceException {
        
    }

}

