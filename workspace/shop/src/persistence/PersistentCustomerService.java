package persistence;


public interface PersistentCustomerService extends PersistentService, CustomerService4Public {
    
    public CustomerArticleLst4Public getArticleLst() throws PersistenceException ;
    public void setArticleLst(CustomerArticleLst4Public newValue) throws PersistenceException ;
    public void setRootProductGroup(CustomerServiceRootProductGroup4Public newValue) throws PersistenceException ;
    public CustomerDeliveryTimeManager4Public getCustomerDeliveryTimeManager() throws PersistenceException ;
    public void setCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public newValue) throws PersistenceException ;
    public CustomerAccount4Public getAccount() throws PersistenceException ;
    public void setAccount(CustomerAccount4Public newValue) throws PersistenceException ;
    public ShoppingCart4Public getCart() throws PersistenceException ;
    public void setCart(ShoppingCart4Public newValue) throws PersistenceException ;
    public CustomerOrderManager4Public getOrderManager() throws PersistenceException ;
    public void setOrderManager(CustomerOrderManager4Public newValue) throws PersistenceException ;
    public PersistentCustomerService getThis() throws PersistenceException ;
    
    
    public RootProductGroup4Public getRootProductGroup() 
				throws PersistenceException;
    public void setRootProductGroup(final RootProductGroup4Public rootProductGroup) 
				throws PersistenceException;
    public void rootProductGroup_update(final model.meta.RootProductGroupMssgs event) 
				throws PersistenceException;

}

