package persistence;


public interface PersistentProductGroup extends PersistentComponent, ProductGroup4Public {
    
    public ProductGroup_ComponentsProxi getComponents() throws PersistenceException ;
    public PersistentProductGroup getThis() throws PersistenceException ;
    
    

}

