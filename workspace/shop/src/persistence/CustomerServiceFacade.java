package persistence;

import model.*;

public class CustomerServiceFacade{



	public CustomerServiceFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCustomerService newCustomerService(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCustomerService)PersistentProxi.createProxi(idCreateIfLessZero, -278);
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        CustomerService result = new CustomerService(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerService)PersistentProxi.createProxi(id, -278);
    }
    
    public PersistentCustomerService newDelayedCustomerService() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        CustomerService result = new CustomerService(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerService)PersistentProxi.createProxi(id, -278);
    }
    
    public CustomerService getCustomerService(long CustomerServiceId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void cartSet(long CustomerServiceId, ShoppingCart4Public cartVal) throws PersistenceException {
        
    }

}

