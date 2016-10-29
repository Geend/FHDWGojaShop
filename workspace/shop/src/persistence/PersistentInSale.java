package persistence;


public interface PersistentInSale extends PersistentArticleState, InSale4Public {
    
    public PersistentInSale getThis() throws PersistenceException ;
    
    

}

