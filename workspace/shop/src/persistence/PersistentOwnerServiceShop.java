package persistence;


public interface PersistentOwnerServiceShop extends Anything, ObsInterface, AbstractPersistentProxi, OwnerServiceShop4Public {
    
    public OwnerService4Public getObserver() throws PersistenceException ;
    public void setObserver(OwnerService4Public newValue) throws PersistenceException ;
    public Shop4Public getObservee() throws PersistenceException ;
    public void setObservee(Shop4Public newValue) throws PersistenceException ;
    public PersistentOwnerServiceShop getThis() throws PersistenceException ;
    
    

}

