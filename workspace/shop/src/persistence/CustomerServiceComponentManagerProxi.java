package persistence;



import model.visitor.*;

public class CustomerServiceComponentManagerProxi extends PersistentProxi implements PersistentCustomerServiceComponentManager{
    
    public CustomerServiceComponentManagerProxi(long objectId) {
        super(objectId);
    }
    public CustomerServiceComponentManagerProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 399;
    }
    
    public CustomerService4Public getObserver() throws PersistenceException {
        return ((PersistentCustomerServiceComponentManager)this.getTheObject()).getObserver();
    }
    public void setObserver(CustomerService4Public newValue) throws PersistenceException {
        ((PersistentCustomerServiceComponentManager)this.getTheObject()).setObserver(newValue);
    }
    public ComponentManager4Public getObservee() throws PersistenceException {
        return ((PersistentCustomerServiceComponentManager)this.getTheObject()).getObservee();
    }
    public void setObservee(ComponentManager4Public newValue) throws PersistenceException {
        ((PersistentCustomerServiceComponentManager)this.getTheObject()).setObservee(newValue);
    }
    public PersistentCustomerServiceComponentManager getThis() throws PersistenceException {
        return ((PersistentCustomerServiceComponentManager)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerServiceComponentManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerServiceComponentManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerServiceComponentManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerServiceComponentManager(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerServiceComponentManager(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerServiceComponentManager(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerServiceComponentManager(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerServiceComponentManager(this);
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCustomerServiceComponentManager)this.getTheObject()).update(event);
    }

    
}
