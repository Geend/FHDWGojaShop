package persistence;


public interface PersistentActiveOrder extends PersistentOrderState, ActiveOrder4Public {
    
    public PersistentActiveOrder getThis() throws PersistenceException ;
    
    

}

