package persistence;

import model.*;

public class ProductGroupFacade{



	public ProductGroupFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentProductGroup newProductGroup(String name,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentProductGroup)PersistentProxi.createProxi(idCreateIfLessZero, 121);
        long id = ConnectionHandler.getTheConnectionHandler().theComponentFacade.getNextId();
        ProductGroup result = new ProductGroup(null,null,null,null,name,id);
        Cache.getTheCache().put(result);
        return (PersistentProductGroup)PersistentProxi.createProxi(id, 121);
    }
    
    public PersistentProductGroup newDelayedProductGroup(String name) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theComponentFacade.getNextId();
        ProductGroup result = new ProductGroup(null,null,null,null,name,id);
        Cache.getTheCache().put(result);
        return (PersistentProductGroup)PersistentProxi.createProxi(id, 121);
    }
    
    public ProductGroup getProductGroup(long ProductGroupId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public ProductGroupSearchList getProductGroupByName(String name) throws PersistenceException {
        name = name.replaceAll("%", ".*");
        name = name.replaceAll("_", ".");
        ProductGroupSearchList result = new ProductGroupSearchList();
        java.util.Iterator<?> candidates;
        candidates = Cache.getTheCache().iterator(121);
        while (candidates.hasNext()){
            PersistentProductGroup current = (PersistentProductGroup)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getName().matches(name))
                result.add((PersistentProductGroup)PersistentProxi.createProxi(current.getId(), current.getClassId()));
        }
        return result;
    }
    public void containerSet(long ProductGroupId, ComponentContainerImplementation4Public containerVal) throws PersistenceException {
        
    }
    public void nameSet(long ProductGroupId, String nameVal) throws PersistenceException {
        
    }

}

