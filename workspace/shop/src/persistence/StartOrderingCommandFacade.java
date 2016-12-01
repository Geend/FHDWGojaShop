package persistence;

import model.meta.*;

public class StartOrderingCommandFacade{

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

	

	public StartOrderingCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentStartOrderingCommand newStartOrderingCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentStartOrderingCommand)PersistentProxi.createProxi(idCreateIfLessZero, 331);
        long id = ConnectionHandler.getTheConnectionHandler().theStartOrderingCommandFacade.getNextId();
        StartOrderingCommand result = new StartOrderingCommand(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentStartOrderingCommand)PersistentProxi.createProxi(id, 331);
    }
    
    public PersistentStartOrderingCommand newDelayedStartOrderingCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theStartOrderingCommandFacade.getNextId();
        StartOrderingCommand result = new StartOrderingCommand(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentStartOrderingCommand)PersistentProxi.createProxi(id, 331);
    }
    
    public StartOrderingCommand getStartOrderingCommand(long StartOrderingCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 331)) return 331;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void invokerSet(long StartOrderingCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long StartOrderingCommandId, ReOrderManager4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long StartOrderingCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

