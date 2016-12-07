package persistence;


import model.visitor.*;

public interface ReOrderManager4Public extends Anything, CONCBackgroundTask4Public, AbstractPersistentProxi {
    
    
    public void accept(BackgroundTaskVisitor visitor) throws PersistenceException;
    public <R> R accept(BackgroundTaskReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(BackgroundTaskExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(BackgroundTaskReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void reOrderForPreorder(final ArticleWrapper4Public article, final long quantity, final Invoker invoker) 
				throws PersistenceException;
    public void reOrder(final ArticleWrapper4Public article, final Invoker invoker) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;
    public void reOrderForPreorder(final ArticleWrapper4Public article, final long quantity) 
				throws PersistenceException;
    public void reOrder(final ArticleWrapper4Public article) 
				throws PersistenceException;

}

