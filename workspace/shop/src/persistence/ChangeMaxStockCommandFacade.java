package persistence;

import model.meta.*;

public class ChangeMaxStockCommandFacade{

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

	

	public ChangeMaxStockCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentChangeMaxStockCommand newChangeMaxStockCommand(long newValue,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentChangeMaxStockCommand)PersistentProxi.createProxi(idCreateIfLessZero, 454);
        long id = ConnectionHandler.getTheConnectionHandler().theChangeMaxStockCommandFacade.getNextId();
        ChangeMaxStockCommand result = new ChangeMaxStockCommand(null,newValue,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeMaxStockCommand)PersistentProxi.createProxi(id, 454);
    }
    
    public PersistentChangeMaxStockCommand newDelayedChangeMaxStockCommand(long newValue) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theChangeMaxStockCommandFacade.getNextId();
        ChangeMaxStockCommand result = new ChangeMaxStockCommand(null,newValue,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeMaxStockCommand)PersistentProxi.createProxi(id, 454);
    }
    
    public ChangeMaxStockCommand getChangeMaxStockCommand(long ChangeMaxStockCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 454)) return 454;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void articleSet(long ChangeMaxStockCommandId, ArticleWrapper4Public articleVal) throws PersistenceException {
        
    }
    public void newValueSet(long ChangeMaxStockCommandId, long newValueVal) throws PersistenceException {
        
    }
    public void invokerSet(long ChangeMaxStockCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long ChangeMaxStockCommandId, Shop4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long ChangeMaxStockCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

