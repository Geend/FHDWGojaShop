package persistence;



import model.visitor.*;

public class OwnerServiceOrderManagerICProxi extends PersistentInCacheProxiOptimistic implements PersistentOwnerServiceOrderManager{
    
    public OwnerServiceOrderManagerICProxi(long objectId) {
        super(objectId);
    }
    public OwnerServiceOrderManagerICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theOwnerServiceOrderManagerFacade
            .getOwnerServiceOrderManager(this.getId());
    }
    
    public long getClassId() {
        return 444;
    }
    
    public OwnerService4Public getObserver() throws PersistenceException {
        return ((PersistentOwnerServiceOrderManager)this.getTheObject()).getObserver();
    }
    public void setObserver(OwnerService4Public newValue) throws PersistenceException {
        ((PersistentOwnerServiceOrderManager)this.getTheObject()).setObserver(newValue);
    }
    public GlobalOrderManager4Public getObservee() throws PersistenceException {
        return ((PersistentOwnerServiceOrderManager)this.getTheObject()).getObservee();
    }
    public void setObservee(GlobalOrderManager4Public newValue) throws PersistenceException {
        ((PersistentOwnerServiceOrderManager)this.getTheObject()).setObservee(newValue);
    }
    public PersistentOwnerServiceOrderManager getThis() throws PersistenceException {
        return ((PersistentOwnerServiceOrderManager)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOwnerServiceOrderManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerServiceOrderManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerServiceOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerServiceOrderManager(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOwnerServiceOrderManager(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerServiceOrderManager(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerServiceOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerServiceOrderManager(this);
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentOwnerServiceOrderManager)this.getTheObject()).update(event);
    }

    
}
