package persistence;


public interface PersistentFinishedOrderState extends PersistentOrderState, FinishedOrderState4Public {
    
    public PersistentFinishedOrderState getThis() throws PersistenceException ;
    
    

}

