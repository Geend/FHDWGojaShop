package persistence;


public interface PersistentComponent extends Anything, CompHierarchyHIERARCHY, AbstractPersistentProxi, Component4Public {
    
    public void setName(String newValue) throws PersistenceException ;
    public abstract PersistentComponent getThis() throws PersistenceException ;
    
    

}

