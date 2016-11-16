package persistence;


public interface PersistentOrderQuantifiedArticle extends PersistentQuantifiedArticle, OrderQuantifiedArticle4Public {
    
    public OrderArticleWrapper4Public getArticle() throws PersistenceException ;
    public void setArticle(OrderArticleWrapper4Public newValue) throws PersistenceException ;
    public PersistentOrderQuantifiedArticle getThis() throws PersistenceException ;
    
    

}

