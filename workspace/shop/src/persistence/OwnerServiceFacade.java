package persistence;

import model.*;

public class OwnerServiceFacade{



	public OwnerServiceFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOwnerService newOwnerService(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOwnerService)PersistentProxi.createProxi(idCreateIfLessZero, -276);
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        OwnerService result = new OwnerService(null,null,null,null,null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOwnerService)PersistentProxi.createProxi(id, -276);
    }
    
    public PersistentOwnerService newDelayedOwnerService() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        OwnerService result = new OwnerService(null,null,null,null,null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOwnerService)PersistentProxi.createProxi(id, -276);
    }
    
    public OwnerService getOwnerService(long OwnerServiceId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void componentManagerSet(long OwnerServiceId, ComponentManager4Public componentManagerVal) throws PersistenceException {
        
    }
    public void customerDeliveryTimeManagerSet(long OwnerServiceId, CustomerDeliveryTimeManager4Public customerDeliveryTimeManagerVal) throws PersistenceException {
        
    }
    public void prmanagerSet(long OwnerServiceId, ProducerLst4Public prmanagerVal) throws PersistenceException {
        
    }
    public void settingsSet(long OwnerServiceId, Settings4Public settingsVal) throws PersistenceException {
        
    }
    public void reOrderManagerSet(long OwnerServiceId, ReOrderManager4Public reOrderManagerVal) throws PersistenceException {
        
    }
    public void ownerOrderManagerSet(long OwnerServiceId, OwnerOrderManager4Public ownerOrderManagerVal) throws PersistenceException {
        
    }
    public void returnManagerSet(long OwnerServiceId, ReturnManager4Public returnManagerVal) throws PersistenceException {
        
    }
    public OwnerServiceSearchList inverseGetReOrderManager(long objectId, long classId)throws PersistenceException{
        OwnerServiceSearchList result = new OwnerServiceSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(-276);
        while (candidates.hasNext()){
            PersistentOwnerService current = (PersistentOwnerService)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getReOrderManager() != null){
                if (current.getReOrderManager().getClassId() == classId && current.getReOrderManager().getId() == objectId) {
                    PersistentOwnerService proxi = (PersistentOwnerService)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentOwnerService)proxi.getThis());
                }
            }
        }
        return result;
    }
    public OwnerServiceSearchList inverseGetOwnerOrderManager(long objectId, long classId)throws PersistenceException{
        OwnerServiceSearchList result = new OwnerServiceSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(-276);
        while (candidates.hasNext()){
            PersistentOwnerService current = (PersistentOwnerService)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getOwnerOrderManager() != null){
                if (current.getOwnerOrderManager().getClassId() == classId && current.getOwnerOrderManager().getId() == objectId) {
                    PersistentOwnerService proxi = (PersistentOwnerService)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentOwnerService)proxi.getThis());
                }
            }
        }
        return result;
    }
    public OwnerServiceSearchList inverseGetReturnManager(long objectId, long classId)throws PersistenceException{
        OwnerServiceSearchList result = new OwnerServiceSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(-276);
        while (candidates.hasNext()){
            PersistentOwnerService current = (PersistentOwnerService)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getReturnManager() != null){
                if (current.getReturnManager().getClassId() == classId && current.getReturnManager().getId() == objectId) {
                    PersistentOwnerService proxi = (PersistentOwnerService)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentOwnerService)proxi.getThis());
                }
            }
        }
        return result;
    }

}

