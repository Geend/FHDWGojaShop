
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CustomerServiceOrderManager extends PersistentObject implements PersistentCustomerServiceOrderManager{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static CustomerServiceOrderManager4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theCustomerServiceOrderManagerFacade.getClass(objectId);
        return (CustomerServiceOrderManager4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static CustomerServiceOrderManager4Public createCustomerServiceOrderManager() throws PersistenceException{
        return createCustomerServiceOrderManager(false);
    }
    
    public static CustomerServiceOrderManager4Public createCustomerServiceOrderManager(boolean delayed$Persistence) throws PersistenceException {
        PersistentCustomerServiceOrderManager result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerServiceOrderManagerFacade
                .newDelayedCustomerServiceOrderManager();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerServiceOrderManagerFacade
                .newCustomerServiceOrderManager(-1);
        }
        while (!(result instanceof CustomerServiceOrderManager)) result = (PersistentCustomerServiceOrderManager)result.getTheObject();
        ((CustomerServiceOrderManager)result).setThis(result);
        return result;
    }
    
    public CustomerServiceOrderManager provideCopy() throws PersistenceException{
        CustomerServiceOrderManager result = this;
        result = new CustomerServiceOrderManager(this.observer, 
                                                 this.observee, 
                                                 this.This, 
                                                 this.getId());
        
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentCustomerService observer;
    protected PersistentCustomerOrderManager observee;
    protected PersistentCustomerServiceOrderManager This;
    
    public CustomerServiceOrderManager(PersistentCustomerService observer,PersistentCustomerOrderManager observee,PersistentCustomerServiceOrderManager This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.observer = observer;
        this.observee = observee;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 448;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 448) ConnectionHandler.getTheConnectionHandler().theCustomerServiceOrderManagerFacade
            .newCustomerServiceOrderManager(this.getId());
        super.store();
        if(this.getObserver() != null){
            this.getObserver().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceOrderManagerFacade.observerSet(this.getId(), getObserver());
        }
        if(this.getObservee() != null){
            this.getObservee().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceOrderManagerFacade.observeeSet(this.getId(), getObservee());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceOrderManagerFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public CustomerService4Public getObserver() throws PersistenceException {
        return this.observer;
    }
    public void setObserver(CustomerService4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observer)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observer = (PersistentCustomerService)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceOrderManagerFacade.observerSet(this.getId(), newValue);
        }
    }
    public CustomerOrderManager4Public getObservee() throws PersistenceException {
        return this.observee;
    }
    public void setObservee(CustomerOrderManager4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observee)) return;
        CustomerOrderManager4Public oldValue =  this.getObservee();
        if (oldValue != null) oldValue.deregister(this);
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observee = (PersistentCustomerOrderManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceOrderManagerFacade.observeeSet(this.getId(), newValue);
        }
        newValue.register(this);
    }
    protected void setThis(PersistentCustomerServiceOrderManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentCustomerServiceOrderManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceOrderManagerFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentCustomerServiceOrderManager getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCustomerServiceOrderManager result = (PersistentCustomerServiceOrderManager)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCustomerServiceOrderManager)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerServiceOrderManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerServiceOrderManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerServiceOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerServiceOrderManager(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerServiceOrderManager(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerServiceOrderManager(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerServiceOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerServiceOrderManager(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getObserver() != null) return 1;
        if (this.getObservee() != null) return 1;
        return 0;
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        this.observer.getThis().orderManager_update((model.meta.CustomerOrderManagerMssgs)event);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
