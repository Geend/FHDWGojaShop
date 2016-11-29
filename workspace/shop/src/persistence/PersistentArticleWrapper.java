package persistence;


public interface PersistentArticleWrapper extends SubComponent, PersistentComponent, ArticleWrapper4Public {
    
    public void setArticle(Article4Public newValue) throws PersistenceException ;
    public ProductGroup4Public getParent() throws PersistenceException ;
    public void setParent(ProductGroup4Public newValue) throws PersistenceException ;
    public PersistentArticleWrapper getThis() throws PersistenceException ;
    
    

}

