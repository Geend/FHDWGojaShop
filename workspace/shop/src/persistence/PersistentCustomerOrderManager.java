package persistence;


public interface PersistentCustomerOrderManager extends PersistentOrderManager, CustomerOrderManager4Public {
    
    public CustomerAccount4Public getAccount() throws PersistenceException ;
    public void setAccount(CustomerAccount4Public newValue) throws PersistenceException ;
    public PersistentCustomerOrderManager getThis() throws PersistenceException ;
    
    

}

