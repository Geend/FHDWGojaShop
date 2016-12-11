package persistence;


public interface PersistentComponentManager extends Anything, CompHierarchyHIERARCHY, ComponentContainer, AbstractPersistentProxi, ComponentManager4Public {
    
    public ComponentContainerImplementation4Public getContainer() throws PersistenceException ;
    public void setContainer(ComponentContainerImplementation4Public newValue) throws PersistenceException , model.CycleException;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentComponentManager getThis() throws PersistenceException ;
    
    

}

