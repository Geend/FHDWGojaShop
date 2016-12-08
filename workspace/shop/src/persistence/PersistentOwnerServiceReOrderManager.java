package persistence;


public interface PersistentOwnerServiceReOrderManager extends Anything, ObsInterface, AbstractPersistentProxi, OwnerServiceReOrderManager4Public {
    
    public OwnerService4Public getObserver() throws PersistenceException ;
    public void setObserver(OwnerService4Public newValue) throws PersistenceException ;
    public ReOrderManager4Public getObservee() throws PersistenceException ;
    public void setObservee(ReOrderManager4Public newValue) throws PersistenceException ;
    public PersistentOwnerServiceReOrderManager getThis() throws PersistenceException ;
    
    

}

