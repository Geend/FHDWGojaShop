package persistence;


public interface PersistentOrderQuantifiedArticle extends PersistentQuantifiedArticle, OrderQuantifiedArticle4Public {
    
    public PersistentOrderArticleWrapper getArticle() throws PersistenceException ;
    public void setArticle(PersistentOrderArticleWrapper newValue) throws PersistenceException ;
    public PersistentOrderQuantifiedArticle getThis() throws PersistenceException ;
    
    

}

