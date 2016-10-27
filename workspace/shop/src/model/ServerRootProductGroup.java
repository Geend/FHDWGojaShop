
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ServerRootProductGroup extends PersistentObject implements PersistentServerRootProductGroup{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentServerRootProductGroup getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theServerRootProductGroupFacade.getClass(objectId);
        return (PersistentServerRootProductGroup)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentServerRootProductGroup createServerRootProductGroup() throws PersistenceException{
        return createServerRootProductGroup(false);
    }
    
    public static PersistentServerRootProductGroup createServerRootProductGroup(boolean delayed$Persistence) throws PersistenceException {
        PersistentServerRootProductGroup result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theServerRootProductGroupFacade
                .newDelayedServerRootProductGroup();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theServerRootProductGroupFacade
                .newServerRootProductGroup(-1);
        }
        while (!(result instanceof ServerRootProductGroup)) result = (PersistentServerRootProductGroup)result.getTheObject();
        ((ServerRootProductGroup)result).setThis(result);
        return result;
    }
    
    public ServerRootProductGroup provideCopy() throws PersistenceException{
        ServerRootProductGroup result = this;
        result = new ServerRootProductGroup(this.observer, 
                                            this.observee, 
                                            this.This, 
                                            this.getId());
        
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentServer observer;
    protected PersistentProductGroup observee;
    protected PersistentServerRootProductGroup This;
    
    public ServerRootProductGroup(PersistentServer observer,PersistentProductGroup observee,PersistentServerRootProductGroup This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.observer = observer;
        this.observee = observee;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 174;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 174) ConnectionHandler.getTheConnectionHandler().theServerRootProductGroupFacade
            .newServerRootProductGroup(this.getId());
        super.store();
        if(this.getObserver() != null){
            this.getObserver().store();
            ConnectionHandler.getTheConnectionHandler().theServerRootProductGroupFacade.observerSet(this.getId(), getObserver());
        }
        if(this.getObservee() != null){
            this.getObservee().store();
            ConnectionHandler.getTheConnectionHandler().theServerRootProductGroupFacade.observeeSet(this.getId(), getObservee());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theServerRootProductGroupFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public PersistentServer getObserver() throws PersistenceException {
        return this.observer;
    }
    public void setObserver(PersistentServer newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observer)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observer = (PersistentServer)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theServerRootProductGroupFacade.observerSet(this.getId(), newValue);
        }
    }
    public PersistentProductGroup getObservee() throws PersistenceException {
        return this.observee;
    }
    public void setObservee(PersistentProductGroup newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observee)) return;
        PersistentProductGroup oldValue =  this.getObservee();
        if (oldValue != null) oldValue.deregister(this);
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observee = (PersistentProductGroup)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theServerRootProductGroupFacade.observeeSet(this.getId(), newValue);
        }
        newValue.register(this);
    }
    protected void setThis(PersistentServerRootProductGroup newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentServerRootProductGroup)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theServerRootProductGroupFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentServerRootProductGroup getThis() throws PersistenceException {
        if(this.This == null){
            PersistentServerRootProductGroup result = (PersistentServerRootProductGroup)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentServerRootProductGroup)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleServerRootProductGroup(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleServerRootProductGroup(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleServerRootProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleServerRootProductGroup(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleServerRootProductGroup(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleServerRootProductGroup(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleServerRootProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleServerRootProductGroup(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getObserver() != null) return 1;
        if (this.getObservee() != null) return 1;
        return 0;
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        this.observer.getThis().rootProductGroup_update((model.meta.ProductGroupMssgs)event);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
