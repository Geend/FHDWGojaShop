package persistence;


import model.visitor.*;

public interface BackgroundTask4Public extends Anything, SubjInterface, AbstractPersistentProxi {
    
    
    public void accept(BackgroundTaskVisitor visitor) throws PersistenceException;
    public <R> R accept(BackgroundTaskReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(BackgroundTaskExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(BackgroundTaskReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void step() 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;
    public void startTask(final long tickTime) 
				throws PersistenceException;
    public void stepImplementation() 
				throws PersistenceException;
    public void stopTask() 
				throws PersistenceException;

}

