package persistence;


public interface PersistentOwnerOrderManager extends PersistentCONCBackgroundTask, PersistentOrderManager, OwnerOrderManager4Public {
    
    public BackgroundTask4Public getMyCONCBackgroundTask() throws PersistenceException ;
    public void setMyCONCBackgroundTask(BackgroundTask4Public newValue) throws PersistenceException ;
    public PersistentOwnerOrderManager getThis() throws PersistenceException ;
    
    
    public OwnerService4Public getMyServer() 
				throws PersistenceException;

}

