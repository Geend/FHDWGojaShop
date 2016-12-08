package persistence;


public interface PersistentOwnerServiceOrderManager extends Anything, ObsInterface, AbstractPersistentProxi, OwnerServiceOrderManager4Public {
    
    public OwnerService4Public getObserver() throws PersistenceException ;
    public void setObserver(OwnerService4Public newValue) throws PersistenceException ;
    public GlobalOrderManager4Public getObservee() throws PersistenceException ;
    public void setObservee(GlobalOrderManager4Public newValue) throws PersistenceException ;
    public PersistentOwnerServiceOrderManager getThis() throws PersistenceException ;
    
    

}

