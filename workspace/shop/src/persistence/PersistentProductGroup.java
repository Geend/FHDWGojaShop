package persistence;


public interface PersistentProductGroup extends ComponentContainer, PersistentComponent, ProductGroup4Public {
    
    public ComponentContainerImplementation4Public getContainer() throws PersistenceException ;
    public void setContainer(ComponentContainerImplementation4Public newValue) throws PersistenceException ;
    public PersistentProductGroup getThis() throws PersistenceException ;
    
    

}

