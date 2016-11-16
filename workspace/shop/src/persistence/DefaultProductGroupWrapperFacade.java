package persistence;

import model.*;

public class DefaultProductGroupWrapperFacade{



	public DefaultProductGroupWrapperFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentDefaultProductGroupWrapper newDefaultProductGroupWrapper(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentDefaultProductGroupWrapper)PersistentProxi.createProxi(idCreateIfLessZero, 290);
        long id = ConnectionHandler.getTheConnectionHandler().theComponentWrapperFacade.getNextId();
        DefaultProductGroupWrapper result = new DefaultProductGroupWrapper(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentDefaultProductGroupWrapper)PersistentProxi.createProxi(id, 290);
    }
    
    public PersistentDefaultProductGroupWrapper newDelayedDefaultProductGroupWrapper() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theComponentWrapperFacade.getNextId();
        DefaultProductGroupWrapper result = new DefaultProductGroupWrapper(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentDefaultProductGroupWrapper)PersistentProxi.createProxi(id, 290);
    }
    
    public DefaultProductGroupWrapper getDefaultProductGroupWrapper(long DefaultProductGroupWrapperId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

