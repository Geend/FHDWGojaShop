package persistence;



public abstract class OrderManagerProxi extends PersistentProxi implements PersistentOrderManager{
    
    public OrderManagerProxi(long objectId) {
        super(objectId);
    }
    public OrderManagerProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public void setOrders(OrderManagerOrders4Public newValue) throws PersistenceException {
        ((PersistentOrderManager)this.getTheObject()).setOrders(newValue);
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
    public OrderManagerOrders4Public getOrders() 
				throws PersistenceException{
        return ((PersistentOrderManager)this.getTheObject()).getOrders();
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
    public void orders_update(final model.meta.OrderMssgs event) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).orders_update(event);
    }

    
}