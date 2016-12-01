package persistence;

import model.meta.*;

public class ReOrderCommandFacade{

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

	

	public ReOrderCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentReOrderCommand newReOrderCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentReOrderCommand)PersistentProxi.createProxi(idCreateIfLessZero, 330);
        long id = ConnectionHandler.getTheConnectionHandler().theReOrderCommandFacade.getNextId();
        ReOrderCommand result = new ReOrderCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentReOrderCommand)PersistentProxi.createProxi(id, 330);
    }
    
    public PersistentReOrderCommand newDelayedReOrderCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theReOrderCommandFacade.getNextId();
        ReOrderCommand result = new ReOrderCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentReOrderCommand)PersistentProxi.createProxi(id, 330);
    }
    
    public ReOrderCommand getReOrderCommand(long ReOrderCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 330)) return 330;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void articleSet(long ReOrderCommandId, ArticleWrapper4Public articleVal) throws PersistenceException {
        
    }
    public void invokerSet(long ReOrderCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long ReOrderCommandId, ReOrderManager4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long ReOrderCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

