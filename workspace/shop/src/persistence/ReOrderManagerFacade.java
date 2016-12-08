package persistence;

import model.*;

public class ReOrderManagerFacade{

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

	

	public ReOrderManagerFacade() {
	}

    public PersistentReOrderManager getTheReOrderManager() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theReOrderManagerFacade.getNextId();
        ReOrderManager result = new ReOrderManager(null, null, null, id);
        PersistentInCacheProxi cached = Cache.getTheCache().putSingleton(result);
        return (PersistentReOrderManager)PersistentProxi.createProxi(cached.getId()  * (cached.getTheObject().isTheSameAs(result) ? -1 : 1), 327);
    }
    
    public ReOrderManager getReOrderManager(long ReOrderManagerId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 327)) return 327;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void reorderArticlesSet(long ReOrderManagerId, ReOrderManagerReorderArticles4Public reorderArticlesVal) throws PersistenceException {
        
    }
    public void ThisSet(long ReOrderManagerId, ReOrderManager4Public ThisVal) throws PersistenceException {
        
    }
    public void myCONCBackgroundTaskSet(long ReOrderManagerId, BackgroundTask4Public myCONCBackgroundTaskVal) throws PersistenceException {
        
    }

}

