package persistence;


public interface PersistentOwnerOrderManager extends PersistentOrderManager, OwnerOrderManager4Public {
    
    public PersistentOwnerOrderManager getThis() throws PersistenceException ;
    
    
    public OwnerService4Public getMyServer() 
				throws PersistenceException;

}

