package persistence;



public class QuantifiedArticleFacade{

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

	

	public QuantifiedArticleFacade() {
	}

    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 148)) return 148;
        if(Cache.getTheCache().contains(objectId, 153)) return 153;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void quantitySet(long QuantifiedArticleId, long quantityVal) throws PersistenceException {
        
    }
    public void ThisSet(long QuantifiedArticleId, PersistentQuantifiedArticle ThisVal) throws PersistenceException {
        
    }

}

