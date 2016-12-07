package persistence;

import model.meta.*;

public class ReOrderForPreorderCommandFacade{

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

	

	public ReOrderForPreorderCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentReOrderForPreorderCommand newReOrderForPreorderCommand(long quantity,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentReOrderForPreorderCommand)PersistentProxi.createProxi(idCreateIfLessZero, 368);
        long id = ConnectionHandler.getTheConnectionHandler().theReOrderForPreorderCommandFacade.getNextId();
        ReOrderForPreorderCommand result = new ReOrderForPreorderCommand(null,quantity,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentReOrderForPreorderCommand)PersistentProxi.createProxi(id, 368);
    }
    
    public PersistentReOrderForPreorderCommand newDelayedReOrderForPreorderCommand(long quantity) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theReOrderForPreorderCommandFacade.getNextId();
        ReOrderForPreorderCommand result = new ReOrderForPreorderCommand(null,quantity,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentReOrderForPreorderCommand)PersistentProxi.createProxi(id, 368);
    }
    
    public ReOrderForPreorderCommand getReOrderForPreorderCommand(long ReOrderForPreorderCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 368)) return 368;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void articleSet(long ReOrderForPreorderCommandId, ArticleWrapper4Public articleVal) throws PersistenceException {
        
    }
    public void quantitySet(long ReOrderForPreorderCommandId, long quantityVal) throws PersistenceException {
        
    }
    public void invokerSet(long ReOrderForPreorderCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long ReOrderForPreorderCommandId, ReOrderManager4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long ReOrderForPreorderCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

