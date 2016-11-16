package persistence;


public interface PersistentService extends Invoker, Anything, SubjInterface, Remote, AbstractPersistentProxi, Service4Public {
    
    public void setRootProductGroup(ServiceRootProductGroup4Public newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public Service_ErrorsProxi getErrors() throws PersistenceException ;
    public abstract PersistentService getThis() throws PersistenceException ;
    
    
    public RootProductGroup4Public getRootProductGroup() 
				throws PersistenceException;
    public void setRootProductGroup(final RootProductGroup4Public rootProductGroup) 
				throws PersistenceException;
    public void rootProductGroup_update(final model.meta.RootProductGroupMssgs event) 
				throws PersistenceException;

}

