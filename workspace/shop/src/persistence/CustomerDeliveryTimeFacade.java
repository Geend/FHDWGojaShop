package persistence;

import model.*;

public class CustomerDeliveryTimeFacade{

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

	

	public CustomerDeliveryTimeFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCustomerDeliveryTime newCustomerDeliveryTime(common.Fraction price,long deliveryTime,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(idCreateIfLessZero, 234);
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade.getNextId();
        CustomerDeliveryTime result = new CustomerDeliveryTime(price,deliveryTime,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(id, 234);
    }
    
    public PersistentCustomerDeliveryTime newDelayedCustomerDeliveryTime(common.Fraction price,long deliveryTime) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade.getNextId();
        CustomerDeliveryTime result = new CustomerDeliveryTime(price,deliveryTime,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(id, 234);
    }
    
    public CustomerDeliveryTime getCustomerDeliveryTime(long CustomerDeliveryTimeId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 234)) return 234;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void priceSet(long CustomerDeliveryTimeId, common.Fraction priceVal) throws PersistenceException {
        
    }
    public void deliveryTimeSet(long CustomerDeliveryTimeId, long deliveryTimeVal) throws PersistenceException {
        
    }
    public void subServiceSet(long CustomerDeliveryTimeId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long CustomerDeliveryTimeId, CustomerDeliveryTime4Public ThisVal) throws PersistenceException {
        
    }

}

