package persistence;

import model.meta.*;

public class AcceptOrderCommandFacade{

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

	

	public AcceptOrderCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentAcceptOrderCommand newAcceptOrderCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentAcceptOrderCommand)PersistentProxi.createProxi(idCreateIfLessZero, 360);
        long id = ConnectionHandler.getTheConnectionHandler().theAcceptOrderCommandFacade.getNextId();
        AcceptOrderCommand result = new AcceptOrderCommand(null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAcceptOrderCommand)PersistentProxi.createProxi(id, 360);
    }
    
    public PersistentAcceptOrderCommand newDelayedAcceptOrderCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theAcceptOrderCommandFacade.getNextId();
        AcceptOrderCommand result = new AcceptOrderCommand(null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAcceptOrderCommand)PersistentProxi.createProxi(id, 360);
    }
    
    public AcceptOrderCommand getAcceptOrderCommand(long AcceptOrderCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 360)) return 360;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void managerSet(long AcceptOrderCommandId, CustomerOrderManager4Public managerVal) throws PersistenceException {
        
    }
    public void orderSet(long AcceptOrderCommandId, Order4Public orderVal) throws PersistenceException {
        
    }
    public void invokerSet(long AcceptOrderCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long AcceptOrderCommandId, Shop4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long AcceptOrderCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

