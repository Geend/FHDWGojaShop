package persistence;


public interface PersistentSubProductGroup extends SubComponent, PersistentProductGroup, SubProductGroup4Public {
    
    public ProductGroup4Public getParent() throws PersistenceException ;
    public void setParent(ProductGroup4Public newValue) throws PersistenceException ;
    public PersistentSubProductGroup getThis() throws PersistenceException ;
    
    

}

