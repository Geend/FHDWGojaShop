package persistence;

import model.*;

public class InTransitOrderStateFacade{



	public InTransitOrderStateFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentInTransitOrderState newInTransitOrderState(long ticksLeft,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentInTransitOrderState)PersistentProxi.createProxi(idCreateIfLessZero, 336);
        long id = ConnectionHandler.getTheConnectionHandler().theOrderStatusFacade.getNextId();
        InTransitOrderState result = new InTransitOrderState(null,null,ticksLeft,id);
        Cache.getTheCache().put(result);
        return (PersistentInTransitOrderState)PersistentProxi.createProxi(id, 336);
    }
    
    public PersistentInTransitOrderState newDelayedInTransitOrderState(long ticksLeft) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderStatusFacade.getNextId();
        InTransitOrderState result = new InTransitOrderState(null,null,ticksLeft,id);
        Cache.getTheCache().put(result);
        return (PersistentInTransitOrderState)PersistentProxi.createProxi(id, 336);
    }
    
    public InTransitOrderState getInTransitOrderState(long InTransitOrderStateId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void ticksLeftSet(long InTransitOrderStateId, long ticksLeftVal) throws PersistenceException {
        
    }

}

