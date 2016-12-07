package persistence;


public interface PersistentBackgroundTask extends Anything, SubjInterface, AbstractPersistentProxi, BackgroundTask4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public abstract PersistentBackgroundTask getThis() throws PersistenceException ;
    
    

}

