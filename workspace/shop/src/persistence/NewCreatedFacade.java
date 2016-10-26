package persistence;

import model.*;

public class NewCreatedFacade{



	public NewCreatedFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentNewCreated newNewCreated(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentNewCreated)PersistentProxi.createProxi(idCreateIfLessZero, 130);
        long id = ConnectionHandler.getTheConnectionHandler().theArticleStateFacade.getNextId();
        NewCreated result = new NewCreated(null,id);
        Cache.getTheCache().put(result);
        return (PersistentNewCreated)PersistentProxi.createProxi(id, 130);
    }
    
    public PersistentNewCreated newDelayedNewCreated() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theArticleStateFacade.getNextId();
        NewCreated result = new NewCreated(null,id);
        Cache.getTheCache().put(result);
        return (PersistentNewCreated)PersistentProxi.createProxi(id, 130);
    }
    
    public NewCreated getNewCreated(long NewCreatedId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

