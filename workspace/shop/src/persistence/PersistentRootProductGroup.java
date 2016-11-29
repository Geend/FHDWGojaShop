package persistence;


public interface PersistentRootProductGroup extends PersistentProductGroup, RootProductGroup4Public {
    
    public PersistentRootProductGroup getThis() throws PersistenceException ;
    
    
    public OwnerService4Public getMyServer() 
				throws PersistenceException;

}

