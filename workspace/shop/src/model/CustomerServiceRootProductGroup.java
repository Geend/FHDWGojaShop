
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CustomerServiceRootProductGroup extends PersistentObject implements PersistentCustomerServiceRootProductGroup{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static CustomerServiceRootProductGroup4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theCustomerServiceRootProductGroupFacade.getClass(objectId);
        return (CustomerServiceRootProductGroup4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static CustomerServiceRootProductGroup4Public createCustomerServiceRootProductGroup() throws PersistenceException{
        return createCustomerServiceRootProductGroup(false);
    }
    
    public static CustomerServiceRootProductGroup4Public createCustomerServiceRootProductGroup(boolean delayed$Persistence) throws PersistenceException {
        PersistentCustomerServiceRootProductGroup result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerServiceRootProductGroupFacade
                .newDelayedCustomerServiceRootProductGroup();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerServiceRootProductGroupFacade
                .newCustomerServiceRootProductGroup(-1);
        }
        while (!(result instanceof CustomerServiceRootProductGroup)) result = (PersistentCustomerServiceRootProductGroup)result.getTheObject();
        ((CustomerServiceRootProductGroup)result).setThis(result);
        return result;
    }
    
    public CustomerServiceRootProductGroup provideCopy() throws PersistenceException{
        CustomerServiceRootProductGroup result = this;
        result = new CustomerServiceRootProductGroup(this.observer, 
                                                     this.observee, 
                                                     this.This, 
                                                     this.getId());
        
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentCustomerService observer;
    protected PersistentRootProductGroup observee;
    protected PersistentCustomerServiceRootProductGroup This;
    
    public CustomerServiceRootProductGroup(PersistentCustomerService observer,PersistentRootProductGroup observee,PersistentCustomerServiceRootProductGroup This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.observer = observer;
        this.observee = observee;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 322;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 322) ConnectionHandler.getTheConnectionHandler().theCustomerServiceRootProductGroupFacade
            .newCustomerServiceRootProductGroup(this.getId());
        super.store();
        if(this.getObserver() != null){
            this.getObserver().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceRootProductGroupFacade.observerSet(this.getId(), getObserver());
        }
        if(this.getObservee() != null){
            this.getObservee().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceRootProductGroupFacade.observeeSet(this.getId(), getObservee());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceRootProductGroupFacade.ThisSet(this.getId(), getThis());
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
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceRootProductGroupFacade.observerSet(this.getId(), newValue);
        }
    }
    public RootProductGroup4Public getObservee() throws PersistenceException {
        return this.observee;
    }
    public void setObservee(RootProductGroup4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observee)) return;
        RootProductGroup4Public oldValue =  this.getObservee();
        if (oldValue != null) oldValue.deregister(this);
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observee = (PersistentRootProductGroup)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceRootProductGroupFacade.observeeSet(this.getId(), newValue);
        }
        newValue.register(this);
    }
    protected void setThis(PersistentCustomerServiceRootProductGroup newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentCustomerServiceRootProductGroup)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceRootProductGroupFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentCustomerServiceRootProductGroup getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCustomerServiceRootProductGroup result = (PersistentCustomerServiceRootProductGroup)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCustomerServiceRootProductGroup)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerServiceRootProductGroup(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerServiceRootProductGroup(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerServiceRootProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerServiceRootProductGroup(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerServiceRootProductGroup(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerServiceRootProductGroup(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerServiceRootProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerServiceRootProductGroup(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getObserver() != null) return 1;
        if (this.getObservee() != null) return 1;
        return 0;
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        this.observer.getThis().rootProductGroup_update((model.meta.RootProductGroupMssgs)event);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
