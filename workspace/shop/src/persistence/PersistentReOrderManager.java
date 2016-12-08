package persistence;


public interface PersistentReOrderManager extends Anything, PersistentCONCBackgroundTask, AbstractPersistentProxi, ReOrderManager4Public {
    
    public void setReorderArticles(ReOrderManagerReorderArticles4Public newValue) throws PersistenceException ;
    public BackgroundTask4Public getMyCONCBackgroundTask() throws PersistenceException ;
    public void setMyCONCBackgroundTask(BackgroundTask4Public newValue) throws PersistenceException ;
    public PersistentReOrderManager getThis() throws PersistenceException ;
    
    
    public ReOrderManagerReorderArticles4Public getReorderArticles() 
				throws PersistenceException;
    public void reorderArticles_update(final model.meta.ReOrderQuantifiedArticleMssgs event) 
				throws PersistenceException;

}

