package persistence;


public interface PersistentShop extends Anything, SubjInterface, AbstractPersistentProxi, Shop4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentShop getThis() throws PersistenceException ;
    
    

}

