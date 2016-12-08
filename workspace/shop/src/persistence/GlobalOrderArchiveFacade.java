package persistence;

import model.*;

public class GlobalOrderArchiveFacade{

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

	

	public GlobalOrderArchiveFacade() {
	}

    public PersistentGlobalOrderArchive getTheGlobalOrderArchive() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theGlobalOrderArchiveFacade.getNextId();
        GlobalOrderArchive result = new GlobalOrderArchive(null, null, id);
        PersistentInCacheProxi cached = Cache.getTheCache().putSingleton(result);
        return (PersistentGlobalOrderArchive)PersistentProxi.createProxi(cached.getId()  * (cached.getTheObject().isTheSameAs(result) ? -1 : 1), 436);
    }
    
    public GlobalOrderArchive getGlobalOrderArchive(long GlobalOrderArchiveId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 436)) return 436;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public long ordersAdd(long GlobalOrderArchiveId, Order4Public ordersVal) throws PersistenceException {
        return 0;
    }
    public void ordersRem(long ordersId) throws PersistenceException {
        
    }
    public OrderList ordersGet(long GlobalOrderArchiveId) throws PersistenceException {
        return new OrderList(); // remote access for initialization only!
    }
    public void subServiceSet(long GlobalOrderArchiveId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long GlobalOrderArchiveId, GlobalOrderArchive4Public ThisVal) throws PersistenceException {
        
    }

}

