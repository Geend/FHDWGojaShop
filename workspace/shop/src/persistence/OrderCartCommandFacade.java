package persistence;

import model.meta.*;

public class OrderCartCommandFacade{

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

	

	public OrderCartCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOrderCartCommand newOrderCartCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOrderCartCommand)PersistentProxi.createProxi(idCreateIfLessZero, 434);
        long id = ConnectionHandler.getTheConnectionHandler().theOrderCartCommandFacade.getNextId();
        OrderCartCommand result = new OrderCartCommand(null,null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderCartCommand)PersistentProxi.createProxi(id, 434);
    }
    
    public PersistentOrderCartCommand newDelayedOrderCartCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderCartCommandFacade.getNextId();
        OrderCartCommand result = new OrderCartCommand(null,null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderCartCommand)PersistentProxi.createProxi(id, 434);
    }
    
    public OrderCartCommand getOrderCartCommand(long OrderCartCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 434)) return 434;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void managerSet(long OrderCartCommandId, CustomerOrderManager4Public managerVal) throws PersistenceException {
        
    }
    public void cartSet(long OrderCartCommandId, ShoppingCart4Public cartVal) throws PersistenceException {
        
    }
    public void customerDeliveryTimeSet(long OrderCartCommandId, CustomerDeliveryTime4Public customerDeliveryTimeVal) throws PersistenceException {
        
    }
    public void invokerSet(long OrderCartCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long OrderCartCommandId, Shop4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long OrderCartCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

