package persistence;

import model.*;

public class ArticleReturnFacade{

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

	

	public ArticleReturnFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentArticleReturn newArticleReturn(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentArticleReturn)PersistentProxi.createProxi(idCreateIfLessZero, 349);
        long id = ConnectionHandler.getTheConnectionHandler().theArticleReturnFacade.getNextId();
        ArticleReturn result = new ArticleReturn(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentArticleReturn)PersistentProxi.createProxi(id, 349);
    }
    
    public PersistentArticleReturn newDelayedArticleReturn() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theArticleReturnFacade.getNextId();
        ArticleReturn result = new ArticleReturn(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentArticleReturn)PersistentProxi.createProxi(id, 349);
    }
    
    public ArticleReturn getArticleReturn(long ArticleReturnId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 349)) return 349;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void orderSet(long ArticleReturnId, Order4Public orderVal) throws PersistenceException {
        
    }
    public long returnArticlesAdd(long ArticleReturnId, ReturnQuantifiedArticle4Public returnArticlesVal) throws PersistenceException {
        return 0;
    }
    public void returnArticlesRem(long returnArticlesId) throws PersistenceException {
        
    }
    public ReturnQuantifiedArticleList returnArticlesGet(long ArticleReturnId) throws PersistenceException {
        return new ReturnQuantifiedArticleList(); // remote access for initialization only!
    }
    public void subServiceSet(long ArticleReturnId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ArticleReturnId, ArticleReturn4Public ThisVal) throws PersistenceException {
        
    }
    public ArticleReturnSearchList inverseGetOrder(long objectId, long classId)throws PersistenceException{
        ArticleReturnSearchList result = new ArticleReturnSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(349);
        while (candidates.hasNext()){
            PersistentArticleReturn current = (PersistentArticleReturn)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getOrder() != null){
                if (current.getOrder().getClassId() == classId && current.getOrder().getId() == objectId) {
                    PersistentArticleReturn proxi = (PersistentArticleReturn)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentArticleReturn)proxi.getThis());
                }
            }
        }
        return result;
    }

}

