package persistence;


public interface PersistentOwnerService extends PersistentService, OwnerService4Public {
    
    public void setShop(OwnerServiceShop4Public newValue) throws PersistenceException ;
    public ComponentManager4Public getComponentManager() throws PersistenceException ;
    public void setComponentManager(ComponentManager4Public newValue) throws PersistenceException ;
    public ProducerLst4Public getPrmanager() throws PersistenceException ;
    public void setPrmanager(ProducerLst4Public newValue) throws PersistenceException ;
    public CustomerDeliveryTimeManager4Public getCustomerDeliveryTimeManager() throws PersistenceException ;
    public void setCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public newValue) throws PersistenceException ;
    public Settings4Public getSettings() throws PersistenceException ;
    public void setSettings(Settings4Public newValue) throws PersistenceException ;
    public void setReOrderManager(OwnerServiceReOrderManager4Public newValue) throws PersistenceException ;
    public void setOrderManager(OwnerServiceOrderManager4Public newValue) throws PersistenceException ;
    public ReturnManager4Public getReturnManager() throws PersistenceException ;
    public void setReturnManager(ReturnManager4Public newValue) throws PersistenceException ;
    public GlobalOrderArchive4Public getOrderArchive() throws PersistenceException ;
    public void setOrderArchive(GlobalOrderArchive4Public newValue) throws PersistenceException ;
    public PersistentOwnerService getThis() throws PersistenceException ;
    
    
    public GlobalOrderManager4Public getOrderManager() 
				throws PersistenceException;
    public ReOrderManager4Public getReOrderManager() 
				throws PersistenceException;
    public Shop4Public getShop() 
				throws PersistenceException;
    public void setOrderManager(final GlobalOrderManager4Public orderManager) 
				throws PersistenceException;
    public void setReOrderManager(final ReOrderManager4Public reOrderManager) 
				throws PersistenceException;
    public void setShop(final Shop4Public shop) 
				throws PersistenceException;
    public void orderManager_update(final model.meta.GlobalOrderManagerMssgs event) 
				throws PersistenceException;
    public void reOrderManager_update(final model.meta.ReOrderManagerMssgs event) 
				throws PersistenceException;
    public void shop_update(final model.meta.ShopMssgs event) 
				throws PersistenceException;

}

