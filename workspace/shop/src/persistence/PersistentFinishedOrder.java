package persistence;


public interface PersistentFinishedOrder extends PersistentOrderState, FinishedOrder4Public {
    
    public PersistentFinishedOrder getThis() throws PersistenceException ;
    
    

}

