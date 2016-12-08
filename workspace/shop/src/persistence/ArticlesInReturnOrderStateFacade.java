package persistence;

import model.*;

public class ArticlesInReturnOrderStateFacade{



	public ArticlesInReturnOrderStateFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentArticlesInReturnOrderState newArticlesInReturnOrderState(long ticksLeft,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentArticlesInReturnOrderState)PersistentProxi.createProxi(idCreateIfLessZero, 361);
        long id = ConnectionHandler.getTheConnectionHandler().theOrderStatusFacade.getNextId();
        ArticlesInReturnOrderState result = new ArticlesInReturnOrderState(null,null,null,ticksLeft,id);
        Cache.getTheCache().put(result);
        return (PersistentArticlesInReturnOrderState)PersistentProxi.createProxi(id, 361);
    }
    
    public PersistentArticlesInReturnOrderState newDelayedArticlesInReturnOrderState(long ticksLeft) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderStatusFacade.getNextId();
        ArticlesInReturnOrderState result = new ArticlesInReturnOrderState(null,null,null,ticksLeft,id);
        Cache.getTheCache().put(result);
        return (PersistentArticlesInReturnOrderState)PersistentProxi.createProxi(id, 361);
    }
    
    public ArticlesInReturnOrderState getArticlesInReturnOrderState(long ArticlesInReturnOrderStateId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void articleReturnSet(long ArticlesInReturnOrderStateId, ArticleReturn4Public articleReturnVal) throws PersistenceException {
        
    }
    public void ticksLeftSet(long ArticlesInReturnOrderStateId, long ticksLeftVal) throws PersistenceException {
        
    }

}

