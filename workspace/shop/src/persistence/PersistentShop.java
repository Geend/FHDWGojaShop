package persistence;


public interface PersistentShop extends Anything, SubjInterface, AbstractPersistentProxi, Shop4Public {
    
    public void setComponentManager(ComponentManager4Public newValue) throws PersistenceException ;
    public void setPrmanager(ProducerLst4Public newValue) throws PersistenceException ;
    public void setCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentShop getThis() throws PersistenceException ;
    
    

}

