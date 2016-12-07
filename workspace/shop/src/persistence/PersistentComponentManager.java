package persistence;


public interface PersistentComponentManager extends Anything, ComponentContainer, AbstractPersistentProxi, ComponentManager4Public {
    
    public ComponentContainerImplementation4Public getContainer() throws PersistenceException ;
    public void setContainer(ComponentContainerImplementation4Public newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentComponentManager getThis() throws PersistenceException ;
    
    

}

