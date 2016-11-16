package persistence;


public interface PersistentServiceRootProductGroup extends Anything, ObsInterface, AbstractPersistentProxi, ServiceRootProductGroup4Public {
    
    public Service4Public getObserver() throws PersistenceException ;
    public void setObserver(Service4Public newValue) throws PersistenceException ;
    public RootProductGroup4Public getObservee() throws PersistenceException ;
    public void setObservee(RootProductGroup4Public newValue) throws PersistenceException ;
    public PersistentServiceRootProductGroup getThis() throws PersistenceException ;
    
    

}

