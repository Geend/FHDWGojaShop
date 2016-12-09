
package model;

import common.Fraction;
import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class Settings extends PersistentObject implements PersistentSettings{
    
    private static Settings4Public theSettings = null;
    public static boolean reset$For$Test = false;
    private static final Object $$lock = new Object();
    public static Settings4Public getTheSettings() throws PersistenceException{
        if (theSettings == null || reset$For$Test){
            if (reset$For$Test) theSettings = null;
            class Initializer implements Runnable {
                PersistenceException exception = null;
                public void /* internal */ run(){
                    this.produceSingleton();
                }
                void produceSingleton() {
                    synchronized ($$lock){
                        try {
                            Settings4Public proxi = null;
                            proxi = ConnectionHandler.getTheConnectionHandler().theSettingsFacade.getTheSettings();
                            theSettings = proxi;
                            if(proxi.getId() < 0) {
                                ((AbstractPersistentRoot)proxi).setId(proxi.getId() * -1);
                                proxi.initialize(proxi, new java.util.HashMap<String,Object>());
                                proxi.initializeOnCreation();
                            }
                        } catch (PersistenceException e){
                            exception = e;
                        } finally {
                            $$lock.notify();
                        }
                        
                    }
                }
                Settings4Public getResult() throws PersistenceException{
                    synchronized ($$lock) {
                        if (exception == null && theSettings== null) try {$$lock.wait();} catch (InterruptedException e) {}
                        if(exception != null) throw exception;
                        return theSettings;
                    }
                }
                
            }
            reset$For$Test = false;
            Initializer initializer = new Initializer();
            new Thread(initializer).start();
            return initializer.getResult();
        }
        return theSettings;
    }
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("newCustomerDefaultBalance", this.getNewCustomerDefaultBalance().toString());
            result.put("newCustomerDefaultLimit", this.getNewCustomerDefaultLimit().toString());
            result.put("returnPercentage", this.getReturnPercentage().toString());
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public Settings provideCopy() throws PersistenceException{
        Settings result = this;
        result = new Settings(this.newCustomerDefaultBalance, 
                              this.newCustomerDefaultLimit, 
                              this.returnPercentage, 
                              this.subService, 
                              this.This, 
                              this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected common.Fraction newCustomerDefaultBalance;
    protected common.Fraction newCustomerDefaultLimit;
    protected common.Fraction returnPercentage;
    protected SubjInterface subService;
    protected PersistentSettings This;
    
    public Settings(common.Fraction newCustomerDefaultBalance,common.Fraction newCustomerDefaultLimit,common.Fraction returnPercentage,SubjInterface subService,PersistentSettings This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.newCustomerDefaultBalance = newCustomerDefaultBalance;
        this.newCustomerDefaultLimit = newCustomerDefaultLimit;
        this.returnPercentage = returnPercentage;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 318;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        // Singletons cannot be delayed!
    }
    
    public common.Fraction getNewCustomerDefaultBalance() throws PersistenceException {
        return this.newCustomerDefaultBalance;
    }
    public void setNewCustomerDefaultBalance(common.Fraction newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theSettingsFacade.newCustomerDefaultBalanceSet(this.getId(), newValue);
        this.newCustomerDefaultBalance = newValue;
    }
    public common.Fraction getNewCustomerDefaultLimit() throws PersistenceException {
        return this.newCustomerDefaultLimit;
    }
    public void setNewCustomerDefaultLimit(common.Fraction newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theSettingsFacade.newCustomerDefaultLimitSet(this.getId(), newValue);
        this.newCustomerDefaultLimit = newValue;
    }
    public common.Fraction getReturnPercentage() throws PersistenceException {
        return this.returnPercentage;
    }
    public void setReturnPercentage(common.Fraction newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theSettingsFacade.returnPercentageSet(this.getId(), newValue);
        this.returnPercentage = newValue;
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
            ConnectionHandler.getTheConnectionHandler().theSettingsFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentSettings newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentSettings)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theSettingsFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentSettings getThis() throws PersistenceException {
        if(this.This == null){
            PersistentSettings result = (PersistentSettings)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentSettings)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleSettings(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleSettings(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleSettings(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleSettings(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleSettings(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleSettings(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleSettings(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleSettings(this);
    }
    public int getLeafInfo() throws PersistenceException{
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
        this.setThis((PersistentSettings)This);
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
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        getThis().setNewCustomerDefaultBalance(new Fraction(1000));
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
