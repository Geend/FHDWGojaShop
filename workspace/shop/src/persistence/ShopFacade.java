package persistence;

import model.*;

public class ShopFacade{

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

	

	public ShopFacade() {
	}

    public PersistentShop getTheShop() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theShopFacade.getNextId();
        Shop result = new Shop(null, null, id);
        PersistentInCacheProxi cached = Cache.getTheCache().putSingleton(result);
        return (PersistentShop)PersistentProxi.createProxi(cached.getId()  * (cached.getTheObject().isTheSameAs(result) ? -1 : 1), 428);
    }
    
    public Shop getShop(long ShopId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 428)) return 428;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void subServiceSet(long ShopId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ShopId, Shop4Public ThisVal) throws PersistenceException {
        
    }

}

