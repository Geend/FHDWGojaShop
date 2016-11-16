package persistence;


public interface PersistentProductGroupWrapper extends PersistentComponentWrapper, ProductGroupWrapper4Public {
    
    public abstract PersistentProductGroupWrapper getThis() throws PersistenceException ;
    public ProductGroup4Public getComponent() throws PersistenceException ;
    
    

}

