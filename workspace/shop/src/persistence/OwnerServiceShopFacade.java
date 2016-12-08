package persistence;

import model.*;

public class OwnerServiceShopFacade{

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

	

	public OwnerServiceShopFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOwnerServiceShop newOwnerServiceShop(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOwnerServiceShop)PersistentProxi.createProxi(idCreateIfLessZero, 426);
        long id = ConnectionHandler.getTheConnectionHandler().theOwnerServiceShopFacade.getNextId();
        OwnerServiceShop result = new OwnerServiceShop(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOwnerServiceShop)PersistentProxi.createProxi(id, 426);
    }
    
    public PersistentOwnerServiceShop newDelayedOwnerServiceShop() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOwnerServiceShopFacade.getNextId();
        OwnerServiceShop result = new OwnerServiceShop(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOwnerServiceShop)PersistentProxi.createProxi(id, 426);
    }
    
    public OwnerServiceShop getOwnerServiceShop(long OwnerServiceShopId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 426)) return 426;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long OwnerServiceShopId, OwnerService4Public observerVal) throws PersistenceException {
        
    }
    public void observeeSet(long OwnerServiceShopId, Shop4Public observeeVal) throws PersistenceException {
        
    }
    public void ThisSet(long OwnerServiceShopId, OwnerServiceShop4Public ThisVal) throws PersistenceException {
        
    }

}

