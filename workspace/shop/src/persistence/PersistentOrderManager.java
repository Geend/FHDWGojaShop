package persistence;


public interface PersistentOrderManager extends Anything, SubjInterface, AbstractPersistentProxi, OrderManager4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public abstract PersistentOrderManager getThis() throws PersistenceException ;
    
    

}

