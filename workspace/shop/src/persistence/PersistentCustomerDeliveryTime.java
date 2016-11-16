package persistence;


public interface PersistentCustomerDeliveryTime extends Anything, SubjInterface, AbstractPersistentProxi, CustomerDeliveryTime4Public {
    
    public common.Fraction getPrice() throws PersistenceException ;
    public void setPrice(common.Fraction newValue) throws PersistenceException ;
    public long getDeliveryTime() throws PersistenceException ;
    public void setDeliveryTime(long newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentCustomerDeliveryTime getThis() throws PersistenceException ;
    
    

}

