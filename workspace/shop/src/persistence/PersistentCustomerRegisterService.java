package persistence;


public interface PersistentCustomerRegisterService extends PersistentService, CustomerRegisterService4Public {
    
    public PersistentCustomerRegisterService getThis() throws PersistenceException ;
    
    

}

