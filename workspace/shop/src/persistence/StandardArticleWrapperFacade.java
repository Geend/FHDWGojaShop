package persistence;

import model.*;

public class StandardArticleWrapperFacade{



	public StandardArticleWrapperFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentStandardArticleWrapper newStandardArticleWrapper(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentStandardArticleWrapper)PersistentProxi.createProxi(idCreateIfLessZero, 294);
        long id = ConnectionHandler.getTheConnectionHandler().theComponentWrapperFacade.getNextId();
        StandardArticleWrapper result = new StandardArticleWrapper(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentStandardArticleWrapper)PersistentProxi.createProxi(id, 294);
    }
    
    public PersistentStandardArticleWrapper newDelayedStandardArticleWrapper() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theComponentWrapperFacade.getNextId();
        StandardArticleWrapper result = new StandardArticleWrapper(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentStandardArticleWrapper)PersistentProxi.createProxi(id, 294);
    }
    
    public StandardArticleWrapper getStandardArticleWrapper(long StandardArticleWrapperId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

