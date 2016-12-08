
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class OwnerServiceReOrderManager extends PersistentObject implements PersistentOwnerServiceReOrderManager{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static OwnerServiceReOrderManager4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theOwnerServiceReOrderManagerFacade.getClass(objectId);
        return (OwnerServiceReOrderManager4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static OwnerServiceReOrderManager4Public createOwnerServiceReOrderManager() throws PersistenceException{
        return createOwnerServiceReOrderManager(false);
    }
    
    public static OwnerServiceReOrderManager4Public createOwnerServiceReOrderManager(boolean delayed$Persistence) throws PersistenceException {
        PersistentOwnerServiceReOrderManager result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOwnerServiceReOrderManagerFacade
                .newDelayedOwnerServiceReOrderManager();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOwnerServiceReOrderManagerFacade
                .newOwnerServiceReOrderManager(-1);
        }
        while (!(result instanceof OwnerServiceReOrderManager)) result = (PersistentOwnerServiceReOrderManager)result.getTheObject();
        ((OwnerServiceReOrderManager)result).setThis(result);
        return result;
    }
    
    public OwnerServiceReOrderManager provideCopy() throws PersistenceException{
        OwnerServiceReOrderManager result = this;
        result = new OwnerServiceReOrderManager(this.observer, 
                                                this.observee, 
                                                this.This, 
                                                this.getId());
        
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentOwnerService observer;
    protected PersistentReOrderManager observee;
    protected PersistentOwnerServiceReOrderManager This;
    
    public OwnerServiceReOrderManager(PersistentOwnerService observer,PersistentReOrderManager observee,PersistentOwnerServiceReOrderManager This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.observer = observer;
        this.observee = observee;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 442;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 442) ConnectionHandler.getTheConnectionHandler().theOwnerServiceReOrderManagerFacade
            .newOwnerServiceReOrderManager(this.getId());
        super.store();
        if(this.getObserver() != null){
            this.getObserver().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceReOrderManagerFacade.observerSet(this.getId(), getObserver());
        }
        if(this.getObservee() != null){
            this.getObservee().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceReOrderManagerFacade.observeeSet(this.getId(), getObservee());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceReOrderManagerFacade.ThisSet(this.getId(), getThis());
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
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceReOrderManagerFacade.observerSet(this.getId(), newValue);
        }
    }
    public ReOrderManager4Public getObservee() throws PersistenceException {
        return this.observee;
    }
    public void setObservee(ReOrderManager4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observee)) return;
        ReOrderManager4Public oldValue =  this.getObservee();
        if (oldValue != null) oldValue.deregister(this);
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observee = (PersistentReOrderManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceReOrderManagerFacade.observeeSet(this.getId(), newValue);
        }
        newValue.register(this);
    }
    protected void setThis(PersistentOwnerServiceReOrderManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentOwnerServiceReOrderManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceReOrderManagerFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentOwnerServiceReOrderManager getThis() throws PersistenceException {
        if(this.This == null){
            PersistentOwnerServiceReOrderManager result = (PersistentOwnerServiceReOrderManager)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentOwnerServiceReOrderManager)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOwnerServiceReOrderManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerServiceReOrderManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerServiceReOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerServiceReOrderManager(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOwnerServiceReOrderManager(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerServiceReOrderManager(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerServiceReOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerServiceReOrderManager(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getObserver() != null) return 1;
        if (this.getObservee() != null) return 1;
        return 0;
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        this.observer.getThis().reOrderManager_update((model.meta.ReOrderManagerMssgs)event);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
