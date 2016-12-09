
package model;

import constants.StringConstants;
import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CustomerDeliveryTimeManager extends PersistentObject implements PersistentCustomerDeliveryTimeManager{
    
    private static CustomerDeliveryTimeManager4Public theCustomerDeliveryTimeManager = null;
    public static boolean reset$For$Test = false;
    private static final Object $$lock = new Object();
    public static CustomerDeliveryTimeManager4Public getTheCustomerDeliveryTimeManager() throws PersistenceException{
        if (theCustomerDeliveryTimeManager == null || reset$For$Test){
            if (reset$For$Test) theCustomerDeliveryTimeManager = null;
            class Initializer implements Runnable {
                PersistenceException exception = null;
                public void /* internal */ run(){
                    this.produceSingleton();
                }
                void produceSingleton() {
                    synchronized ($$lock){
                        try {
                            CustomerDeliveryTimeManager4Public proxi = null;
                            proxi = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeManagerFacade.getTheCustomerDeliveryTimeManager();
                            theCustomerDeliveryTimeManager = proxi;
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
                CustomerDeliveryTimeManager4Public getResult() throws PersistenceException{
                    synchronized ($$lock) {
                        if (exception == null && theCustomerDeliveryTimeManager== null) try {$$lock.wait();} catch (InterruptedException e) {}
                        if(exception != null) throw exception;
                        return theCustomerDeliveryTimeManager;
                    }
                }
                
            }
            reset$For$Test = false;
            Initializer initializer = new Initializer();
            new Thread(initializer).start();
            return initializer.getResult();
        }
        return theCustomerDeliveryTimeManager;
    }
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("customerDeliveryTimes", this.getCustomerDeliveryTimes().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public CustomerDeliveryTimeManager provideCopy() throws PersistenceException{
        CustomerDeliveryTimeManager result = this;
        result = new CustomerDeliveryTimeManager(this.subService, 
                                                 this.This, 
                                                 this.getId());
        result.customerDeliveryTimes = this.customerDeliveryTimes.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected CustomerDeliveryTimeManager_CustomerDeliveryTimesProxi customerDeliveryTimes;
    protected SubjInterface subService;
    protected PersistentCustomerDeliveryTimeManager This;
    
    public CustomerDeliveryTimeManager(SubjInterface subService,PersistentCustomerDeliveryTimeManager This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.customerDeliveryTimes = new CustomerDeliveryTimeManager_CustomerDeliveryTimesProxi(this);
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 296;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        // Singletons cannot be delayed!
    }
    
    public CustomerDeliveryTimeManager_CustomerDeliveryTimesProxi getCustomerDeliveryTimes() throws PersistenceException {
        return this.customerDeliveryTimes;
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
            ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeManagerFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentCustomerDeliveryTimeManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentCustomerDeliveryTimeManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeManagerFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentCustomerDeliveryTimeManager getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCustomerDeliveryTimeManager result = (PersistentCustomerDeliveryTimeManager)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCustomerDeliveryTimeManager)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerDeliveryTimeManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerDeliveryTimeManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerDeliveryTimeManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerDeliveryTimeManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerDeliveryTimeManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerDeliveryTimeManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerDeliveryTimeManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerDeliveryTimeManager(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getCustomerDeliveryTimes().getLength() > 0) return 1;
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
        this.setThis((PersistentCustomerDeliveryTimeManager)This);
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
    public CustomerDeliveryTime4Public createCustomerDeliveryTime(final String name, final common.Fraction price, final long time) 
				throws model.DoubleDefinitionException, model.EmptyDefinitionException, PersistenceException{

        if("".equals(name)) {
            throw new EmptyDefinitionException(StringConstants.CDT_NAME_EMPTY_DEFINITION_EXCEPTION_MESSAGEE);
        }
        if(CustomerDeliveryTime.getCustomerDeliveryTimeByName(name).getLength() > 0){
            throw new DoubleDefinitionException(StringConstants.CDT_NAME_DOUBLE_DEFINITION_EXCEPTION_MESSAGE);
        }

        CustomerDeliveryTime4Public customerDeliveryTime = CustomerDeliveryTime.createCustomerDeliveryTime(name, price, time);

        getThis().getCustomerDeliveryTimes().add(customerDeliveryTime);
        return customerDeliveryTime;
    }
    public void initializeOnCreation() 
				throws PersistenceException{
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
