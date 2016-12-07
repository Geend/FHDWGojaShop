package persistence;


public interface PersistentComponentContainerImplementation extends Anything, CompHierarchyHIERARCHY, ComponentContainer, AbstractPersistentProxi, ComponentContainerImplementation4Public {
    
    public void setComponents(ComponentContainerImplementationComponents4Public newValue) throws PersistenceException , model.CycleException;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentComponentContainerImplementation getThis() throws PersistenceException ;
    
    
    public void components_update(final model.meta.ComponentMssgs event) 
				throws PersistenceException;

}

