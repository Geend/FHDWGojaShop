package persistence;

import model.meta.*;

public class MoveToCommandFacade{

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

	

	public MoveToCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentMoveToCommand newMoveToCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentMoveToCommand)PersistentProxi.createProxi(idCreateIfLessZero, 269);
        long id = ConnectionHandler.getTheConnectionHandler().theMoveToCommandFacade.getNextId();
        MoveToCommand result = new MoveToCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentMoveToCommand)PersistentProxi.createProxi(id, 269);
    }
    
    public PersistentMoveToCommand newDelayedMoveToCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theMoveToCommandFacade.getNextId();
        MoveToCommand result = new MoveToCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentMoveToCommand)PersistentProxi.createProxi(id, 269);
    }
    
    public MoveToCommand getMoveToCommand(long MoveToCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 269)) return 269;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void productGroupSet(long MoveToCommandId, ProductGroup4Public productGroupVal) throws PersistenceException {
        
    }
    public void invokerSet(long MoveToCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long MoveToCommandId, SubComponent commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long MoveToCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

