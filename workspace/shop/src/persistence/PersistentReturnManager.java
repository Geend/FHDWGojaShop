package persistence;


public interface PersistentReturnManager extends Anything, SubjInterface, AbstractPersistentProxi, ReturnManager4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentReturnManager getThis() throws PersistenceException ;
    
    
    public OwnerService4Public getMyServer() 
				throws PersistenceException;

}

