package persistence;


public interface PersistentProcessingOrderState extends PersistentOrderStatus, ProcessingOrderState4Public {
    
    public PersistentProcessingOrderState getThis() throws PersistenceException ;
    
    

}

