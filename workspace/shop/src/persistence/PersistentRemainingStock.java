package persistence;


public interface PersistentRemainingStock extends PersistentArticleState, RemainingStock4Public {
    
    public PersistentRemainingStock getThis() throws PersistenceException ;
    
    

}

