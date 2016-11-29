package persistence;

import model.*;

public class CustomerOrderManagerFacade{



	public CustomerOrderManagerFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCustomerOrderManager newCustomerOrderManager(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCustomerOrderManager)PersistentProxi.createProxi(idCreateIfLessZero, 308);
        long id = ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade.getNextId();
        CustomerOrderManager result = new CustomerOrderManager(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerOrderManager)PersistentProxi.createProxi(id, 308);
    }
    
    public PersistentCustomerOrderManager newDelayedCustomerOrderManager() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade.getNextId();
        CustomerOrderManager result = new CustomerOrderManager(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerOrderManager)PersistentProxi.createProxi(id, 308);
    }
    
    public CustomerOrderManager getCustomerOrderManager(long CustomerOrderManagerId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void accountSet(long CustomerOrderManagerId, CustomerAccount4Public accountVal) throws PersistenceException {
        
    }

}

