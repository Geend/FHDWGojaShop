package persistence;


public interface PersistentNotInSale extends PersistentArticleState, NotInSale4Public {
    
    public PersistentNotInSale getThis() throws PersistenceException ;
    
    

}

