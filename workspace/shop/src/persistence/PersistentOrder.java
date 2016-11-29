package persistence;


public interface PersistentOrder extends Anything, SubjInterface, AbstractPersistentProxi, Order4Public {
    
    public Order_ArticlesProxi getArticles() throws PersistenceException ;
    public CustomerDeliveryTime4Public getCustomerDeliveryTime() throws PersistenceException ;
    public void setCustomerDeliveryTime(CustomerDeliveryTime4Public newValue) throws PersistenceException ;
    public OrderState4Public getState() throws PersistenceException ;
    public void setState(OrderState4Public newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentOrder getThis() throws PersistenceException ;
    
    

}

