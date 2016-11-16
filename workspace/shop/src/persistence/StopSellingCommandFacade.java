package persistence;

import model.meta.*;

public class StopSellingCommandFacade{

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

	

	public StopSellingCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentStopSellingCommand newStopSellingCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentStopSellingCommand)PersistentProxi.createProxi(idCreateIfLessZero, 273);
        long id = ConnectionHandler.getTheConnectionHandler().theStopSellingCommandFacade.getNextId();
        StopSellingCommand result = new StopSellingCommand(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentStopSellingCommand)PersistentProxi.createProxi(id, 273);
    }
    
    public PersistentStopSellingCommand newDelayedStopSellingCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theStopSellingCommandFacade.getNextId();
        StopSellingCommand result = new StopSellingCommand(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentStopSellingCommand)PersistentProxi.createProxi(id, 273);
    }
    
    public StopSellingCommand getStopSellingCommand(long StopSellingCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 273)) return 273;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void invokerSet(long StopSellingCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long StopSellingCommandId, OwnerArticleWrapper4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long StopSellingCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

