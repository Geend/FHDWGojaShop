package persistence;

import model.*;

public class SubProductGroupFacade{



	public SubProductGroupFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentSubProductGroup newSubProductGroup(String name,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentSubProductGroup)PersistentProxi.createProxi(idCreateIfLessZero, 214);
        long id = ConnectionHandler.getTheConnectionHandler().theComponentFacade.getNextId();
        SubProductGroup result = new SubProductGroup(name,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentSubProductGroup)PersistentProxi.createProxi(id, 214);
    }
    
    public PersistentSubProductGroup newDelayedSubProductGroup(String name) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theComponentFacade.getNextId();
        SubProductGroup result = new SubProductGroup(name,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentSubProductGroup)PersistentProxi.createProxi(id, 214);
    }
    
    public SubProductGroup getSubProductGroup(long SubProductGroupId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void parentSet(long SubProductGroupId, ProductGroup4Public parentVal) throws PersistenceException {
        
    }

}

