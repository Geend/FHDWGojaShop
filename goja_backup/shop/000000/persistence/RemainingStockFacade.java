package persistence;

import model.*;

public class RemainingStockFacade{



	public RemainingStockFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentRemainingStock newRemainingStock(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentRemainingStock)PersistentProxi.createProxi(idCreateIfLessZero, 122);
        long id = ConnectionHandler.getTheConnectionHandler().theArticleStateFacade.getNextId();
        RemainingStock result = new RemainingStock(null,id);
        Cache.getTheCache().put(result);
        return (PersistentRemainingStock)PersistentProxi.createProxi(id, 122);
    }
    
    public PersistentRemainingStock newDelayedRemainingStock() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theArticleStateFacade.getNextId();
        RemainingStock result = new RemainingStock(null,id);
        Cache.getTheCache().put(result);
        return (PersistentRemainingStock)PersistentProxi.createProxi(id, 122);
    }
    
    public RemainingStock getRemainingStock(long RemainingStockId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

