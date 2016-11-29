package persistence;

import model.meta.*;

public class CreateCustomerDeliveryTimeCommandFacade{

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

	

	public CreateCustomerDeliveryTimeCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCreateCustomerDeliveryTimeCommand newCreateCustomerDeliveryTimeCommand(String name,common.Fraction price,long time,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCreateCustomerDeliveryTimeCommand)PersistentProxi.createProxi(idCreateIfLessZero, 295);
        long id = ConnectionHandler.getTheConnectionHandler().theCreateCustomerDeliveryTimeCommandFacade.getNextId();
        CreateCustomerDeliveryTimeCommand result = new CreateCustomerDeliveryTimeCommand(name,price,time,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCreateCustomerDeliveryTimeCommand)PersistentProxi.createProxi(id, 295);
    }
    
    public PersistentCreateCustomerDeliveryTimeCommand newDelayedCreateCustomerDeliveryTimeCommand(String name,common.Fraction price,long time) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCreateCustomerDeliveryTimeCommandFacade.getNextId();
        CreateCustomerDeliveryTimeCommand result = new CreateCustomerDeliveryTimeCommand(name,price,time,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCreateCustomerDeliveryTimeCommand)PersistentProxi.createProxi(id, 295);
    }
    
    public CreateCustomerDeliveryTimeCommand getCreateCustomerDeliveryTimeCommand(long CreateCustomerDeliveryTimeCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 295)) return 295;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void nameSet(long CreateCustomerDeliveryTimeCommandId, String nameVal) throws PersistenceException {
        
    }
    public void priceSet(long CreateCustomerDeliveryTimeCommandId, common.Fraction priceVal) throws PersistenceException {
        
    }
    public void timeSet(long CreateCustomerDeliveryTimeCommandId, long timeVal) throws PersistenceException {
        
    }
    public void invokerSet(long CreateCustomerDeliveryTimeCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long CreateCustomerDeliveryTimeCommandId, CustomerDeliveryTimeManager4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void commandResultSet(long CreateCustomerDeliveryTimeCommandId, CustomerDeliveryTime4Public commandResultVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long CreateCustomerDeliveryTimeCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

