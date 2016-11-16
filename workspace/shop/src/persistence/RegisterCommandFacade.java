package persistence;

import model.meta.*;

public class RegisterCommandFacade{

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

	

	public RegisterCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentRegisterCommand newRegisterCommand(String accountName,String password,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentRegisterCommand)PersistentProxi.createProxi(idCreateIfLessZero, 267);
        long id = ConnectionHandler.getTheConnectionHandler().theRegisterCommandFacade.getNextId();
        RegisterCommand result = new RegisterCommand(accountName,password,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentRegisterCommand)PersistentProxi.createProxi(id, 267);
    }
    
    public PersistentRegisterCommand newDelayedRegisterCommand(String accountName,String password) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theRegisterCommandFacade.getNextId();
        RegisterCommand result = new RegisterCommand(accountName,password,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentRegisterCommand)PersistentProxi.createProxi(id, 267);
    }
    
    public RegisterCommand getRegisterCommand(long RegisterCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 267)) return 267;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void accountNameSet(long RegisterCommandId, String accountNameVal) throws PersistenceException {
        
    }
    public void passwordSet(long RegisterCommandId, String passwordVal) throws PersistenceException {
        
    }
    public void invokerSet(long RegisterCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long RegisterCommandId, CustomerRegisterService4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long RegisterCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

