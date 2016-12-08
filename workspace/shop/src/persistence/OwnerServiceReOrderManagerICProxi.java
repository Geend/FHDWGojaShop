package persistence;



import model.visitor.*;

public class OwnerServiceReOrderManagerICProxi extends PersistentInCacheProxiOptimistic implements PersistentOwnerServiceReOrderManager{
    
    public OwnerServiceReOrderManagerICProxi(long objectId) {
        super(objectId);
    }
    public OwnerServiceReOrderManagerICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theOwnerServiceReOrderManagerFacade
            .getOwnerServiceReOrderManager(this.getId());
    }
    
    public long getClassId() {
        return 442;
    }
    
    public OwnerService4Public getObserver() throws PersistenceException {
        return ((PersistentOwnerServiceReOrderManager)this.getTheObject()).getObserver();
    }
    public void setObserver(OwnerService4Public newValue) throws PersistenceException {
        ((PersistentOwnerServiceReOrderManager)this.getTheObject()).setObserver(newValue);
    }
    public ReOrderManager4Public getObservee() throws PersistenceException {
        return ((PersistentOwnerServiceReOrderManager)this.getTheObject()).getObservee();
    }
    public void setObservee(ReOrderManager4Public newValue) throws PersistenceException {
        ((PersistentOwnerServiceReOrderManager)this.getTheObject()).setObservee(newValue);
    }
    public PersistentOwnerServiceReOrderManager getThis() throws PersistenceException {
        return ((PersistentOwnerServiceReOrderManager)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOwnerServiceReOrderManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerServiceReOrderManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerServiceReOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerServiceReOrderManager(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOwnerServiceReOrderManager(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerServiceReOrderManager(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerServiceReOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerServiceReOrderManager(this);
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentOwnerServiceReOrderManager)this.getTheObject()).update(event);
    }

    
}
