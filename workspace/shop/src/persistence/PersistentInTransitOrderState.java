package persistence;


public interface PersistentInTransitOrderState extends PersistentOrderStatus, InTransitOrderState4Public {
    
    public PersistentInTransitOrderState getThis() throws PersistenceException ;
    
    

}

