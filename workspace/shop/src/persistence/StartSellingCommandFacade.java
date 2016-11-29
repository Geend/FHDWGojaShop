package persistence;

import model.meta.*;

public class StartSellingCommandFacade{

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

	

	public StartSellingCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentStartSellingCommand newStartSellingCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentStartSellingCommand)PersistentProxi.createProxi(idCreateIfLessZero, 289);
        long id = ConnectionHandler.getTheConnectionHandler().theStartSellingCommandFacade.getNextId();
        StartSellingCommand result = new StartSellingCommand(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentStartSellingCommand)PersistentProxi.createProxi(id, 289);
    }
    
    public PersistentStartSellingCommand newDelayedStartSellingCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theStartSellingCommandFacade.getNextId();
        StartSellingCommand result = new StartSellingCommand(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentStartSellingCommand)PersistentProxi.createProxi(id, 289);
    }
    
    public StartSellingCommand getStartSellingCommand(long StartSellingCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 289)) return 289;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void invokerSet(long StartSellingCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long StartSellingCommandId, Article4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long StartSellingCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

