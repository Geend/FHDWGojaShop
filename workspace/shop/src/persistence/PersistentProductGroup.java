package persistence;


public interface PersistentProductGroup extends ComponentContainer, PersistentComponent, ProductGroup4Public {
    
    public PersistentProductGroup getThis() throws PersistenceException ;
    
    

}

