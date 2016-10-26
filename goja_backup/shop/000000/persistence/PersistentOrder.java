package persistence;


public interface PersistentOrder extends PersistentAbstractOrder, Order4Public {
    
    public PersistentOrder getThis() throws PersistenceException ;
    
    

}

