package persistence;



public class ArticleStateFacade{

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

	

	public ArticleStateFacade() {
	}

    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 193)) return 193;
        if(Cache.getTheCache().contains(objectId, 195)) return 195;
        if(Cache.getTheCache().contains(objectId, 200)) return 200;
        if(Cache.getTheCache().contains(objectId, 196)) return 196;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void subServiceSet(long ArticleStateId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ArticleStateId, ArticleState4Public ThisVal) throws PersistenceException {
        
    }

}

