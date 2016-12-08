package persistence;

import model.meta.*;

public class CreateProducerCommandFacade{

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

	

	public CreateProducerCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCreateProducerCommand newCreateProducerCommand(String name,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCreateProducerCommand)PersistentProxi.createProxi(idCreateIfLessZero, 209);
        long id = ConnectionHandler.getTheConnectionHandler().theCreateProducerCommandFacade.getNextId();
        CreateProducerCommand result = new CreateProducerCommand(name,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCreateProducerCommand)PersistentProxi.createProxi(id, 209);
    }
    
    public PersistentCreateProducerCommand newDelayedCreateProducerCommand(String name) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCreateProducerCommandFacade.getNextId();
        CreateProducerCommand result = new CreateProducerCommand(name,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCreateProducerCommand)PersistentProxi.createProxi(id, 209);
    }
    
    public CreateProducerCommand getCreateProducerCommand(long CreateProducerCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 209)) return 209;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void nameSet(long CreateProducerCommandId, String nameVal) throws PersistenceException {
        
    }
    public void invokerSet(long CreateProducerCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long CreateProducerCommandId, ProducerLst4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void commandResultSet(long CreateProducerCommandId, Producer4Public commandResultVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long CreateProducerCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

