package persistence;

import model.meta.*;

public class CancelPreOrderCommandFacade{

	static private Long sequencer = new Long(0);

	static protected long getTheNextId(){
		long result = -1;
		synchronized (sequencer) { 
			result = sequencer.longValue() + 1;
			sequencer = new Long(result);
		}
		return result;
	}

	protected long getNextId(){
		return getTheNextId();
	}

	

	public CancelPreOrderCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCancelPreOrderCommand newCancelPreOrderCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCancelPreOrderCommand)PersistentProxi.createProxi(idCreateIfLessZero, 458);
        long id = ConnectionHandler.getTheConnectionHandler().theCancelPreOrderCommandFacade.getNextId();
        CancelPreOrderCommand result = new CancelPreOrderCommand(null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCancelPreOrderCommand)PersistentProxi.createProxi(id, 458);
    }
    
    public PersistentCancelPreOrderCommand newDelayedCancelPreOrderCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCancelPreOrderCommandFacade.getNextId();
        CancelPreOrderCommand result = new CancelPreOrderCommand(null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCancelPreOrderCommand)PersistentProxi.createProxi(id, 458);
    }
    
    public CancelPreOrderCommand getCancelPreOrderCommand(long CancelPreOrderCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 458)) return 458;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void managerSet(long CancelPreOrderCommandId, CustomerOrderManager4Public managerVal) throws PersistenceException {
        
    }
    public void orderSet(long CancelPreOrderCommandId, Order4Public orderVal) throws PersistenceException {
        
    }
    public void invokerSet(long CancelPreOrderCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long CancelPreOrderCommandId, Shop4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long CancelPreOrderCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

