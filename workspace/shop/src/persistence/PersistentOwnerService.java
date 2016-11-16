package persistence;


public interface PersistentOwnerService extends PersistentService, OwnerService4Public {
    
    public ProducerLst4Public getPrmanager() throws PersistenceException ;
    public void setPrmanager(ProducerLst4Public newValue) throws PersistenceException ;
    public PersistentOwnerService getThis() throws PersistenceException ;
    
    

}

