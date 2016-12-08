package persistence;


public interface PersistentPreOrderState extends PersistentOrderStatus, PreOrderState4Public {
    
    public PersistentPreOrderState getThis() throws PersistenceException ;
    
    

}

