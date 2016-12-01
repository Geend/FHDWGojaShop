package persistence;


public interface PersistentProcessingOrderState extends PersistentOrderState, ProcessingOrderState4Public {
    
    public PersistentProcessingOrderState getThis() throws PersistenceException ;
    
    

}

