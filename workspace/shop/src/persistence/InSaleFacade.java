package persistence;

import model.*;

public class InSaleFacade{



	public InSaleFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentInSale newInSale(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentInSale)PersistentProxi.createProxi(idCreateIfLessZero, 196);
        long id = ConnectionHandler.getTheConnectionHandler().theArticleStateFacade.getNextId();
        InSale result = new InSale(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentInSale)PersistentProxi.createProxi(id, 196);
    }
    
    public PersistentInSale newDelayedInSale() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theArticleStateFacade.getNextId();
        InSale result = new InSale(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentInSale)PersistentProxi.createProxi(id, 196);
    }
    
    public InSale getInSale(long InSaleId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

