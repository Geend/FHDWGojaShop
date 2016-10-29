package persistence;


public interface PersistentComponentLst extends Anything, AbstractPersistentProxi, ComponentLst4Public {
    
    public ComponentLst_CurrentComponentsProxi getCurrentComponents() throws PersistenceException ;
    public PersistentComponentLst getThis() throws PersistenceException ;
    
    
    public Server4Public getMyServer() 
				throws PersistenceException;

}

