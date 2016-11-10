package persistence;

import model.meta.*;

public class AddSubProductGroupCommandFacade{

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

	

	public AddSubProductGroupCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentAddSubProductGroupCommand newAddSubProductGroupCommand(String name,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentAddSubProductGroupCommand)PersistentProxi.createProxi(idCreateIfLessZero, 192);
        long id = ConnectionHandler.getTheConnectionHandler().theAddSubProductGroupCommandFacade.getNextId();
        AddSubProductGroupCommand result = new AddSubProductGroupCommand(name,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAddSubProductGroupCommand)PersistentProxi.createProxi(id, 192);
    }
    
    public PersistentAddSubProductGroupCommand newDelayedAddSubProductGroupCommand(String name) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theAddSubProductGroupCommandFacade.getNextId();
        AddSubProductGroupCommand result = new AddSubProductGroupCommand(name,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAddSubProductGroupCommand)PersistentProxi.createProxi(id, 192);
    }
    
    public AddSubProductGroupCommand getAddSubProductGroupCommand(long AddSubProductGroupCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 192)) return 192;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void nameSet(long AddSubProductGroupCommandId, String nameVal) throws PersistenceException {
        
    }
    public void invokerSet(long AddSubProductGroupCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long AddSubProductGroupCommandId, ProductGroup4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long AddSubProductGroupCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

