package persistence;


public interface PersistentCustomerService extends PersistentService, CustomerService4Public {
    
    public ShoppingCart4Public getCart() throws PersistenceException ;
    public void setCart(ShoppingCart4Public newValue) throws PersistenceException ;
    public PersistentCustomerService getThis() throws PersistenceException ;
    
    

}

