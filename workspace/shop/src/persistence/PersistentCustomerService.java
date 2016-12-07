package persistence;


public interface PersistentCustomerService extends PersistentService, CustomerService4Public {
    
    public CustomerArticleLst4Public getArticleLst() throws PersistenceException ;
    public void setArticleLst(CustomerArticleLst4Public newValue) throws PersistenceException ;
    public void setComponentManager(CustomerServiceComponentManager4Public newValue) throws PersistenceException ;
    public CustomerDeliveryTimeManager4Public getCustomerDeliveryTimeManager() throws PersistenceException ;
    public void setCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public newValue) throws PersistenceException ;
    public CustomerAccount4Public getAccount() throws PersistenceException ;
    public void setAccount(CustomerAccount4Public newValue) throws PersistenceException ;
    public ShoppingCart4Public getCart() throws PersistenceException ;
    public void setCart(ShoppingCart4Public newValue) throws PersistenceException ;
    public void setOrderManager(CustomerServiceOrderManager4Public newValue) throws PersistenceException ;
    public PersistentCustomerService getThis() throws PersistenceException ;
    
    
    public ComponentManager4Public getComponentManager() 
				throws PersistenceException;
    public CustomerOrderManager4Public getOrderManager() 
				throws PersistenceException;
    public void setComponentManager(final ComponentManager4Public componentManager) 
				throws PersistenceException;
    public void setOrderManager(final CustomerOrderManager4Public orderManager) 
				throws PersistenceException;
    public void componentManager_update(final model.meta.ComponentManagerMssgs event) 
				throws PersistenceException;
    public void orderManager_update(final model.meta.CustomerOrderManagerMssgs event) 
				throws PersistenceException;

}

