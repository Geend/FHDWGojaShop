package persistence;


public interface PersistentReOrderManager extends Anything, SubjInterface, AbstractPersistentProxi, ReOrderManager4Public {
    
    public ReOrderManager_ReorderArticlesProxi getReorderArticles() throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentReOrderManager getThis() throws PersistenceException ;
    
    
    public OwnerService4Public getMyServer() 
				throws PersistenceException;

}

