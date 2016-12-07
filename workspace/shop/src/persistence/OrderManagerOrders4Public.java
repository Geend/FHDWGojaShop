package persistence;


import model.visitor.*;

public interface OrderManagerOrders4Public extends Anything, PersistentListProxiInterface<Order4Public>, ObsInterface, AbstractPersistentProxi {
    
    public OrderManagerOrders_ObserveeProxi getObservee() throws PersistenceException ;
    
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void add(final Order4Public observee) 
				throws PersistenceException;
    public <E extends model.UserException,R> R aggregateException(final persistence.AggregtionException<Order4Public,R,E> aggregtion) 
				throws E, PersistenceException;
    public <R> R aggregate(final persistence.Aggregtion<Order4Public,R> aggregtion) 
				throws PersistenceException;
    public <E extends model.UserException> void applyToAllException(final persistence.ProcdureException<Order4Public,E> procdure) 
				throws E, PersistenceException;
    public void applyToAll(final persistence.Procdure<Order4Public> procdure) 
				throws PersistenceException;
    public <E extends model.UserException> void filterException(final persistence.PredcateException<Order4Public,E> predcate) 
				throws E, PersistenceException;
    public void filter(final persistence.Predcate<Order4Public> predcate) 
				throws PersistenceException;
    public <E extends model.UserException> SearchListRoot<Order4Public> findAllException(final persistence.PredcateException<Order4Public,E> predcate) 
				throws E, PersistenceException;
    public SearchListRoot<Order4Public> findAll(final persistence.Predcate<Order4Public> predcate) 
				throws PersistenceException;
    public <E extends model.UserException> Order4Public findFirstException(final persistence.PredcateException<Order4Public,E> predcate) 
				throws E, PersistenceException;
    public Order4Public findFirst(final persistence.Predcate<Order4Public> predcate) 
				throws PersistenceException;
    public long getLength() 
				throws PersistenceException;
    public OrderSearchList getList() 
				throws PersistenceException;
    public java.util.Iterator<Order4Public> iterator() 
				throws PersistenceException;
    public <E extends model.UserException> void removeFirstFailureException(final persistence.PredcateException<Order4Public,E> predcate) 
				throws E, PersistenceException;
    public void removeFirstFailure(final persistence.Predcate<Order4Public> predcate) 
				throws PersistenceException;
    public <E extends model.UserException> void removeFirstSuccessException(final persistence.PredcateException<Order4Public,E> predcate) 
				throws E, PersistenceException;
    public void removeFirstSuccess(final persistence.Predcate<Order4Public> predcate) 
				throws PersistenceException;
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException;

}

