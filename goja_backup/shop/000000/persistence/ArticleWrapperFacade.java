package persistence;



public class ArticleWrapperFacade{

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

	

	public ArticleWrapperFacade() {
	}

    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 167)) return 167;
        if(Cache.getTheCache().contains(objectId, 161)) return 161;
        if(Cache.getTheCache().contains(objectId, 163)) return 163;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void articleSet(long ArticleWrapperId, PersistentArticle articleVal) throws PersistenceException {
        
    }
    public void ThisSet(long ArticleWrapperId, PersistentArticleWrapper ThisVal) throws PersistenceException {
        
    }

}

