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
        if(Cache.getTheCache().contains(objectId, 122)) return 122;
        if(Cache.getTheCache().contains(objectId, 124)) return 124;
        if(Cache.getTheCache().contains(objectId, 126)) return 126;
        if(Cache.getTheCache().contains(objectId, 130)) return 130;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void ThisSet(long ArticleStateId, PersistentArticleState ThisVal) throws PersistenceException {
        
    }

}

