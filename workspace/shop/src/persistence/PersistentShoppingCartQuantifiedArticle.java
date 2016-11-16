package persistence;


public interface PersistentShoppingCartQuantifiedArticle extends PersistentQuantifiedArticle, ShoppingCartQuantifiedArticle4Public {
    
    public ShoppingCartArticleWrapper4Public getArticle() throws PersistenceException ;
    public void setArticle(ShoppingCartArticleWrapper4Public newValue) throws PersistenceException ;
    public PersistentShoppingCartQuantifiedArticle getThis() throws PersistenceException ;
    
    

}

