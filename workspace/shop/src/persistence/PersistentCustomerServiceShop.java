package persistence;


public interface PersistentCustomerServiceShop extends Anything, ObsInterface, AbstractPersistentProxi, CustomerServiceShop4Public {
    
    public CustomerService4Public getObserver() throws PersistenceException ;
    public void setObserver(CustomerService4Public newValue) throws PersistenceException ;
    public Shop4Public getObservee() throws PersistenceException ;
    public void setObservee(Shop4Public newValue) throws PersistenceException ;
    public PersistentCustomerServiceShop getThis() throws PersistenceException ;
    
    

}

