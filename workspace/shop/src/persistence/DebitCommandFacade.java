package persistence;

import model.meta.*;

public class DebitCommandFacade{

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

	

	public DebitCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentDebitCommand newDebitCommand(common.Fraction amount,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentDebitCommand)PersistentProxi.createProxi(idCreateIfLessZero, 334);
        long id = ConnectionHandler.getTheConnectionHandler().theDebitCommandFacade.getNextId();
        DebitCommand result = new DebitCommand(amount,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentDebitCommand)PersistentProxi.createProxi(id, 334);
    }
    
    public PersistentDebitCommand newDelayedDebitCommand(common.Fraction amount) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theDebitCommandFacade.getNextId();
        DebitCommand result = new DebitCommand(amount,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentDebitCommand)PersistentProxi.createProxi(id, 334);
    }
    
    public DebitCommand getDebitCommand(long DebitCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 334)) return 334;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void amountSet(long DebitCommandId, common.Fraction amountVal) throws PersistenceException {
        
    }
    public void invokerSet(long DebitCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long DebitCommandId, CustomerAccount4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long DebitCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

