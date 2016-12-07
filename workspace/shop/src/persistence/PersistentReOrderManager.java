package persistence;


public interface PersistentReOrderManager extends Anything, PersistentCONCBackgroundTask, AbstractPersistentProxi, ReOrderManager4Public {
    
    public ReOrderManager_ReorderArticlesProxi getReorderArticles() throws PersistenceException ;
    public BackgroundTask4Public getMyCONCBackgroundTask() throws PersistenceException ;
    public void setMyCONCBackgroundTask(BackgroundTask4Public newValue) throws PersistenceException ;
    public PersistentReOrderManager getThis() throws PersistenceException ;
    
    
    public OwnerService4Public getMyServer() 
				throws PersistenceException;

}

