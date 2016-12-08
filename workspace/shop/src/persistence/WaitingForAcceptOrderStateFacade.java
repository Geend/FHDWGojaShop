package persistence;

import model.*;

public class WaitingForAcceptOrderStateFacade{



	public WaitingForAcceptOrderStateFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentWaitingForAcceptOrderState newWaitingForAcceptOrderState(long ticksLeft,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentWaitingForAcceptOrderState)PersistentProxi.createProxi(idCreateIfLessZero, 332);
        long id = ConnectionHandler.getTheConnectionHandler().theOrderStatusFacade.getNextId();
        WaitingForAcceptOrderState result = new WaitingForAcceptOrderState(null,null,ticksLeft,id);
        Cache.getTheCache().put(result);
        return (PersistentWaitingForAcceptOrderState)PersistentProxi.createProxi(id, 332);
    }
    
    public PersistentWaitingForAcceptOrderState newDelayedWaitingForAcceptOrderState(long ticksLeft) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderStatusFacade.getNextId();
        WaitingForAcceptOrderState result = new WaitingForAcceptOrderState(null,null,ticksLeft,id);
        Cache.getTheCache().put(result);
        return (PersistentWaitingForAcceptOrderState)PersistentProxi.createProxi(id, 332);
    }
    
    public WaitingForAcceptOrderState getWaitingForAcceptOrderState(long WaitingForAcceptOrderStateId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void ticksLeftSet(long WaitingForAcceptOrderStateId, long ticksLeftVal) throws PersistenceException {
        
    }

}

