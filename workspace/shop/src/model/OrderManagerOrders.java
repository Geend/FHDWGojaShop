
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class OrderManagerOrders extends PersistentObject implements PersistentOrderManagerOrders{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static OrderManagerOrders4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theOrderManagerOrdersFacade.getClass(objectId);
        return (OrderManagerOrders4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static OrderManagerOrders4Public createOrderManagerOrders() throws PersistenceException{
        return createOrderManagerOrders(false);
    }
    
    public static OrderManagerOrders4Public createOrderManagerOrders(boolean delayed$Persistence) throws PersistenceException {
        PersistentOrderManagerOrders result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOrderManagerOrdersFacade
                .newDelayedOrderManagerOrders();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOrderManagerOrdersFacade
                .newOrderManagerOrders(-1);
        }
        while (!(result instanceof OrderManagerOrders)) result = (PersistentOrderManagerOrders)result.getTheObject();
        ((OrderManagerOrders)result).setThis(result);
        return result;
    }
    
    public OrderManagerOrders provideCopy() throws PersistenceException{
        OrderManagerOrders result = this;
        result = new OrderManagerOrders(this.observer, 
                                        this.This, 
                                        this.getId());
        result.observee = this.observee.copy(result);
        
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentOrderManager observer;
    protected OrderManagerOrders_ObserveeProxi observee;
    protected PersistentOrderManagerOrders This;
    
    public OrderManagerOrders(PersistentOrderManager observer,PersistentOrderManagerOrders This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.observer = observer;
        this.observee = new OrderManagerOrders_ObserveeProxi(this);
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 373;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 373) ConnectionHandler.getTheConnectionHandler().theOrderManagerOrdersFacade
            .newOrderManagerOrders(this.getId());
        super.store();
        if(this.getObserver() != null){
            this.getObserver().store();
            ConnectionHandler.getTheConnectionHandler().theOrderManagerOrdersFacade.observerSet(this.getId(), getObserver());
        }
        this.getObservee().store();
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theOrderManagerOrdersFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public OrderManager4Public getObserver() throws PersistenceException {
        return this.observer;
    }
    public void setObserver(OrderManager4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observer)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observer = (PersistentOrderManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOrderManagerOrdersFacade.observerSet(this.getId(), newValue);
        }
    }
    public OrderManagerOrders_ObserveeProxi getObservee() throws PersistenceException {
        return this.observee;
    }
    protected void setThis(PersistentOrderManagerOrders newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentOrderManagerOrders)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOrderManagerOrdersFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentOrderManagerOrders getThis() throws PersistenceException {
        if(this.This == null){
            PersistentOrderManagerOrders result = (PersistentOrderManagerOrders)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentOrderManagerOrders)this.This;
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
    public int getLeafInfo() throws PersistenceException{
        if (this.getObserver() != null) return 1;
        if (this.getObservee().getLength() > 0) return 1;
        return 0;
    }
    
    
    public void add(final Order4Public observee) 
				throws PersistenceException{
        this.getObservee().add(observee);
    }
    public <E extends model.UserException,R> R aggregateException(final persistence.AggregtionException<Order4Public,R,E> aggregtion) 
				throws E, PersistenceException{
        return this.getObservee().aggregateException(aggregtion);
    }
    public <R> R aggregate(final persistence.Aggregtion<Order4Public,R> aggregtion) 
				throws PersistenceException{
        return this.getObservee().aggregate(aggregtion);
    }
    public <E extends model.UserException> void applyToAllException(final persistence.ProcdureException<Order4Public,E> procdure) 
				throws E, PersistenceException{
        this.getObservee().applyToAllException(procdure);
    }
    public void applyToAll(final persistence.Procdure<Order4Public> procdure) 
				throws PersistenceException{
        this.getObservee().applyToAll(procdure);
    }
    public <E extends model.UserException> void filterException(final persistence.PredcateException<Order4Public,E> predcate) 
				throws E, PersistenceException{
        this.getObservee().filterException(predcate);
    }
    public void filter(final persistence.Predcate<Order4Public> predcate) 
				throws PersistenceException{
        this.getObservee().filter(predcate);
    }
    public <E extends model.UserException> SearchListRoot<Order4Public> findAllException(final persistence.PredcateException<Order4Public,E> predcate) 
				throws E, PersistenceException{
        return this.getObservee().findAllException(predcate);
    }
    public SearchListRoot<Order4Public> findAll(final persistence.Predcate<Order4Public> predcate) 
				throws PersistenceException{
        return this.getObservee().findAll(predcate);
    }
    public <E extends model.UserException> Order4Public findFirstException(final persistence.PredcateException<Order4Public,E> predcate) 
				throws E, PersistenceException{
        return this.getObservee().findFirstException(predcate);
    }
    public Order4Public findFirst(final persistence.Predcate<Order4Public> predcate) 
				throws PersistenceException{
        return this.getObservee().findFirst(predcate);
    }
    public long getLength() 
				throws PersistenceException{
        		return this.getObservee().getLength();
    }
    public OrderSearchList getList() 
				throws PersistenceException{
        return this.getObservee().getList();
    }
    public java.util.Iterator<Order4Public> iterator() 
				throws PersistenceException{
        return this.getObservee().iterator();
    }
    public <E extends model.UserException> void removeFirstFailureException(final persistence.PredcateException<Order4Public,E> predcate) 
				throws E, PersistenceException{
        this.getObservee().removeFirstFailureException(predcate);
    }
    public void removeFirstFailure(final persistence.Predcate<Order4Public> predcate) 
				throws PersistenceException{
        this.getObservee().removeFirstFailure(predcate);
    }
    public <E extends model.UserException> void removeFirstSuccessException(final persistence.PredcateException<Order4Public,E> predcate) 
				throws E, PersistenceException{
        this.getObservee().removeFirstSuccessException(predcate);
    }
    public void removeFirstSuccess(final persistence.Predcate<Order4Public> predcate) 
				throws PersistenceException{
        this.getObservee().removeFirstSuccess(predcate);
    }
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        this.observer.getThis().orders_update((model.meta.OrderMssgs)event);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
