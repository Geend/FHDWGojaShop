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
        if(Cache.getTheCache().contains(objectId, 232)) return 232;
        if(Cache.getTheCache().contains(objectId, 326)) return 326;
        if(Cache.getTheCache().contains(objectId, 236)) return 236;
        if(Cache.getTheCache().contains(objectId, 346)) return 346;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void quantitySet(long QuantifiedArticleId, long quantityVal) throws PersistenceException {
        
    }
    public void articleSet(long QuantifiedArticleId, ArticleWrapper4Public articleVal) throws PersistenceException {
        
    }
    public void subServiceSet(long QuantifiedArticleId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long QuantifiedArticleId, QuantifiedArticle4Public ThisVal) throws PersistenceException {
        
    }

}

