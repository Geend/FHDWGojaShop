package persistence;



public abstract class OrderManagerICProxi extends PersistentInCacheProxiOptimistic implements PersistentOrderManager{
    
    public OrderManagerICProxi(long objectId) {
        super(objectId);
    }
    public OrderManagerICProxi(PersistentObject object) {
        super(object);
    }
    
    
    public OrderManager_OrdersProxi getOrders() throws PersistenceException {
        return ((PersistentOrderManager)this.getTheObject()).getOrders();
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentOrderManager)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentOrderManager)this.getTheObject()).setSubService(newValue);
    }
    public abstract PersistentOrderManager getThis() throws PersistenceException ;
    
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).initializeOnInstantiation();
    }

    
}
