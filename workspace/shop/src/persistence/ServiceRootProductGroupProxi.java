package persistence;



import model.visitor.*;

public class ServiceRootProductGroupProxi extends PersistentProxi implements PersistentServiceRootProductGroup{
    
    public ServiceRootProductGroupProxi(long objectId) {
        super(objectId);
    }
    public ServiceRootProductGroupProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 265;
    }
    
    public Service4Public getObserver() throws PersistenceException {
        return ((PersistentServiceRootProductGroup)this.getTheObject()).getObserver();
    }
    public void setObserver(Service4Public newValue) throws PersistenceException {
        ((PersistentServiceRootProductGroup)this.getTheObject()).setObserver(newValue);
    }
    public RootProductGroup4Public getObservee() throws PersistenceException {
        return ((PersistentServiceRootProductGroup)this.getTheObject()).getObservee();
    }
    public void setObservee(RootProductGroup4Public newValue) throws PersistenceException {
        ((PersistentServiceRootProductGroup)this.getTheObject()).setObservee(newValue);
    }
    public PersistentServiceRootProductGroup getThis() throws PersistenceException {
        return ((PersistentServiceRootProductGroup)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleServiceRootProductGroup(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleServiceRootProductGroup(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleServiceRootProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleServiceRootProductGroup(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleServiceRootProductGroup(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleServiceRootProductGroup(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleServiceRootProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleServiceRootProductGroup(this);
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentServiceRootProductGroup)this.getTheObject()).update(event);
    }

    
}
