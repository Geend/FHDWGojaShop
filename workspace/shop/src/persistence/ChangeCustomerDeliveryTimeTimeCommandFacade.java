package persistence;

import model.meta.*;

public class ChangeCustomerDeliveryTimeTimeCommandFacade{

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

	

	public ChangeCustomerDeliveryTimeTimeCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentChangeCustomerDeliveryTimeTimeCommand newChangeCustomerDeliveryTimeTimeCommand(long newValue,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentChangeCustomerDeliveryTimeTimeCommand)PersistentProxi.createProxi(idCreateIfLessZero, 410);
        long id = ConnectionHandler.getTheConnectionHandler().theChangeCustomerDeliveryTimeTimeCommandFacade.getNextId();
        ChangeCustomerDeliveryTimeTimeCommand result = new ChangeCustomerDeliveryTimeTimeCommand(null,newValue,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeCustomerDeliveryTimeTimeCommand)PersistentProxi.createProxi(id, 410);
    }
    
    public PersistentChangeCustomerDeliveryTimeTimeCommand newDelayedChangeCustomerDeliveryTimeTimeCommand(long newValue) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theChangeCustomerDeliveryTimeTimeCommandFacade.getNextId();
        ChangeCustomerDeliveryTimeTimeCommand result = new ChangeCustomerDeliveryTimeTimeCommand(null,newValue,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeCustomerDeliveryTimeTimeCommand)PersistentProxi.createProxi(id, 410);
    }
    
    public ChangeCustomerDeliveryTimeTimeCommand getChangeCustomerDeliveryTimeTimeCommand(long ChangeCustomerDeliveryTimeTimeCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 410)) return 410;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void customerDeliveryTimeSet(long ChangeCustomerDeliveryTimeTimeCommandId, CustomerDeliveryTime4Public customerDeliveryTimeVal) throws PersistenceException {
        
    }
    public void newValueSet(long ChangeCustomerDeliveryTimeTimeCommandId, long newValueVal) throws PersistenceException {
        
    }
    public void invokerSet(long ChangeCustomerDeliveryTimeTimeCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long ChangeCustomerDeliveryTimeTimeCommandId, Shop4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long ChangeCustomerDeliveryTimeTimeCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

