package persistence;



import model.visitor.*;

public class CustomerDeliveryTimeICProxi extends PersistentInCacheProxiOptimistic implements PersistentCustomerDeliveryTime{
    
    public CustomerDeliveryTimeICProxi(long objectId) {
        super(objectId);
    }
    public CustomerDeliveryTimeICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade
            .getCustomerDeliveryTime(this.getId());
    }
    
    public long getClassId() {
        return 150;
    }
    
    public common.Fraction getPrice() throws PersistenceException {
        return ((PersistentCustomerDeliveryTime)this.getTheObject()).getPrice();
    }
    public void setPrice(common.Fraction newValue) throws PersistenceException {
        ((PersistentCustomerDeliveryTime)this.getTheObject()).setPrice(newValue);
    }
    public long getDeliveryTime() throws PersistenceException {
        return ((PersistentCustomerDeliveryTime)this.getTheObject()).getDeliveryTime();
    }
    public void setDeliveryTime(long newValue) throws PersistenceException {
        ((PersistentCustomerDeliveryTime)this.getTheObject()).setDeliveryTime(newValue);
    }
    public PersistentCustomerDeliveryTime getThis() throws PersistenceException {
        return ((PersistentCustomerDeliveryTime)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerDeliveryTime(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerDeliveryTime(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerDeliveryTime(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerDeliveryTime(this);
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentCustomerDeliveryTime)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentCustomerDeliveryTime)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentCustomerDeliveryTime)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentCustomerDeliveryTime)this.getTheObject()).initializeOnInstantiation();
    }

    
}