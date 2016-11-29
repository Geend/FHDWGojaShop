package persistence;

import model.meta.*;

public class NewPreOrderCommandFacade{

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

	

	public NewPreOrderCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentNewPreOrderCommand newNewPreOrderCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentNewPreOrderCommand)PersistentProxi.createProxi(idCreateIfLessZero, 316);
        long id = ConnectionHandler.getTheConnectionHandler().theNewPreOrderCommandFacade.getNextId();
        NewPreOrderCommand result = new NewPreOrderCommand(null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentNewPreOrderCommand)PersistentProxi.createProxi(id, 316);
    }
    
    public PersistentNewPreOrderCommand newDelayedNewPreOrderCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theNewPreOrderCommandFacade.getNextId();
        NewPreOrderCommand result = new NewPreOrderCommand(null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentNewPreOrderCommand)PersistentProxi.createProxi(id, 316);
    }
    
    public NewPreOrderCommand getNewPreOrderCommand(long NewPreOrderCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 316)) return 316;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void cartSet(long NewPreOrderCommandId, ShoppingCart4Public cartVal) throws PersistenceException {
        
    }
    public void customerDeliveryTimeSet(long NewPreOrderCommandId, CustomerDeliveryTime4Public customerDeliveryTimeVal) throws PersistenceException {
        
    }
    public void invokerSet(long NewPreOrderCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long NewPreOrderCommandId, CustomerOrderManager4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long NewPreOrderCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

