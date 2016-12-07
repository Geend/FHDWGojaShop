package persistence;


public interface PersistentComponent extends Anything, CompHierarchyHIERARCHY, SubjInterface, AbstractPersistentProxi, Component4Public {
    
    public ComponentContainer getParent() throws PersistenceException ;
    public void setParent(ComponentContainer newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public abstract PersistentComponent getThis() throws PersistenceException ;
    
    

}

