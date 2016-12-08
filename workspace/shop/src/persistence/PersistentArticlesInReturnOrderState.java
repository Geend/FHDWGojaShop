package persistence;


public interface PersistentArticlesInReturnOrderState extends PersistentOrderStatus, ArticlesInReturnOrderState4Public {
    
    public void setArticleReturn(ArticleReturn4Public newValue) throws PersistenceException ;
    public PersistentArticlesInReturnOrderState getThis() throws PersistenceException ;
    
    

}

