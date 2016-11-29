package persistence;


public interface PersistentOrderState extends Anything, SubjInterface, AbstractPersistentProxi, OrderState4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public abstract PersistentOrderState getThis() throws PersistenceException ;
    
    

}

