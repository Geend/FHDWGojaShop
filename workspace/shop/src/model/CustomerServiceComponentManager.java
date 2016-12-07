
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CustomerServiceComponentManager extends PersistentObject implements PersistentCustomerServiceComponentManager{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static CustomerServiceComponentManager4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theCustomerServiceComponentManagerFacade.getClass(objectId);
        return (CustomerServiceComponentManager4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static CustomerServiceComponentManager4Public createCustomerServiceComponentManager() throws PersistenceException{
        return createCustomerServiceComponentManager(false);
    }
    
    public static CustomerServiceComponentManager4Public createCustomerServiceComponentManager(boolean delayed$Persistence) throws PersistenceException {
        PersistentCustomerServiceComponentManager result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerServiceComponentManagerFacade
                .newDelayedCustomerServiceComponentManager();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerServiceComponentManagerFacade
                .newCustomerServiceComponentManager(-1);
        }
        while (!(result instanceof CustomerServiceComponentManager)) result = (PersistentCustomerServiceComponentManager)result.getTheObject();
        ((CustomerServiceComponentManager)result).setThis(result);
        return result;
    }
    
    public CustomerServiceComponentManager provideCopy() throws PersistenceException{
        CustomerServiceComponentManager result = this;
        result = new CustomerServiceComponentManager(this.observer, 
                                                     this.observee, 
                                                     this.This, 
                                                     this.getId());
        
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentCustomerService observer;
    protected PersistentComponentManager observee;
    protected PersistentCustomerServiceComponentManager This;
    
    public CustomerServiceComponentManager(PersistentCustomerService observer,PersistentComponentManager observee,PersistentCustomerServiceComponentManager This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.observer = observer;
        this.observee = observee;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 380;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 380) ConnectionHandler.getTheConnectionHandler().theCustomerServiceComponentManagerFacade
            .newCustomerServiceComponentManager(this.getId());
        super.store();
        if(this.getObserver() != null){
            this.getObserver().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceComponentManagerFacade.observerSet(this.getId(), getObserver());
        }
        if(this.getObservee() != null){
            this.getObservee().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceComponentManagerFacade.observeeSet(this.getId(), getObservee());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceComponentManagerFacade.ThisSet(this.getId(), getThis());
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
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceComponentManagerFacade.observerSet(this.getId(), newValue);
        }
    }
    public ComponentManager4Public getObservee() throws PersistenceException {
        return this.observee;
    }
    public void setObservee(ComponentManager4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observee)) return;
        ComponentManager4Public oldValue =  this.getObservee();
        if (oldValue != null) oldValue.deregister(this);
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observee = (PersistentComponentManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceComponentManagerFacade.observeeSet(this.getId(), newValue);
        }
        newValue.register(this);
    }
    protected void setThis(PersistentCustomerServiceComponentManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentCustomerServiceComponentManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceComponentManagerFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentCustomerServiceComponentManager getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCustomerServiceComponentManager result = (PersistentCustomerServiceComponentManager)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCustomerServiceComponentManager)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerServiceComponentManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerServiceComponentManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerServiceComponentManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerServiceComponentManager(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerServiceComponentManager(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerServiceComponentManager(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerServiceComponentManager(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerServiceComponentManager(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getObserver() != null) return 1;
        if (this.getObservee() != null) return 1;
        return 0;
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        this.observer.getThis().componentManager_update((model.meta.ComponentManagerMssgs)event);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
