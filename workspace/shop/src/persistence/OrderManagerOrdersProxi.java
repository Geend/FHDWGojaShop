package persistence;



import model.visitor.*;

public class OrderManagerOrdersProxi extends PersistentProxi implements PersistentOrderManagerOrders{
    
    public OrderManagerOrdersProxi(long objectId) {
        super(objectId);
    }
    public OrderManagerOrdersProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 373;
    }
    
    public OrderManager4Public getObserver() throws PersistenceException {
        return ((PersistentOrderManagerOrders)this.getTheObject()).getObserver();
    }
    public void setObserver(OrderManager4Public newValue) throws PersistenceException {
        ((PersistentOrderManagerOrders)this.getTheObject()).setObserver(newValue);
    }
    public OrderManagerOrders_ObserveeProxi getObservee() throws PersistenceException {
        return ((PersistentOrderManagerOrders)this.getTheObject()).getObservee();
    }
    public PersistentOrderManagerOrders getThis() throws PersistenceException {
        return ((PersistentOrderManagerOrders)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOrderManagerOrders(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderManagerOrders(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderManagerOrders(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderManagerOrders(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOrderManagerOrders(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderManagerOrders(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderManagerOrders(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderManagerOrders(this);
    }
    
    
    public void add(final Order4Public observee) 
				throws PersistenceException{
        ((PersistentOrderManagerOrders)this.getTheObject()).add(observee);
    }
    public <E extends model.UserException,R> R aggregateException(final persistence.AggregtionException<Order4Public,R,E> aggregtion) 
				throws E, PersistenceException{
        return ((PersistentOrderManagerOrders)this.getTheObject()).aggregateException(aggregtion);
    }
    public <R> R aggregate(final persistence.Aggregtion<Order4Public,R> aggregtion) 
				throws PersistenceException{
        return ((PersistentOrderManagerOrders)this.getTheObject()).aggregate(aggregtion);
    }
    public <E extends model.UserException> void applyToAllException(final persistence.ProcdureException<Order4Public,E> procdure) 
				throws E, PersistenceException{
        ((PersistentOrderManagerOrders)this.getTheObject()).applyToAllException(procdure);
    }
    public void applyToAll(final persistence.Procdure<Order4Public> procdure) 
				throws PersistenceException{
        ((PersistentOrderManagerOrders)this.getTheObject()).applyToAll(procdure);
    }
    public <E extends model.UserException> void filterException(final persistence.PredcateException<Order4Public,E> predcate) 
				throws E, PersistenceException{
        ((PersistentOrderManagerOrders)this.getTheObject()).filterException(predcate);
    }
    public void filter(final persistence.Predcate<Order4Public> predcate) 
				throws PersistenceException{
        ((PersistentOrderManagerOrders)this.getTheObject()).filter(predcate);
    }
    public <E extends model.UserException> SearchListRoot<Order4Public> findAllException(final persistence.PredcateException<Order4Public,E> predcate) 
				throws E, PersistenceException{
        return ((PersistentOrderManagerOrders)this.getTheObject()).findAllException(predcate);
    }
    public SearchListRoot<Order4Public> findAll(final persistence.Predcate<Order4Public> predcate) 
				throws PersistenceException{
        return ((PersistentOrderManagerOrders)this.getTheObject()).findAll(predcate);
    }
    public <E extends model.UserException> Order4Public findFirstException(final persistence.PredcateException<Order4Public,E> predcate) 
				throws E, PersistenceException{
        return ((PersistentOrderManagerOrders)this.getTheObject()).findFirstException(predcate);
    }
    public Order4Public findFirst(final persistence.Predcate<Order4Public> predcate) 
				throws PersistenceException{
        return ((PersistentOrderManagerOrders)this.getTheObject()).findFirst(predcate);
    }
    public long getLength() 
				throws PersistenceException{
        return ((PersistentOrderManagerOrders)this.getTheObject()).getLength();
    }
    public OrderSearchList getList() 
				throws PersistenceException{
        return ((PersistentOrderManagerOrders)this.getTheObject()).getList();
    }
    public java.util.Iterator<Order4Public> iterator() 
				throws PersistenceException{
        return ((PersistentOrderManagerOrders)this.getTheObject()).iterator();
    }
    public <E extends model.UserException> void removeFirstFailureException(final persistence.PredcateException<Order4Public,E> predcate) 
				throws E, PersistenceException{
        ((PersistentOrderManagerOrders)this.getTheObject()).removeFirstFailureException(predcate);
    }
    public void removeFirstFailure(final persistence.Predcate<Order4Public> predcate) 
				throws PersistenceException{
        ((PersistentOrderManagerOrders)this.getTheObject()).removeFirstFailure(predcate);
    }
    public <E extends model.UserException> void removeFirstSuccessException(final persistence.PredcateException<Order4Public,E> predcate) 
				throws E, PersistenceException{
        ((PersistentOrderManagerOrders)this.getTheObject()).removeFirstSuccessException(predcate);
    }
    public void removeFirstSuccess(final persistence.Predcate<Order4Public> predcate) 
				throws PersistenceException{
        ((PersistentOrderManagerOrders)this.getTheObject()).removeFirstSuccess(predcate);
    }
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentOrderManagerOrders)this.getTheObject()).update(event);
    }

    
}
