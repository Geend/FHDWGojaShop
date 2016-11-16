package persistence;

import model.*;

public class OwnerArticleWrapperFacade{



	public OwnerArticleWrapperFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOwnerArticleWrapper newOwnerArticleWrapper(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOwnerArticleWrapper)PersistentProxi.createProxi(idCreateIfLessZero, 295);
        long id = ConnectionHandler.getTheConnectionHandler().theComponentWrapperFacade.getNextId();
        OwnerArticleWrapper result = new OwnerArticleWrapper(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOwnerArticleWrapper)PersistentProxi.createProxi(id, 295);
    }
    
    public PersistentOwnerArticleWrapper newDelayedOwnerArticleWrapper() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theComponentWrapperFacade.getNextId();
        OwnerArticleWrapper result = new OwnerArticleWrapper(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOwnerArticleWrapper)PersistentProxi.createProxi(id, 295);
    }
    
    public OwnerArticleWrapper getOwnerArticleWrapper(long OwnerArticleWrapperId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

