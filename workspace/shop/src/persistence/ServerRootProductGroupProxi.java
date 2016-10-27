package persistence;



import model.visitor.*;

public class ServerRootProductGroupProxi extends PersistentProxi implements PersistentServerRootProductGroup{
    
    public ServerRootProductGroupProxi(long objectId) {
        super(objectId);
    }
    public ServerRootProductGroupProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 174;
    }
    
    public PersistentServer getObserver() throws PersistenceException {
        return ((PersistentServerRootProductGroup)this.getTheObject()).getObserver();
    }
    public void setObserver(PersistentServer newValue) throws PersistenceException {
        ((PersistentServerRootProductGroup)this.getTheObject()).setObserver(newValue);
    }
    public PersistentProductGroup getObservee() throws PersistenceException {
        return ((PersistentServerRootProductGroup)this.getTheObject()).getObservee();
    }
    public void setObservee(PersistentProductGroup newValue) throws PersistenceException {
        ((PersistentServerRootProductGroup)this.getTheObject()).setObservee(newValue);
    }
    public PersistentServerRootProductGroup getThis() throws PersistenceException {
        return ((PersistentServerRootProductGroup)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleServerRootProductGroup(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleServerRootProductGroup(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleServerRootProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleServerRootProductGroup(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleServerRootProductGroup(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleServerRootProductGroup(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleServerRootProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleServerRootProductGroup(this);
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentServerRootProductGroup)this.getTheObject()).update(event);
    }

    
}
