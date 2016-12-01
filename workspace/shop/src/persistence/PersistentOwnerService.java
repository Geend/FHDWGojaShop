package persistence;


public interface PersistentOwnerService extends PersistentService, OwnerService4Public {
    
    public RootProductGroup4Public getRootProductGroup() throws PersistenceException ;
    public void setRootProductGroup(RootProductGroup4Public newValue) throws PersistenceException ;
    public CustomerDeliveryTimeManager4Public getCustomerDeliveryTimeManager() throws PersistenceException ;
    public void setCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public newValue) throws PersistenceException ;
    public ProducerLst4Public getPrmanager() throws PersistenceException ;
    public void setPrmanager(ProducerLst4Public newValue) throws PersistenceException ;
    public Settings4Public getSettings() throws PersistenceException ;
    public void setSettings(Settings4Public newValue) throws PersistenceException ;
    public ReOrderManager4Public getReOrderManager() throws PersistenceException ;
    public void setReOrderManager(ReOrderManager4Public newValue) throws PersistenceException ;
    public OwnerOrderManager4Public getOwnerOrderManager() throws PersistenceException ;
    public void setOwnerOrderManager(OwnerOrderManager4Public newValue) throws PersistenceException ;
    public ReturnManager4Public getReturnManager() throws PersistenceException ;
    public void setReturnManager(ReturnManager4Public newValue) throws PersistenceException ;
    public PersistentOwnerService getThis() throws PersistenceException ;
    
    

}

