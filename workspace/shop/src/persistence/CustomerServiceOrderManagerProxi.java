package persistence;



import model.visitor.*;

public class CustomerServiceOrderManagerProxi extends PersistentProxi implements PersistentCustomerServiceOrderManager{
    
    public CustomerServiceOrderManagerProxi(long objectId) {
        super(objectId);
    }
    public CustomerServiceOrderManagerProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 375;
    }
    
    public CustomerService4Public getObserver() throws PersistenceException {
        return ((PersistentCustomerServiceOrderManager)this.getTheObject()).getObserver();
    }
    public void setObserver(CustomerService4Public newValue) throws PersistenceException {
        ((PersistentCustomerServiceOrderManager)this.getTheObject()).setObserver(newValue);
    }
    public CustomerOrderManager4Public getObservee() throws PersistenceException {
        return ((PersistentCustomerServiceOrderManager)this.getTheObject()).getObservee();
    }
    public void setObservee(CustomerOrderManager4Public newValue) throws PersistenceException {
        ((PersistentCustomerServiceOrderManager)this.getTheObject()).setObservee(newValue);
    }
    public PersistentCustomerServiceOrderManager getThis() throws PersistenceException {
        return ((PersistentCustomerServiceOrderManager)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerServiceOrderManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerServiceOrderManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerServiceOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerServiceOrderManager(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerServiceOrderManager(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerServiceOrderManager(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerServiceOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerServiceOrderManager(this);
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCustomerServiceOrderManager)this.getTheObject()).update(event);
    }

    
}
