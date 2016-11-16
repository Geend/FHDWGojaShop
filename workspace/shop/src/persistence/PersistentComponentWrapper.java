package persistence;


public interface PersistentComponentWrapper extends Anything, CompHierarchyHIERARCHY, SubjInterface, AbstractPersistentProxi, ComponentWrapper4Public {
    
    public void setComponent(Component4Public newValue) throws PersistenceException , model.CycleException;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public abstract PersistentComponentWrapper getThis() throws PersistenceException ;
    
    

}

