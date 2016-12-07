package persistence;



import model.visitor.*;

public class BackgroundTaskManagerProxi extends PersistentProxi implements PersistentBackgroundTaskManager{
    
    public BackgroundTaskManagerProxi(long objectId) {
        super(objectId);
    }
    public BackgroundTaskManagerProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 363;
    }
    
    public BackgroundTaskManager_TasksProxi getTasks() throws PersistenceException {
        return ((PersistentBackgroundTaskManager)this.getTheObject()).getTasks();
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentBackgroundTaskManager)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentBackgroundTaskManager)this.getTheObject()).setSubService(newValue);
    }
    public PersistentBackgroundTaskManager getThis() throws PersistenceException {
        return ((PersistentBackgroundTaskManager)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleBackgroundTaskManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleBackgroundTaskManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleBackgroundTaskManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleBackgroundTaskManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleBackgroundTaskManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleBackgroundTaskManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleBackgroundTaskManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleBackgroundTaskManager(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentBackgroundTaskManager)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentBackgroundTaskManager)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentBackgroundTaskManager)this.getTheObject()).register(observee);
    }
    public void step() 
				throws PersistenceException{
        ((PersistentBackgroundTaskManager)this.getTheObject()).step();
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentBackgroundTaskManager)this.getTheObject()).updateObservers(event);
    }
    public void addTask(final BackgroundTask4Public task) 
				throws PersistenceException{
        ((PersistentBackgroundTaskManager)this.getTheObject()).addTask(task);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentBackgroundTaskManager)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentBackgroundTaskManager)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentBackgroundTaskManager)this.getTheObject()).initializeOnInstantiation();
    }
    public void startTasks() 
				throws PersistenceException{
        ((PersistentBackgroundTaskManager)this.getTheObject()).startTasks();
    }
    public void stepImplementation() 
				throws PersistenceException{
        ((PersistentBackgroundTaskManager)this.getTheObject()).stepImplementation();
    }
    public void stopTasks() 
				throws PersistenceException{
        ((PersistentBackgroundTaskManager)this.getTheObject()).stopTasks();
    }

    
}
