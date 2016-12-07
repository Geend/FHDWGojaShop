package persistence;



public abstract class BackgroundTaskProxi extends PersistentProxi implements PersistentBackgroundTask{
    
    public BackgroundTaskProxi(long objectId) {
        super(objectId);
    }
    public BackgroundTaskProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentBackgroundTask)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentBackgroundTask)this.getTheObject()).setSubService(newValue);
    }
    public abstract PersistentBackgroundTask getThis() throws PersistenceException ;
    
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentBackgroundTask)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentBackgroundTask)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentBackgroundTask)this.getTheObject()).register(observee);
    }
    public void step() 
				throws PersistenceException{
        ((PersistentBackgroundTask)this.getTheObject()).step();
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentBackgroundTask)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentBackgroundTask)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentBackgroundTask)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentBackgroundTask)this.getTheObject()).initializeOnInstantiation();
    }
    public void startTask(final long tickTime) 
				throws PersistenceException{
        ((PersistentBackgroundTask)this.getTheObject()).startTask(tickTime);
    }
    public void stepImplementation() 
				throws PersistenceException{
        ((PersistentBackgroundTask)this.getTheObject()).stepImplementation();
    }
    public void stopTask() 
				throws PersistenceException{
        ((PersistentBackgroundTask)this.getTheObject()).stopTask();
    }

    
}
