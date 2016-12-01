package persistence;


public interface PersistentArticle extends PersistentComponent, Article4Public {
    
    public PersistentArticle getThis() throws PersistenceException ;
    
    

}

