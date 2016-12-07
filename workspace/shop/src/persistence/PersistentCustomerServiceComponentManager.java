package persistence;


public interface PersistentCustomerServiceComponentManager extends Anything, ObsInterface, AbstractPersistentProxi, CustomerServiceComponentManager4Public {
    
    public CustomerService4Public getObserver() throws PersistenceException ;
    public void setObserver(CustomerService4Public newValue) throws PersistenceException ;
    public ComponentManager4Public getObservee() throws PersistenceException ;
    public void setObservee(ComponentManager4Public newValue) throws PersistenceException ;
    public PersistentCustomerServiceComponentManager getThis() throws PersistenceException ;
    
    

}

