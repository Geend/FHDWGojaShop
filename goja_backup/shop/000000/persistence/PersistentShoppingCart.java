package persistence;


public interface PersistentShoppingCart extends Anything, AbstractPersistentProxi, ShoppingCart4Public {
    
    public ShoppingCart_ArticlesProxi getArticles() throws PersistenceException ;
    public PersistentShoppingCart getThis() throws PersistenceException ;
    
    

}

