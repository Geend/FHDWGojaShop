package persistence;

import model.*;

public class ProductGroupComponentsFacade{

	static private Long sequencer = new Long(0);

	static protected long getTheNextId(){
		long result = -1;
		synchronized (sequencer) { 
			result = sequencer.longValue() + 1;
			sequencer = new Long(result);
		}
		return result;
	}

	protected long getNextId(){
		return getTheNextId();
	}

	

	public ProductGroupComponentsFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentProductGroupComponents newProductGroupComponents(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentProductGroupComponents)PersistentProxi.createProxi(idCreateIfLessZero, 284);
        long id = ConnectionHandler.getTheConnectionHandler().theProductGroupComponentsFacade.getNextId();
        ProductGroupComponents result = new ProductGroupComponents(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentProductGroupComponents)PersistentProxi.createProxi(id, 284);
    }
    
    public PersistentProductGroupComponents newDelayedProductGroupComponents() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theProductGroupComponentsFacade.getNextId();
        ProductGroupComponents result = new ProductGroupComponents(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentProductGroupComponents)PersistentProxi.createProxi(id, 284);
    }
    
    public ProductGroupComponents getProductGroupComponents(long ProductGroupComponentsId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 284)) return 284;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long ProductGroupComponentsId, ProductGroup4Public observerVal) throws PersistenceException {
        
    }
    public long observeeAdd(long ProductGroupComponentsId, ComponentWrapper4Public observeeVal) throws PersistenceException {
        return 0;
    }
    public void observeeRem(long observeeId) throws PersistenceException {
        
    }
    public ComponentWrapperList observeeGet(long ProductGroupComponentsId) throws PersistenceException {
        return new ComponentWrapperList(); // remote access for initialization only!
    }
    public void ThisSet(long ProductGroupComponentsId, ProductGroupComponents4Public ThisVal) throws PersistenceException {
        
    }

}

