
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CustomerAccount extends PersistentObject implements PersistentCustomerAccount{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentCustomerAccount getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade.getClass(objectId);
        return (PersistentCustomerAccount)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentCustomerAccount createCustomerAccount() throws PersistenceException{
        return createCustomerAccount(false);
    }
    
    public static PersistentCustomerAccount createCustomerAccount(boolean delayed$Persistence) throws PersistenceException {
        PersistentCustomerAccount result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade
                .newDelayedCustomerAccount(common.Fraction.Null,0);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade
                .newCustomerAccount(common.Fraction.Null,0,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentCustomerAccount createCustomerAccount(boolean delayed$Persistence,PersistentCustomerAccount This) throws PersistenceException {
        PersistentCustomerAccount result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade
                .newDelayedCustomerAccount(common.Fraction.Null,0);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade
                .newCustomerAccount(common.Fraction.Null,0,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("balance", this.getBalance().toString());
            result.put("limit", new Long(this.getLimit()).toString());
            AbstractPersistentRoot shoppingCart = (AbstractPersistentRoot)this.getShoppingCart();
            if (shoppingCart != null) {
                result.put("shoppingCart", shoppingCart.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    shoppingCart.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && shoppingCart.hasEssentialFields())shoppingCart.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public CustomerAccount provideCopy() throws PersistenceException{
        CustomerAccount result = this;
        result = new CustomerAccount(this.balance, 
                                     this.limit, 
                                     this.shoppingCart, 
                                     this.subService, 
                                     this.This, 
                                     this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected common.Fraction balance;
    protected long limit;
    protected PersistentShoppingCart shoppingCart;
    protected SubjInterface subService;
    protected PersistentCustomerAccount This;
    
    public CustomerAccount(common.Fraction balance,long limit,PersistentShoppingCart shoppingCart,SubjInterface subService,PersistentCustomerAccount This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.balance = balance;
        this.limit = limit;
        this.shoppingCart = shoppingCart;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 125;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 125) ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade
            .newCustomerAccount(balance,limit,this.getId());
        super.store();
        if(this.getShoppingCart() != null){
            this.getShoppingCart().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade.shoppingCartSet(this.getId(), getShoppingCart());
        }
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public common.Fraction getBalance() throws PersistenceException {
        return this.balance;
    }
    public void setBalance(common.Fraction newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade.balanceSet(this.getId(), newValue);
        this.balance = newValue;
    }
    public long getLimit() throws PersistenceException {
        return this.limit;
    }
    public void setLimit(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade.limitSet(this.getId(), newValue);
        this.limit = newValue;
    }
    public PersistentShoppingCart getShoppingCart() throws PersistenceException {
        return this.shoppingCart;
    }
    public void setShoppingCart(PersistentShoppingCart newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.shoppingCart)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.shoppingCart = (PersistentShoppingCart)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade.shoppingCartSet(this.getId(), newValue);
        }
    }
    public SubjInterface getSubService() throws PersistenceException {
        return this.subService;
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.subService)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.subService = (SubjInterface)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentCustomerAccount newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentCustomerAccount)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentCustomerAccount getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCustomerAccount result = (PersistentCustomerAccount)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCustomerAccount)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerAccount(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerAccount(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerAccount(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerAccount(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerAccount(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerAccount(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerAccount(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerAccount(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getShoppingCart() != null) return 1;
        return 0;
    }
    
    
    public synchronized void deregister(final ObsInterface observee) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentCustomerAccount)This);
		if(this.isTheSameAs(This)){
		}
    }
    public synchronized void register(final ObsInterface observee) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.register(observee);
    }
    public synchronized void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.updateObservers(event);
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public void debit(final common.Fraction amount) 
				throws PersistenceException{
        //TODO: implement method: debit
        
    }
    public void deposit(final common.Fraction amount) 
				throws PersistenceException{
        //TODO: implement method: deposit
        
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        //TODO: implement method: initializeOnCreation
        
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        //TODO: implement method: initializeOnInstantiation
        
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
