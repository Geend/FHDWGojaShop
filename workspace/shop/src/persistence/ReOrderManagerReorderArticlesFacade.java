package persistence;

import model.*;

public class ReOrderManagerReorderArticlesFacade{

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

	

	public ReOrderManagerReorderArticlesFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentReOrderManagerReorderArticles newReOrderManagerReorderArticles(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentReOrderManagerReorderArticles)PersistentProxi.createProxi(idCreateIfLessZero, 432);
        long id = ConnectionHandler.getTheConnectionHandler().theReOrderManagerReorderArticlesFacade.getNextId();
        ReOrderManagerReorderArticles result = new ReOrderManagerReorderArticles(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentReOrderManagerReorderArticles)PersistentProxi.createProxi(id, 432);
    }
    
    public PersistentReOrderManagerReorderArticles newDelayedReOrderManagerReorderArticles() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theReOrderManagerReorderArticlesFacade.getNextId();
        ReOrderManagerReorderArticles result = new ReOrderManagerReorderArticles(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentReOrderManagerReorderArticles)PersistentProxi.createProxi(id, 432);
    }
    
    public ReOrderManagerReorderArticles getReOrderManagerReorderArticles(long ReOrderManagerReorderArticlesId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 432)) return 432;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long ReOrderManagerReorderArticlesId, ReOrderManager4Public observerVal) throws PersistenceException {
        
    }
    public long observeeAdd(long ReOrderManagerReorderArticlesId, ReOrderQuantifiedArticle4Public observeeVal) throws PersistenceException {
        return 0;
    }
    public void observeeRem(long observeeId) throws PersistenceException {
        
    }
    public ReOrderQuantifiedArticleList observeeGet(long ReOrderManagerReorderArticlesId) throws PersistenceException {
        return new ReOrderQuantifiedArticleList(); // remote access for initialization only!
    }
    public void ThisSet(long ReOrderManagerReorderArticlesId, ReOrderManagerReorderArticles4Public ThisVal) throws PersistenceException {
        
    }

}

