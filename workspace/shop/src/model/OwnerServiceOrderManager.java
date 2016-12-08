
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class OwnerServiceOrderManager extends PersistentObject implements PersistentOwnerServiceOrderManager{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static OwnerServiceOrderManager4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theOwnerServiceOrderManagerFacade.getClass(objectId);
        return (OwnerServiceOrderManager4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static OwnerServiceOrderManager4Public createOwnerServiceOrderManager() throws PersistenceException{
        return createOwnerServiceOrderManager(false);
    }
    
    public static OwnerServiceOrderManager4Public createOwnerServiceOrderManager(boolean delayed$Persistence) throws PersistenceException {
        PersistentOwnerServiceOrderManager result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOwnerServiceOrderManagerFacade
                .newDelayedOwnerServiceOrderManager();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOwnerServiceOrderManagerFacade
                .newOwnerServiceOrderManager(-1);
        }
        while (!(result instanceof OwnerServiceOrderManager)) result = (PersistentOwnerServiceOrderManager)result.getTheObject();
        ((OwnerServiceOrderManager)result).setThis(result);
        return result;
    }
    
    public OwnerServiceOrderManager provideCopy() throws PersistenceException{
        OwnerServiceOrderManager result = this;
        result = new OwnerServiceOrderManager(this.observer, 
                                              this.observee, 
                                              this.This, 
                                              this.getId());
        
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentOwnerService observer;
    protected PersistentGlobalOrderManager observee;
    protected PersistentOwnerServiceOrderManager This;
    
    public OwnerServiceOrderManager(PersistentOwnerService observer,PersistentGlobalOrderManager observee,PersistentOwnerServiceOrderManager This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.observer = observer;
        this.observee = observee;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 444;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 444) ConnectionHandler.getTheConnectionHandler().theOwnerServiceOrderManagerFacade
            .newOwnerServiceOrderManager(this.getId());
        super.store();
        if(this.getObserver() != null){
            this.getObserver().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceOrderManagerFacade.observerSet(this.getId(), getObserver());
        }
        if(this.getObservee() != null){
            this.getObservee().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceOrderManagerFacade.observeeSet(this.getId(), getObservee());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceOrderManagerFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public OwnerService4Public getObserver() throws PersistenceException {
        return this.observer;
    }
    public void setObserver(OwnerService4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observer)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observer = (PersistentOwnerService)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceOrderManagerFacade.observerSet(this.getId(), newValue);
        }
    }
    public GlobalOrderManager4Public getObservee() throws PersistenceException {
        return this.observee;
    }
    public void setObservee(GlobalOrderManager4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observee)) return;
        GlobalOrderManager4Public oldValue =  this.getObservee();
        if (oldValue != null) oldValue.deregister(this);
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observee = (PersistentGlobalOrderManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceOrderManagerFacade.observeeSet(this.getId(), newValue);
        }
        newValue.register(this);
    }
    protected void setThis(PersistentOwnerServiceOrderManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentOwnerServiceOrderManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceOrderManagerFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentOwnerServiceOrderManager getThis() throws PersistenceException {
        if(this.This == null){
            PersistentOwnerServiceOrderManager result = (PersistentOwnerServiceOrderManager)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentOwnerServiceOrderManager)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOwnerServiceOrderManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerServiceOrderManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerServiceOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerServiceOrderManager(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOwnerServiceOrderManager(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerServiceOrderManager(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerServiceOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerServiceOrderManager(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getObserver() != null) return 1;
        if (this.getObservee() != null) return 1;
        return 0;
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        this.observer.getThis().orderManager_update((model.meta.GlobalOrderManagerMssgs)event);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
