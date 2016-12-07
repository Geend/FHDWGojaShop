package persistence;


public interface PersistentBackgroundTaskManager extends Anything, SubjInterface, AbstractPersistentProxi, BackgroundTaskManager4Public {
    
    public BackgroundTaskManager_TasksProxi getTasks() throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentBackgroundTaskManager getThis() throws PersistenceException ;
    
    

}

