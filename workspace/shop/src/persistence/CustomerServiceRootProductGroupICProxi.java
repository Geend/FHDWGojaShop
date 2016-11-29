package persistence;



import model.visitor.*;

public class CustomerServiceRootProductGroupICProxi extends PersistentInCacheProxiOptimistic implements PersistentCustomerServiceRootProductGroup{
    
    public CustomerServiceRootProductGroupICProxi(long objectId) {
        super(objectId);
    }
    public CustomerServiceRootProductGroupICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCustomerServiceRootProductGroupFacade
            .getCustomerServiceRootProductGroup(this.getId());
    }
    
    public long getClassId() {
        return 322;
    }
    
    public CustomerService4Public getObserver() throws PersistenceException {
        return ((PersistentCustomerServiceRootProductGroup)this.getTheObject()).getObserver();
    }
    public void setObserver(CustomerService4Public newValue) throws PersistenceException {
        ((PersistentCustomerServiceRootProductGroup)this.getTheObject()).setObserver(newValue);
    }
    public RootProductGroup4Public getObservee() throws PersistenceException {
        return ((PersistentCustomerServiceRootProductGroup)this.getTheObject()).getObservee();
    }
    public void setObservee(RootProductGroup4Public newValue) throws PersistenceException {
        ((PersistentCustomerServiceRootProductGroup)this.getTheObject()).setObservee(newValue);
    }
    public PersistentCustomerServiceRootProductGroup getThis() throws PersistenceException {
        return ((PersistentCustomerServiceRootProductGroup)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerServiceRootProductGroup(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerServiceRootProductGroup(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerServiceRootProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerServiceRootProductGroup(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerServiceRootProductGroup(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerServiceRootProductGroup(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerServiceRootProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerServiceRootProductGroup(this);
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCustomerServiceRootProductGroup)this.getTheObject()).update(event);
    }

    
}
