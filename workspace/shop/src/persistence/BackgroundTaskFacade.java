package persistence;



public class BackgroundTaskFacade{

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

	

	public BackgroundTaskFacade() {
	}

    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 367)) return 367;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void subServiceSet(long BackgroundTaskId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long BackgroundTaskId, BackgroundTask4Public ThisVal) throws PersistenceException {
        
    }

}

