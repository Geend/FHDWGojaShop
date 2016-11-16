package persistence;

import model.meta.*;

public class NewSubProductGroupCommandFacade{

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

	

	public NewSubProductGroupCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentNewSubProductGroupCommand newNewSubProductGroupCommand(String name,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentNewSubProductGroupCommand)PersistentProxi.createProxi(idCreateIfLessZero, 192);
        long id = ConnectionHandler.getTheConnectionHandler().theNewSubProductGroupCommandFacade.getNextId();
        NewSubProductGroupCommand result = new NewSubProductGroupCommand(name,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentNewSubProductGroupCommand)PersistentProxi.createProxi(id, 192);
    }
    
    public PersistentNewSubProductGroupCommand newDelayedNewSubProductGroupCommand(String name) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theNewSubProductGroupCommandFacade.getNextId();
        NewSubProductGroupCommand result = new NewSubProductGroupCommand(name,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentNewSubProductGroupCommand)PersistentProxi.createProxi(id, 192);
    }
    
    public NewSubProductGroupCommand getNewSubProductGroupCommand(long NewSubProductGroupCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 192)) return 192;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void nameSet(long NewSubProductGroupCommandId, String nameVal) throws PersistenceException {
        
    }
    public void invokerSet(long NewSubProductGroupCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long NewSubProductGroupCommandId, ProductGroup4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long NewSubProductGroupCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

