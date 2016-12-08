package persistence;


public interface PersistentGlobalOrderManager extends PersistentCONCBackgroundTask, PersistentOrderManager, GlobalOrderManager4Public {
    
    public BackgroundTask4Public getMyCONCBackgroundTask() throws PersistenceException ;
    public void setMyCONCBackgroundTask(BackgroundTask4Public newValue) throws PersistenceException ;
    public PersistentGlobalOrderManager getThis() throws PersistenceException ;
    
    

}

