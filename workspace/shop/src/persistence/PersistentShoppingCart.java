package persistence;


public interface PersistentShoppingCart extends Anything, SubjInterface, AbstractPersistentProxi, ShoppingCart4Public {
    
    public ShoppingCart_ArticlesProxi getArticles() throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentShoppingCart getThis() throws PersistenceException ;
    
    

}

