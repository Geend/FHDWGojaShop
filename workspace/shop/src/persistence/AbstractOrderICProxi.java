package persistence;



public abstract class AbstractOrderICProxi extends PersistentInCacheProxiOptimistic implements PersistentAbstractOrder{
    
    public AbstractOrderICProxi(long objectId) {
        super(objectId);
    }
    public AbstractOrderICProxi(PersistentObject object) {
        super(object);
    }
    
    
    public PersistentOrderQuantifiedArticle getArticles() throws PersistenceException {
        return ((PersistentAbstractOrder)this.getTheObject()).getArticles();
    }
    public void setArticles(PersistentOrderQuantifiedArticle newValue) throws PersistenceException {
        ((PersistentAbstractOrder)this.getTheObject()).setArticles(newValue);
    }
    public PersistentCustomerDeliveryTime getCustomerDeliveryTime() throws PersistenceException {
        return ((PersistentAbstractOrder)this.getTheObject()).getCustomerDeliveryTime();
    }
    public void setCustomerDeliveryTime(PersistentCustomerDeliveryTime newValue) throws PersistenceException {
        ((PersistentAbstractOrder)this.getTheObject()).setCustomerDeliveryTime(newValue);
    }
    public abstract PersistentAbstractOrder getThis() throws PersistenceException ;
    
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentAbstractOrder)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentAbstractOrder)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentAbstractOrder)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentAbstractOrder)this.getTheObject()).initializeOnInstantiation();
    }

    
}
