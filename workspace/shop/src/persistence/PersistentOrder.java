package persistence;


public interface PersistentOrder extends Anything, SubjInterface, AbstractPersistentProxi, Order4Public {
    
    public void setCustomerDeliveryTime(CustomerDeliveryTime4Public newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentOrder getThis() throws PersistenceException ;
    
    
    public ArticleReturn4Public getMyOrder() 
				throws PersistenceException;

}

