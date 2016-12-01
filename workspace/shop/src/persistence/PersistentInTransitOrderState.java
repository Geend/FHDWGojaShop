package persistence;


public interface PersistentInTransitOrderState extends PersistentOrderState, InTransitOrderState4Public {
    
    public PersistentInTransitOrderState getThis() throws PersistenceException ;
    
    

}

