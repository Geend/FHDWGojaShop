package persistence;

import model.*;

public class CustomerRegisterServiceFacade{



	public CustomerRegisterServiceFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCustomerRegisterService newCustomerRegisterService(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCustomerRegisterService)PersistentProxi.createProxi(idCreateIfLessZero, -225);
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        CustomerRegisterService result = new CustomerRegisterService(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerRegisterService)PersistentProxi.createProxi(id, -225);
    }
    
    public PersistentCustomerRegisterService newDelayedCustomerRegisterService() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        CustomerRegisterService result = new CustomerRegisterService(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerRegisterService)PersistentProxi.createProxi(id, -225);
    }
    
    public CustomerRegisterService getCustomerRegisterService(long CustomerRegisterServiceId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

