package persistence;

import model.*;

public class CustomerDeliveryTimeManagerFacade{

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

	

	public CustomerDeliveryTimeManagerFacade() {
	}

    public PersistentCustomerDeliveryTimeManager getTheCustomerDeliveryTimeManager() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeManagerFacade.getNextId();
        CustomerDeliveryTimeManager result = new CustomerDeliveryTimeManager(null, null, id);
        PersistentInCacheProxi cached = Cache.getTheCache().putSingleton(result);
        return (PersistentCustomerDeliveryTimeManager)PersistentProxi.createProxi(cached.getId()  * (cached.getTheObject().isTheSameAs(result) ? -1 : 1), 296);
    }
    
    public CustomerDeliveryTimeManager getCustomerDeliveryTimeManager(long CustomerDeliveryTimeManagerId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 296)) return 296;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public long customerDeliveryTimesAdd(long CustomerDeliveryTimeManagerId, CustomerDeliveryTime4Public customerDeliveryTimesVal) throws PersistenceException {
        return 0;
    }
    public void customerDeliveryTimesRem(long customerDeliveryTimesId) throws PersistenceException {
        
    }
    public CustomerDeliveryTimeList customerDeliveryTimesGet(long CustomerDeliveryTimeManagerId) throws PersistenceException {
        return new CustomerDeliveryTimeList(); // remote access for initialization only!
    }
    public void subServiceSet(long CustomerDeliveryTimeManagerId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long CustomerDeliveryTimeManagerId, CustomerDeliveryTimeManager4Public ThisVal) throws PersistenceException {
        
    }

}

