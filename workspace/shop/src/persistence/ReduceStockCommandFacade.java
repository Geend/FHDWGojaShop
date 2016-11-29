package persistence;

import model.meta.*;

public class ReduceStockCommandFacade{

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

	

	public ReduceStockCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentReduceStockCommand newReduceStockCommand(long quantity,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentReduceStockCommand)PersistentProxi.createProxi(idCreateIfLessZero, 286);
        long id = ConnectionHandler.getTheConnectionHandler().theReduceStockCommandFacade.getNextId();
        ReduceStockCommand result = new ReduceStockCommand(quantity,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentReduceStockCommand)PersistentProxi.createProxi(id, 286);
    }
    
    public PersistentReduceStockCommand newDelayedReduceStockCommand(long quantity) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theReduceStockCommandFacade.getNextId();
        ReduceStockCommand result = new ReduceStockCommand(quantity,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentReduceStockCommand)PersistentProxi.createProxi(id, 286);
    }
    
    public ReduceStockCommand getReduceStockCommand(long ReduceStockCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 286)) return 286;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void quantitySet(long ReduceStockCommandId, long quantityVal) throws PersistenceException {
        
    }
    public void invokerSet(long ReduceStockCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long ReduceStockCommandId, Article4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long ReduceStockCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

