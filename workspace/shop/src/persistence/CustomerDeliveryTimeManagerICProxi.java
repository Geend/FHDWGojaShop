package persistence;



import model.visitor.*;

public class CustomerDeliveryTimeManagerICProxi extends PersistentInCacheProxiOptimistic implements PersistentCustomerDeliveryTimeManager{
    
    public CustomerDeliveryTimeManagerICProxi(long objectId) {
        super(objectId);
    }
    public CustomerDeliveryTimeManagerICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeManagerFacade
            .getCustomerDeliveryTimeManager(this.getId());
    }
    
    public long getClassId() {
        return 296;
    }
    
    public CustomerDeliveryTimeManager_CustomerDeliveryTimesProxi getCustomerDeliveryTimes() throws PersistenceException {
        return ((PersistentCustomerDeliveryTimeManager)this.getTheObject()).getCustomerDeliveryTimes();
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentCustomerDeliveryTimeManager)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentCustomerDeliveryTimeManager)this.getTheObject()).setSubService(newValue);
    }
    public PersistentCustomerDeliveryTimeManager getThis() throws PersistenceException {
        return ((PersistentCustomerDeliveryTimeManager)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerDeliveryTimeManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerDeliveryTimeManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerDeliveryTimeManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerDeliveryTimeManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerDeliveryTimeManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerDeliveryTimeManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerDeliveryTimeManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerDeliveryTimeManager(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCustomerDeliveryTimeManager)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentCustomerDeliveryTimeManager)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCustomerDeliveryTimeManager)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCustomerDeliveryTimeManager)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentCustomerDeliveryTimeManager)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public CustomerDeliveryTime4Public createCustomerDeliveryTime(final String name, final common.Fraction price, final long time) 
				throws model.DoubleDefinitionException, PersistenceException{
        return ((PersistentCustomerDeliveryTimeManager)this.getTheObject()).createCustomerDeliveryTime(name, price, time);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentCustomerDeliveryTimeManager)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentCustomerDeliveryTimeManager)this.getTheObject()).initializeOnInstantiation();
    }

    
}
