package persistence;


public interface PersistentArticleState extends Anything, SubjInterface, AbstractPersistentProxi, ArticleState4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public abstract PersistentArticleState getThis() throws PersistenceException ;
    
    

}

