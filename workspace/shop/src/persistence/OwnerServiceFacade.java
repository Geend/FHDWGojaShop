package persistence;

import model.*;

public class OwnerServiceFacade{



	public OwnerServiceFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOwnerService newOwnerService(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOwnerService)PersistentProxi.createProxi(idCreateIfLessZero, -276);
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        OwnerService result = new OwnerService(null,null,null,null,null,null,null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOwnerService)PersistentProxi.createProxi(id, -276);
    }
    
    public PersistentOwnerService newDelayedOwnerService() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        OwnerService result = new OwnerService(null,null,null,null,null,null,null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOwnerService)PersistentProxi.createProxi(id, -276);
    }
    
    public OwnerService getOwnerService(long OwnerServiceId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void shopSet(long OwnerServiceId, OwnerServiceShop4Public shopVal) throws PersistenceException {
        
    }
    public void componentManagerSet(long OwnerServiceId, ComponentManager4Public componentManagerVal) throws PersistenceException {
        
    }
    public void prmanagerSet(long OwnerServiceId, ProducerLst4Public prmanagerVal) throws PersistenceException {
        
    }
    public void customerDeliveryTimeManagerSet(long OwnerServiceId, CustomerDeliveryTimeManager4Public customerDeliveryTimeManagerVal) throws PersistenceException {
        
    }
    public void settingsSet(long OwnerServiceId, Settings4Public settingsVal) throws PersistenceException {
        
    }
    public void reOrderManagerSet(long OwnerServiceId, OwnerServiceReOrderManager4Public reOrderManagerVal) throws PersistenceException {
        
    }
    public void orderManagerSet(long OwnerServiceId, OwnerServiceOrderManager4Public orderManagerVal) throws PersistenceException {
        
    }
    public void returnManagerSet(long OwnerServiceId, ReturnManager4Public returnManagerVal) throws PersistenceException {
        
    }
    public void orderArchiveSet(long OwnerServiceId, GlobalOrderArchive4Public orderArchiveVal) throws PersistenceException {
        
    }

}

