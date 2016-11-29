package persistence;


public interface PersistentArticle extends PersistentComponent, Article4Public {
    
    public void setCurrentStock(long newValue) throws PersistenceException ;
    public PersistentArticle getThis() throws PersistenceException ;
    
    

}

