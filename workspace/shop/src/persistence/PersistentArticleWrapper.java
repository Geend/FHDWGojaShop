package persistence;


public interface PersistentArticleWrapper extends PersistentComponentWrapper, ArticleWrapper4Public {
    
    public abstract PersistentArticleWrapper getThis() throws PersistenceException ;
    public Article4Public getComponent() throws PersistenceException ;
    
    

}

