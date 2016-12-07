package persistence;



import model.visitor.*;

public class CONCBackgroundTaskICProxi extends BackgroundTaskICProxi implements PersistentCONCBackgroundTask{
    
    public CONCBackgroundTaskICProxi(long objectId) {
        super(objectId);
    }
    public CONCBackgroundTaskICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCONCBackgroundTaskFacade
            .getCONCBackgroundTask(this.getId());
    }
    
    public long getClassId() {
        return 367;
    }
    
    public PersistentCONCBackgroundTask getThis() throws PersistenceException {
        return ((PersistentCONCBackgroundTask)this.getTheObject()).getThis();
    }
    
    public void accept(BackgroundTaskVisitor visitor) throws PersistenceException {
        visitor.handleCONCBackgroundTask(this);
    }
    public <R> R accept(BackgroundTaskReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCONCBackgroundTask(this);
    }
    public <E extends model.UserException>  void accept(BackgroundTaskExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCONCBackgroundTask(this);
    }
    public <R, E extends model.UserException> R accept(BackgroundTaskReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCONCBackgroundTask(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCONCBackgroundTask(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCONCBackgroundTask(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCONCBackgroundTask(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCONCBackgroundTask(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCONCBackgroundTask(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCONCBackgroundTask(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCONCBackgroundTask(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCONCBackgroundTask(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCONCBackgroundTask)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentCONCBackgroundTask)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCONCBackgroundTask)this.getTheObject()).register(observee);
    }
    public void step() 
				throws PersistenceException{
        ((PersistentCONCBackgroundTask)this.getTheObject()).step();
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCONCBackgroundTask)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentCONCBackgroundTask)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentCONCBackgroundTask)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentCONCBackgroundTask)this.getTheObject()).initializeOnInstantiation();
    }
    public void startTask(final long tickTime) 
				throws PersistenceException{
        ((PersistentCONCBackgroundTask)this.getTheObject()).startTask(tickTime);
    }
    public void stepImplementation() 
				throws PersistenceException{
        ((PersistentCONCBackgroundTask)this.getTheObject()).stepImplementation();
    }
    public void stopTask() 
				throws PersistenceException{
        ((PersistentCONCBackgroundTask)this.getTheObject()).stopTask();
    }

    
}
