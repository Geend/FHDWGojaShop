package persistence;

import model.*;

public class NotInSaleFacade{



	public NotInSaleFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentNotInSale newNotInSale(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentNotInSale)PersistentProxi.createProxi(idCreateIfLessZero, 195);
        long id = ConnectionHandler.getTheConnectionHandler().theArticleStateFacade.getNextId();
        NotInSale result = new NotInSale(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentNotInSale)PersistentProxi.createProxi(id, 195);
    }
    
    public PersistentNotInSale newDelayedNotInSale() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theArticleStateFacade.getNextId();
        NotInSale result = new NotInSale(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentNotInSale)PersistentProxi.createProxi(id, 195);
    }
    
    public NotInSale getNotInSale(long NotInSaleId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

