package persistence;



public abstract class AbstractOrderProxi extends PersistentProxi implements PersistentAbstractOrder{
    
    public AbstractOrderProxi(long objectId) {
        super(objectId);
    }
    public AbstractOrderProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public AbstractOrder_ArticlesProxi getArticles() throws PersistenceException {
        return ((PersistentAbstractOrder)this.getTheObject()).getArticles();
    }
    public PersistentCustomerDeliveryTime getCustomerDeliveryTime() throws PersistenceException {
        return ((PersistentAbstractOrder)this.getTheObject()).getCustomerDeliveryTime();
    }
    public void setCustomerDeliveryTime(PersistentCustomerDeliveryTime newValue) throws PersistenceException {
        ((PersistentAbstractOrder)this.getTheObject()).setCustomerDeliveryTime(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentAbstractOrder)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentAbstractOrder)this.getTheObject()).setSubService(newValue);
    }
    public abstract PersistentAbstractOrder getThis() throws PersistenceException ;
    
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentAbstractOrder)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentAbstractOrder)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentAbstractOrder)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentAbstractOrder)this.getTheObject()).updateObservers(event);
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
