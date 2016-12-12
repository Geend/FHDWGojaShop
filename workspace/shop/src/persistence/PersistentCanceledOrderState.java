package persistence;


public interface PersistentCanceledOrderState extends PersistentOrderStatus, CanceledOrderState4Public {
    
    public PersistentCanceledOrderState getThis() throws PersistenceException ;
    
    

}

