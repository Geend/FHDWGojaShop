package persistence;

import model.meta.*;

public class ChangeCustomerDeliveryTimePriceCommandFacade{

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

	

	public ChangeCustomerDeliveryTimePriceCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentChangeCustomerDeliveryTimePriceCommand newChangeCustomerDeliveryTimePriceCommand(common.Fraction newValue,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentChangeCustomerDeliveryTimePriceCommand)PersistentProxi.createProxi(idCreateIfLessZero, 411);
        long id = ConnectionHandler.getTheConnectionHandler().theChangeCustomerDeliveryTimePriceCommandFacade.getNextId();
        ChangeCustomerDeliveryTimePriceCommand result = new ChangeCustomerDeliveryTimePriceCommand(null,newValue,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeCustomerDeliveryTimePriceCommand)PersistentProxi.createProxi(id, 411);
    }
    
    public PersistentChangeCustomerDeliveryTimePriceCommand newDelayedChangeCustomerDeliveryTimePriceCommand(common.Fraction newValue) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theChangeCustomerDeliveryTimePriceCommandFacade.getNextId();
        ChangeCustomerDeliveryTimePriceCommand result = new ChangeCustomerDeliveryTimePriceCommand(null,newValue,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeCustomerDeliveryTimePriceCommand)PersistentProxi.createProxi(id, 411);
    }
    
    public ChangeCustomerDeliveryTimePriceCommand getChangeCustomerDeliveryTimePriceCommand(long ChangeCustomerDeliveryTimePriceCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 411)) return 411;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void customerDeliveryTimeSet(long ChangeCustomerDeliveryTimePriceCommandId, CustomerDeliveryTime4Public customerDeliveryTimeVal) throws PersistenceException {
        
    }
    public void newValueSet(long ChangeCustomerDeliveryTimePriceCommandId, common.Fraction newValueVal) throws PersistenceException {
        
    }
    public void invokerSet(long ChangeCustomerDeliveryTimePriceCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long ChangeCustomerDeliveryTimePriceCommandId, Shop4Public commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long ChangeCustomerDeliveryTimePriceCommandId, CommonDate4Public myCommonDateVal) throws PersistenceException {
        
    }

}

