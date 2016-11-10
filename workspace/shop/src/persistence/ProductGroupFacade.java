package persistence;

import model.*;

public class ProductGroupFacade{



	public ProductGroupFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentProductGroup newProductGroup(String name,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentProductGroup)PersistentProxi.createProxi(idCreateIfLessZero, 121);
        long id = ConnectionHandler.getTheConnectionHandler().theComponentFacade.getNextId();
        ProductGroup result = new ProductGroup(name,null,id);
        Cache.getTheCache().put(result);
        return (PersistentProductGroup)PersistentProxi.createProxi(id, 121);
    }
    
    public PersistentProductGroup newDelayedProductGroup(String name) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theComponentFacade.getNextId();
        ProductGroup result = new ProductGroup(name,null,id);
        Cache.getTheCache().put(result);
        return (PersistentProductGroup)PersistentProxi.createProxi(id, 121);
    }
    
    public ProductGroup getProductGroup(long ProductGroupId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long componentsAdd(long ProductGroupId, Component4Public componentsVal) throws PersistenceException {
        return 0;
    }
    public void componentsRem(long componentsId) throws PersistenceException {
        
    }
    public ComponentList componentsGet(long ProductGroupId) throws PersistenceException {
        return new ComponentList(); // remote access for initialization only!
    }

}

