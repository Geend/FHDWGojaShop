package persistence;

import model.meta.*;

public class NewProductGroupCommandFacade{

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

	

	public NewProductGroupCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentNewProductGroupCommand newNewProductGroupCommand(String name,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentNewProductGroupCommand)PersistentProxi.createProxi(idCreateIfLessZero, 409);
        long id = ConnectionHandler.getTheConnectionHandler().theNewProductGroupCommandFacade.getNextId();
        NewProductGroupCommand result = new NewProductGroupCommand(null,name,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentNewProductGroupCommand)PersistentProxi.createProxi(id, 409);
    }
    
    public PersistentNewProductGroupCommand newDelayedNewProductGroupCommand(String name) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theNewProductGroupCommandFacade.getNextId();
        NewProductGroupCommand result = new NewProductGroupCommand(null,name,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentNewProductGroupCommand)PersistentProxi.createProxi(id, 409);
    }
    
    public NewProductGroupCommand getNewProductGroupCommand(long NewProductGroupCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 409)) return 409;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void parentSet(long NewProductGroupCommandId, ComponentContainer parentVal) throws PersistenceException {
        
    }
    public void nameSet(long NewProductGroupCommandId, String nameVal) throws PersistenceException {
        
    }
    public void invokerSet(long NewProductGroupCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long NewProductGroupCommandId, Shop4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long NewProductGroupCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

