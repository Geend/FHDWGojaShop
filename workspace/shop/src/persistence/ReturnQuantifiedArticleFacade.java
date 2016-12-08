package persistence;

import model.*;

public class ReturnQuantifiedArticleFacade{



	public ReturnQuantifiedArticleFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentReturnQuantifiedArticle newReturnQuantifiedArticle(long quantity,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentReturnQuantifiedArticle)PersistentProxi.createProxi(idCreateIfLessZero, 346);
        long id = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticleFacade.getNextId();
        ReturnQuantifiedArticle result = new ReturnQuantifiedArticle(quantity,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentReturnQuantifiedArticle)PersistentProxi.createProxi(id, 346);
    }
    
    public PersistentReturnQuantifiedArticle newDelayedReturnQuantifiedArticle(long quantity) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticleFacade.getNextId();
        ReturnQuantifiedArticle result = new ReturnQuantifiedArticle(quantity,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentReturnQuantifiedArticle)PersistentProxi.createProxi(id, 346);
    }
    
    public ReturnQuantifiedArticle getReturnQuantifiedArticle(long ReturnQuantifiedArticleId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

