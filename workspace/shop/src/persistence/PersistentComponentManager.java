package persistence;


public interface PersistentComponentManager extends Anything, CompHierarchyHIERARCHY, ComponentContainer, AbstractPersistentProxi, ComponentManager4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentComponentManager getThis() throws PersistenceException ;
    
    
    public OwnerService4Public getMyServer() 
				throws PersistenceException;

}

