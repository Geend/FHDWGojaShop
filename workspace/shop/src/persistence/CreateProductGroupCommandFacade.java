package persistence;

import model.meta.*;

public class CreateProductGroupCommandFacade{

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

	

	public CreateProductGroupCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCreateProductGroupCommand newCreateProductGroupCommand(String name,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCreateProductGroupCommand)PersistentProxi.createProxi(idCreateIfLessZero, 174);
        long id = ConnectionHandler.getTheConnectionHandler().theCreateProductGroupCommandFacade.getNextId();
        CreateProductGroupCommand result = new CreateProductGroupCommand(name,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCreateProductGroupCommand)PersistentProxi.createProxi(id, 174);
    }
    
    public PersistentCreateProductGroupCommand newDelayedCreateProductGroupCommand(String name) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCreateProductGroupCommandFacade.getNextId();
        CreateProductGroupCommand result = new CreateProductGroupCommand(name,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCreateProductGroupCommand)PersistentProxi.createProxi(id, 174);
    }
    
    public CreateProductGroupCommand getCreateProductGroupCommand(long CreateProductGroupCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 174)) return 174;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void nameSet(long CreateProductGroupCommandId, String nameVal) throws PersistenceException {
        
    }
    public void invokerSet(long CreateProductGroupCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long CreateProductGroupCommandId, ComponentLst4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long CreateProductGroupCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

