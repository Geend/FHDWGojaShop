package persistence;

import model.*;

public class BackgroundTaskManagerFacade{

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

	

	public BackgroundTaskManagerFacade() {
	}

    public PersistentBackgroundTaskManager getTheBackgroundTaskManager() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theBackgroundTaskManagerFacade.getNextId();
        BackgroundTaskManager result = new BackgroundTaskManager(null, null, id);
        PersistentInCacheProxi cached = Cache.getTheCache().putSingleton(result);
        return (PersistentBackgroundTaskManager)PersistentProxi.createProxi(cached.getId()  * (cached.getTheObject().isTheSameAs(result) ? -1 : 1), 363);
    }
    
    public BackgroundTaskManager getBackgroundTaskManager(long BackgroundTaskManagerId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 363)) return 363;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public long tasksAdd(long BackgroundTaskManagerId, BackgroundTask4Public tasksVal) throws PersistenceException {
        return 0;
    }
    public void tasksRem(long tasksId) throws PersistenceException {
        
    }
    public BackgroundTaskList tasksGet(long BackgroundTaskManagerId) throws PersistenceException {
        return new BackgroundTaskList(); // remote access for initialization only!
    }
    public void subServiceSet(long BackgroundTaskManagerId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long BackgroundTaskManagerId, BackgroundTaskManager4Public ThisVal) throws PersistenceException {
        
    }

}

