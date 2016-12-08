package persistence;


public interface PersistentGlobalOrderArchive extends Anything, SubjInterface, AbstractPersistentProxi, GlobalOrderArchive4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentGlobalOrderArchive getThis() throws PersistenceException ;
    
    

}

