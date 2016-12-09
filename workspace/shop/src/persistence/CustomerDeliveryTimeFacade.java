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
    public PersistentCustomerDeliveryTime newCustomerDeliveryTime(String name,common.Fraction price,long deliveryTime,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(idCreateIfLessZero, 234);
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade.getNextId();
        CustomerDeliveryTime result = new CustomerDeliveryTime(name,price,deliveryTime,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(id, 234);
    }
    
    public PersistentCustomerDeliveryTime newDelayedCustomerDeliveryTime(String name,common.Fraction price,long deliveryTime) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade.getNextId();
        CustomerDeliveryTime result = new CustomerDeliveryTime(name,price,deliveryTime,null,null,id);
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
    public CustomerDeliveryTimeSearchList getCustomerDeliveryTimeByName(String name) throws PersistenceException {
        name = name.replaceAll("%", ".*");
        name = name.replaceAll("_", ".");
        CustomerDeliveryTimeSearchList result = new CustomerDeliveryTimeSearchList();
        java.util.Iterator<?> candidates;
        candidates = Cache.getTheCache().iterator(234);
        while (candidates.hasNext()){
            PersistentCustomerDeliveryTime current = (PersistentCustomerDeliveryTime)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getName().matches(name))
                result.add((PersistentCustomerDeliveryTime)PersistentProxi.createProxi(current.getId(), current.getClassId()));
        }
        return result;
    }
    public void nameSet(long CustomerDeliveryTimeId, String nameVal) throws PersistenceException {
        
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

