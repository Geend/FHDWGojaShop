package persistence;

import model.meta.*;

public class ChangeMinStockCommandFacade{

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

	

	public ChangeMinStockCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentChangeMinStockCommand newChangeMinStockCommand(long newValue,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentChangeMinStockCommand)PersistentProxi.createProxi(idCreateIfLessZero, 455);
        long id = ConnectionHandler.getTheConnectionHandler().theChangeMinStockCommandFacade.getNextId();
        ChangeMinStockCommand result = new ChangeMinStockCommand(null,newValue,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeMinStockCommand)PersistentProxi.createProxi(id, 455);
    }
    
    public PersistentChangeMinStockCommand newDelayedChangeMinStockCommand(long newValue) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theChangeMinStockCommandFacade.getNextId();
        ChangeMinStockCommand result = new ChangeMinStockCommand(null,newValue,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeMinStockCommand)PersistentProxi.createProxi(id, 455);
    }
    
    public ChangeMinStockCommand getChangeMinStockCommand(long ChangeMinStockCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 455)) return 455;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void articleSet(long ChangeMinStockCommandId, ArticleWrapper4Public articleVal) throws PersistenceException {
        
    }
    public void newValueSet(long ChangeMinStockCommandId, long newValueVal) throws PersistenceException {
        
    }
    public void invokerSet(long ChangeMinStockCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long ChangeMinStockCommandId, Shop4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long ChangeMinStockCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

