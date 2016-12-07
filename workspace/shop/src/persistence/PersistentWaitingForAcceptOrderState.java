package persistence;


public interface PersistentWaitingForAcceptOrderState extends PersistentOrderStatus, WaitingForAcceptOrderState4Public {
    
    public PersistentWaitingForAcceptOrderState getThis() throws PersistenceException ;
    
    

}

