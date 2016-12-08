package persistence;


public interface PersistentCustomerDeliveryTimeManager extends Anything, SubjInterface, AbstractPersistentProxi, CustomerDeliveryTimeManager4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentCustomerDeliveryTimeManager getThis() throws PersistenceException ;
    
    

}

