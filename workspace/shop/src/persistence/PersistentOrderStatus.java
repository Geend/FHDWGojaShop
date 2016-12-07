package persistence;


public interface PersistentOrderStatus extends Anything, SubjInterface, AbstractPersistentProxi, OrderStatus4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public abstract PersistentOrderStatus getThis() throws PersistenceException ;
    
    

}

