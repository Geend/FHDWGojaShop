package persistence;


public interface PersistentShoppingCartQuantifiedArticle extends PersistentQuantifiedArticle, ShoppingCartQuantifiedArticle4Public {
    
    public PersistentShoppingCartArticleWrapper getArticle() throws PersistenceException ;
    public void setArticle(PersistentShoppingCartArticleWrapper newValue) throws PersistenceException ;
    public PersistentShoppingCartQuantifiedArticle getThis() throws PersistenceException ;
    
    

}

