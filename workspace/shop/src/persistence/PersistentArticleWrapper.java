package persistence;


public interface PersistentArticleWrapper extends PersistentComponent, ArticleWrapper4Public {
    
    public void setArticle(Article4Public newValue) throws PersistenceException ;
    public PersistentArticleWrapper getThis() throws PersistenceException ;
    
    

}

