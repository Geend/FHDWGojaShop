package persistence;

import model.meta.*;

public class NewOrderCommandFacade{

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

	

	public NewOrderCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentNewOrderCommand newNewOrderCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentNewOrderCommand)PersistentProxi.createProxi(idCreateIfLessZero, 317);
        long id = ConnectionHandler.getTheConnectionHandler().theNewOrderCommandFacade.getNextId();
        NewOrderCommand result = new NewOrderCommand(null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentNewOrderCommand)PersistentProxi.createProxi(id, 317);
    }
    
    public PersistentNewOrderCommand newDelayedNewOrderCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theNewOrderCommandFacade.getNextId();
        NewOrderCommand result = new NewOrderCommand(null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentNewOrderCommand)PersistentProxi.createProxi(id, 317);
    }
    
    public NewOrderCommand getNewOrderCommand(long NewOrderCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 317)) return 317;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void cartSet(long NewOrderCommandId, ShoppingCart4Public cartVal) throws PersistenceException {
        
    }
    public void customerDeliveryTimeSet(long NewOrderCommandId, CustomerDeliveryTime4Public customerDeliveryTimeVal) throws PersistenceException {
        
    }
    public void invokerSet(long NewOrderCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long NewOrderCommandId, CustomerOrderManager4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long NewOrderCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

