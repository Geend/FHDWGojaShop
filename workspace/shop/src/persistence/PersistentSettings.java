package persistence;


public interface PersistentSettings extends Anything, SubjInterface, AbstractPersistentProxi, Settings4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentSettings getThis() throws PersistenceException ;
    
    

}

