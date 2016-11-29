package persistence;

import model.meta.*;

public class IncreaseStockCommandFacade{

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

	

	public IncreaseStockCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentIncreaseStockCommand newIncreaseStockCommand(long quantity,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentIncreaseStockCommand)PersistentProxi.createProxi(idCreateIfLessZero, 288);
        long id = ConnectionHandler.getTheConnectionHandler().theIncreaseStockCommandFacade.getNextId();
        IncreaseStockCommand result = new IncreaseStockCommand(quantity,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentIncreaseStockCommand)PersistentProxi.createProxi(id, 288);
    }
    
    public PersistentIncreaseStockCommand newDelayedIncreaseStockCommand(long quantity) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theIncreaseStockCommandFacade.getNextId();
        IncreaseStockCommand result = new IncreaseStockCommand(quantity,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentIncreaseStockCommand)PersistentProxi.createProxi(id, 288);
    }
    
    public IncreaseStockCommand getIncreaseStockCommand(long IncreaseStockCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 288)) return 288;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void quantitySet(long IncreaseStockCommandId, long quantityVal) throws PersistenceException {
        
    }
    public void invokerSet(long IncreaseStockCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long IncreaseStockCommandId, Article4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long IncreaseStockCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

