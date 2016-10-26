package persistence;


public interface PersistentAbstractOrder extends Anything, AbstractPersistentProxi, AbstractOrder4Public {
    
    public AbstractOrder_ArticlesProxi getArticles() throws PersistenceException ;
    public PersistentCustomerDeliveryTime getCustomerDeliveryTime() throws PersistenceException ;
    public void setCustomerDeliveryTime(PersistentCustomerDeliveryTime newValue) throws PersistenceException ;
    public abstract PersistentAbstractOrder getThis() throws PersistenceException ;
    
    

}

