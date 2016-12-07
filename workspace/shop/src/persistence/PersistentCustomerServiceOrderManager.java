package persistence;


public interface PersistentCustomerServiceOrderManager extends Anything, ObsInterface, AbstractPersistentProxi, CustomerServiceOrderManager4Public {
    
    public CustomerService4Public getObserver() throws PersistenceException ;
    public void setObserver(CustomerService4Public newValue) throws PersistenceException ;
    public CustomerOrderManager4Public getObservee() throws PersistenceException ;
    public void setObservee(CustomerOrderManager4Public newValue) throws PersistenceException ;
    public PersistentCustomerServiceOrderManager getThis() throws PersistenceException ;
    
    

}

