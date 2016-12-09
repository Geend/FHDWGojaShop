
package model;

import persistence.*;
import model.visitor.*;

import java.text.MessageFormat;


/* Additional import section end */

public class CustomerAccount extends PersistentObject implements PersistentCustomerAccount{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static CustomerAccount4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade.getClass(objectId);
        return (CustomerAccount4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static CustomerAccount4Public createCustomerAccount(String name,common.Fraction balance,common.Fraction limit) throws PersistenceException{
        return createCustomerAccount(name,balance,limit,false);
    }
    
    public static CustomerAccount4Public createCustomerAccount(String name,common.Fraction balance,common.Fraction limit,boolean delayed$Persistence) throws PersistenceException {
        if (name == null) throw new PersistenceException("Null not allowed for persistent strings, since null = \"\" in Oracle!", 0);
        PersistentCustomerAccount result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade
                .newDelayedCustomerAccount(name,balance,limit);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade
                .newCustomerAccount(name,balance,limit,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("name", name);
        final$$Fields.put("balance", balance);
        final$$Fields.put("limit", limit);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static CustomerAccount4Public createCustomerAccount(String name,common.Fraction balance,common.Fraction limit,boolean delayed$Persistence,CustomerAccount4Public This) throws PersistenceException {
        if (name == null) throw new PersistenceException("Null not allowed for persistent strings, since null = \"\" in Oracle!", 0);
        PersistentCustomerAccount result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade
                .newDelayedCustomerAccount(name,balance,limit);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade
                .newCustomerAccount(name,balance,limit,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("name", name);
        final$$Fields.put("balance", balance);
        final$$Fields.put("limit", limit);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("name", this.getName());
            result.put("balance", this.getBalance().toString());
            result.put("limit", this.getLimit().toString());
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
    
    public static CustomerAccountSearchList getCustomerAccountByName(String name) throws PersistenceException{
        return ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade
            .getCustomerAccountByName(name);
    }
    
    public CustomerAccount provideCopy() throws PersistenceException{
        CustomerAccount result = this;
        result = new CustomerAccount(this.name, 
                                     this.balance, 
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
    protected String name;
    protected common.Fraction balance;
    protected common.Fraction limit;
    protected PersistentShoppingCart shoppingCart;
    protected SubjInterface subService;
    protected PersistentCustomerAccount This;
    
    public CustomerAccount(String name,common.Fraction balance,common.Fraction limit,PersistentShoppingCart shoppingCart,SubjInterface subService,PersistentCustomerAccount This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.name = name;
        this.balance = balance;
        this.limit = limit;
        this.shoppingCart = shoppingCart;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 239;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 239) ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade
            .newCustomerAccount(name,balance,limit,this.getId());
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
    
    public String getName() throws PersistenceException {
        return this.name;
    }
    public void setName(String newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null not allowed for persistent strings, since null = \"\" in Oracle!", 0);
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade.nameSet(this.getId(), newValue);
        this.name = newValue;
    }
    public common.Fraction getBalance() throws PersistenceException {
        return this.balance;
    }
    public void setBalance(common.Fraction newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade.balanceSet(this.getId(), newValue);
        this.balance = newValue;
    }
    public common.Fraction getLimit() throws PersistenceException {
        return this.limit;
    }
    public void setLimit(common.Fraction newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theCustomerAccountFacade.limitSet(this.getId(), newValue);
        this.limit = newValue;
    }
    public ShoppingCart4Public getShoppingCart() throws PersistenceException {
        return this.shoppingCart;
    }
    public void setShoppingCart(ShoppingCart4Public newValue) throws PersistenceException {
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
    
    
    public void debit(final common.Fraction amount, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		DebitCommand4Public command = model.meta.DebitCommand.createDebitCommand(amount, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void deposit(final common.Fraction amount, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		DepositCommand4Public command = model.meta.DepositCommand.createDepositCommand(amount, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
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
			this.setName((String)final$$Fields.get("name"));
			this.setBalance((common.Fraction)final$$Fields.get("balance"));
			this.setLimit((common.Fraction)final$$Fields.get("limit"));
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
    public void withdraw(final common.Fraction amount, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		WithdrawCommand4Public command = model.meta.WithdrawCommand.createWithdrawCommand(amount, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public void debit(final common.Fraction amount) 
				throws model.NotEnoughMoneyException, PersistenceException{

        //TODO! Test if limit works correctly
        if(getThis().getBalance().add(getThis().getLimit()).isLess(amount)){
            throw new NotEnoughMoneyException(MessageFormat.format("Nicht genug geld ({0}€) für Abbuchung von {1}€",getThis().getBalance(), amount));
        }
        else{
            getThis().setBalance(getThis().getBalance().sub(amount));
        }
    }
    public void deposit(final common.Fraction amount) 
				throws PersistenceException{
        getThis().setBalance(getThis().getBalance().add(amount));
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        //TODO: implement method: initializeOnCreation
        
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        //TODO: implement method: initializeOnInstantiation
        
    }
    public void withdraw(final common.Fraction amount) 
				throws model.NotEnoughMoneyException, PersistenceException{

        if(getThis().getBalance().isLess(amount)){
            throw new NotEnoughMoneyException("Nicht genug geld");
        }
        else{
            getThis().setBalance(getThis().getBalance().sub(amount));
        }
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
