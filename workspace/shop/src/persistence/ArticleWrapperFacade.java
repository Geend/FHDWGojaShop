package persistence;

import model.*;

public class ArticleWrapperFacade{



	public ArticleWrapperFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentArticleWrapper newArticleWrapper(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentArticleWrapper)PersistentProxi.createProxi(idCreateIfLessZero, 242);
        long id = ConnectionHandler.getTheConnectionHandler().theComponentFacade.getNextId();
        ArticleWrapper result = new ArticleWrapper(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentArticleWrapper)PersistentProxi.createProxi(id, 242);
    }
    
    public PersistentArticleWrapper newDelayedArticleWrapper() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theComponentFacade.getNextId();
        ArticleWrapper result = new ArticleWrapper(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentArticleWrapper)PersistentProxi.createProxi(id, 242);
    }
    
    public ArticleWrapper getArticleWrapper(long ArticleWrapperId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void articleSet(long ArticleWrapperId, Article4Public articleVal) throws PersistenceException {
        
    }
    public ArticleWrapperSearchList inverseGetArticle(long objectId, long classId)throws PersistenceException{
        ArticleWrapperSearchList result = new ArticleWrapperSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(242);
        while (candidates.hasNext()){
            PersistentArticleWrapper current = (PersistentArticleWrapper)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getArticle() != null){
                if (current.getArticle().getClassId() == classId && current.getArticle().getId() == objectId) {
                    PersistentArticleWrapper proxi = (PersistentArticleWrapper)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentArticleWrapper)proxi.getThis());
                }
            }
        }
        return result;
    }

}

