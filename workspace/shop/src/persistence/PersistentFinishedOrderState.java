package persistence;


public interface PersistentFinishedOrderState extends PersistentOrderStatus, FinishedOrderState4Public {
    
    public PersistentFinishedOrderState getThis() throws PersistenceException ;
    
    

}

