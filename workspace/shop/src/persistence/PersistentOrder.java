package persistence;


public interface PersistentOrder extends Anything, SubjInterface, AbstractPersistentProxi, Order4Public {
    
    public CustomerDeliveryTime4Public getCustomerDeliveryTime() throws PersistenceException ;
    public void setCustomerDeliveryTime(CustomerDeliveryTime4Public newValue) throws PersistenceException ;
    public void setTotalPrice(common.Fraction newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentOrder getThis() throws PersistenceException ;
    
    

}

