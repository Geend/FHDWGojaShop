package persistence;


public interface PersistentCustomerServiceRootProductGroup extends Anything, ObsInterface, AbstractPersistentProxi, CustomerServiceRootProductGroup4Public {
    
    public CustomerService4Public getObserver() throws PersistenceException ;
    public void setObserver(CustomerService4Public newValue) throws PersistenceException ;
    public RootProductGroup4Public getObservee() throws PersistenceException ;
    public void setObservee(RootProductGroup4Public newValue) throws PersistenceException ;
    public PersistentCustomerServiceRootProductGroup getThis() throws PersistenceException ;
    
    

}

