package persistence;

import model.*;

public class OwnerServiceFacade{



	public OwnerServiceFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOwnerService newOwnerService(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOwnerService)PersistentProxi.createProxi(idCreateIfLessZero, -276);
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        OwnerService result = new OwnerService(null,null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOwnerService)PersistentProxi.createProxi(id, -276);
    }
    
    public PersistentOwnerService newDelayedOwnerService() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        OwnerService result = new OwnerService(null,null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOwnerService)PersistentProxi.createProxi(id, -276);
    }
    
    public OwnerService getOwnerService(long OwnerServiceId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void rootProductGroupSet(long OwnerServiceId, RootProductGroup4Public rootProductGroupVal) throws PersistenceException {
        
    }
    public void customerDeliveryTimeManagerSet(long OwnerServiceId, CustomerDeliveryTimeManager4Public customerDeliveryTimeManagerVal) throws PersistenceException {
        
    }
    public void prmanagerSet(long OwnerServiceId, ProducerLst4Public prmanagerVal) throws PersistenceException {
        
    }
    public void settingsSet(long OwnerServiceId, Settings4Public settingsVal) throws PersistenceException {
        
    }
    public OwnerServiceSearchList inverseGetRootProductGroup(long objectId, long classId)throws PersistenceException{
        OwnerServiceSearchList result = new OwnerServiceSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(-276);
        while (candidates.hasNext()){
            PersistentOwnerService current = (PersistentOwnerService)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getRootProductGroup() != null){
                if (current.getRootProductGroup().getClassId() == classId && current.getRootProductGroup().getId() == objectId) {
                    PersistentOwnerService proxi = (PersistentOwnerService)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentOwnerService)proxi.getThis());
                }
            }
        }
        return result;
    }

}

