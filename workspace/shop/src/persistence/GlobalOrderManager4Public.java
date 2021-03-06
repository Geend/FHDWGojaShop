package persistence;


import model.visitor.*;

public interface GlobalOrderManager4Public extends CONCBackgroundTask4Public, OrderManager4Public {
    
    
    public void accept(OrderManagerVisitor visitor) throws PersistenceException;
    public <R> R accept(OrderManagerReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(OrderManagerExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(OrderManagerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(BackgroundTaskVisitor visitor) throws PersistenceException;
    public <R> R accept(BackgroundTaskReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(BackgroundTaskExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(BackgroundTaskReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void handleOrderArticlesInReturnOrderState(final Order4Public order, final ArticlesInReturnOrderState4Public articlesInReturnOrderState) 
				throws PersistenceException;
    public void handleOrderInTransitOrderState(final Order4Public order, final InTransitOrderState4Public inTransitOrderState) 
				throws PersistenceException;
    public void handleOrderPreOrderState(final Order4Public order, final PreOrderState4Public preOrderState) 
				throws PersistenceException;
    public void handleOrderWaitingForAcceptOrderState(final Order4Public order, final WaitingForAcceptOrderState4Public waitingForAcceptOrderState) 
				throws PersistenceException;
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void addOrder(final Order4Public order) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void finishOrder(final Order4Public order) 
				throws PersistenceException;
    public void handleOrderArticlesInReturnOrderStateImplementation(final Order4Public order, final ArticlesInReturnOrderState4Public articlesInReturnOrderState) 
				throws PersistenceException;
    public void handleOrderInTransitOrderStateImplementation(final Order4Public order, final InTransitOrderState4Public inTransitOrderState) 
				throws PersistenceException;
    public void handleOrderPreOrderStateImplementation(final Order4Public order, final PreOrderState4Public preOrderState) 
				throws PersistenceException;
    public void handleOrderWaitingForAcceptOrderStateImplementation(final Order4Public order, final WaitingForAcceptOrderState4Public waitingForAcceptOrderState) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;

}

