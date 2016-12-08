
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class OwnerServiceShop extends PersistentObject implements PersistentOwnerServiceShop{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static OwnerServiceShop4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theOwnerServiceShopFacade.getClass(objectId);
        return (OwnerServiceShop4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static OwnerServiceShop4Public createOwnerServiceShop() throws PersistenceException{
        return createOwnerServiceShop(false);
    }
    
    public static OwnerServiceShop4Public createOwnerServiceShop(boolean delayed$Persistence) throws PersistenceException {
        PersistentOwnerServiceShop result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOwnerServiceShopFacade
                .newDelayedOwnerServiceShop();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOwnerServiceShopFacade
                .newOwnerServiceShop(-1);
        }
        while (!(result instanceof OwnerServiceShop)) result = (PersistentOwnerServiceShop)result.getTheObject();
        ((OwnerServiceShop)result).setThis(result);
        return result;
    }
    
    public OwnerServiceShop provideCopy() throws PersistenceException{
        OwnerServiceShop result = this;
        result = new OwnerServiceShop(this.observer, 
                                      this.observee, 
                                      this.This, 
                                      this.getId());
        
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentOwnerService observer;
    protected PersistentShop observee;
    protected PersistentOwnerServiceShop This;
    
    public OwnerServiceShop(PersistentOwnerService observer,PersistentShop observee,PersistentOwnerServiceShop This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.observer = observer;
        this.observee = observee;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 426;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 426) ConnectionHandler.getTheConnectionHandler().theOwnerServiceShopFacade
            .newOwnerServiceShop(this.getId());
        super.store();
        if(this.getObserver() != null){
            this.getObserver().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceShopFacade.observerSet(this.getId(), getObserver());
        }
        if(this.getObservee() != null){
            this.getObservee().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceShopFacade.observeeSet(this.getId(), getObservee());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceShopFacade.ThisSet(this.getId(), getThis());
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
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceShopFacade.observerSet(this.getId(), newValue);
        }
    }
    public Shop4Public getObservee() throws PersistenceException {
        return this.observee;
    }
    public void setObservee(Shop4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observee)) return;
        Shop4Public oldValue =  this.getObservee();
        if (oldValue != null) oldValue.deregister(this);
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observee = (PersistentShop)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceShopFacade.observeeSet(this.getId(), newValue);
        }
        newValue.register(this);
    }
    protected void setThis(PersistentOwnerServiceShop newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentOwnerServiceShop)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOwnerServiceShopFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentOwnerServiceShop getThis() throws PersistenceException {
        if(this.This == null){
            PersistentOwnerServiceShop result = (PersistentOwnerServiceShop)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentOwnerServiceShop)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOwnerServiceShop(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerServiceShop(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerServiceShop(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerServiceShop(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOwnerServiceShop(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerServiceShop(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerServiceShop(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerServiceShop(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getObserver() != null) return 1;
        if (this.getObservee() != null) return 1;
        return 0;
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        this.observer.getThis().shop_update((model.meta.ShopMssgs)event);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
