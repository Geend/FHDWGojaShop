package persistence;


public interface PersistentReOrderManagerReorderArticles extends Anything, ObsInterface, PersistentListProxiInterface<ReOrderQuantifiedArticle4Public>, AbstractPersistentProxi, ReOrderManagerReorderArticles4Public {
    
    public ReOrderManager4Public getObserver() throws PersistenceException ;
    public void setObserver(ReOrderManager4Public newValue) throws PersistenceException ;
    public PersistentReOrderManagerReorderArticles getThis() throws PersistenceException ;
    
    

}

