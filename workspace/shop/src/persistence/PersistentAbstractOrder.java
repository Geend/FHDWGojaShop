package persistence;


public interface PersistentAbstractOrder extends Anything, SubjInterface, AbstractPersistentProxi, AbstractOrder4Public {
    
    public AbstractOrder_ArticlesProxi getArticles() throws PersistenceException ;
    public CustomerDeliveryTime4Public getCustomerDeliveryTime() throws PersistenceException ;
    public void setCustomerDeliveryTime(CustomerDeliveryTime4Public newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public abstract PersistentAbstractOrder getThis() throws PersistenceException ;
    
    

}

