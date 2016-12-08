
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CustomerServiceShop extends PersistentObject implements PersistentCustomerServiceShop{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static CustomerServiceShop4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theCustomerServiceShopFacade.getClass(objectId);
        return (CustomerServiceShop4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static CustomerServiceShop4Public createCustomerServiceShop() throws PersistenceException{
        return createCustomerServiceShop(false);
    }
    
    public static CustomerServiceShop4Public createCustomerServiceShop(boolean delayed$Persistence) throws PersistenceException {
        PersistentCustomerServiceShop result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerServiceShopFacade
                .newDelayedCustomerServiceShop();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerServiceShopFacade
                .newCustomerServiceShop(-1);
        }
        while (!(result instanceof CustomerServiceShop)) result = (PersistentCustomerServiceShop)result.getTheObject();
        ((CustomerServiceShop)result).setThis(result);
        return result;
    }
    
    public CustomerServiceShop provideCopy() throws PersistenceException{
        CustomerServiceShop result = this;
        result = new CustomerServiceShop(this.observer, 
                                         this.observee, 
                                         this.This, 
                                         this.getId());
        
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentCustomerService observer;
    protected PersistentShop observee;
    protected PersistentCustomerServiceShop This;
    
    public CustomerServiceShop(PersistentCustomerService observer,PersistentShop observee,PersistentCustomerServiceShop This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.observer = observer;
        this.observee = observee;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 407;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 407) ConnectionHandler.getTheConnectionHandler().theCustomerServiceShopFacade
            .newCustomerServiceShop(this.getId());
        super.store();
        if(this.getObserver() != null){
            this.getObserver().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceShopFacade.observerSet(this.getId(), getObserver());
        }
        if(this.getObservee() != null){
            this.getObservee().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceShopFacade.observeeSet(this.getId(), getObservee());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceShopFacade.ThisSet(this.getId(), getThis());
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
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceShopFacade.observerSet(this.getId(), newValue);
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
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceShopFacade.observeeSet(this.getId(), newValue);
        }
        newValue.register(this);
    }
    protected void setThis(PersistentCustomerServiceShop newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentCustomerServiceShop)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceShopFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentCustomerServiceShop getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCustomerServiceShop result = (PersistentCustomerServiceShop)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCustomerServiceShop)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerServiceShop(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerServiceShop(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerServiceShop(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerServiceShop(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerServiceShop(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerServiceShop(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerServiceShop(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerServiceShop(this);
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
