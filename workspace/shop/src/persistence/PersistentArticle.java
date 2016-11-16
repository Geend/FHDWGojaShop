package persistence;


public interface PersistentArticle extends SubComponent, PersistentComponent, Article4Public {
    
    public ProductGroup4Public getParent() throws PersistenceException ;
    public void setParent(ProductGroup4Public newValue) throws PersistenceException ;
    public PersistentArticle getThis() throws PersistenceException ;
    
    

}

