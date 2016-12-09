
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CustomerDeliveryTime extends PersistentObject implements PersistentCustomerDeliveryTime{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static CustomerDeliveryTime4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade.getClass(objectId);
        return (CustomerDeliveryTime4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static CustomerDeliveryTime4Public createCustomerDeliveryTime(String name,common.Fraction price,long deliveryTime) throws PersistenceException{
        return createCustomerDeliveryTime(name,price,deliveryTime,false);
    }
    
    public static CustomerDeliveryTime4Public createCustomerDeliveryTime(String name,common.Fraction price,long deliveryTime,boolean delayed$Persistence) throws PersistenceException {
        if (name == null) throw new PersistenceException("Null not allowed for persistent strings, since null = \"\" in Oracle!", 0);
        PersistentCustomerDeliveryTime result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade
                .newDelayedCustomerDeliveryTime(name,price,deliveryTime);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade
                .newCustomerDeliveryTime(name,price,deliveryTime,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("name", name);
        final$$Fields.put("price", price);
        final$$Fields.put("deliveryTime", deliveryTime);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static CustomerDeliveryTime4Public createCustomerDeliveryTime(String name,common.Fraction price,long deliveryTime,boolean delayed$Persistence,CustomerDeliveryTime4Public This) throws PersistenceException {
        if (name == null) throw new PersistenceException("Null not allowed for persistent strings, since null = \"\" in Oracle!", 0);
        PersistentCustomerDeliveryTime result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade
                .newDelayedCustomerDeliveryTime(name,price,deliveryTime);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade
                .newCustomerDeliveryTime(name,price,deliveryTime,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("name", name);
        final$$Fields.put("price", price);
        final$$Fields.put("deliveryTime", deliveryTime);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("name", this.getName());
            result.put("price", this.getPrice().toString());
            result.put("deliveryTime", new Long(this.getDeliveryTime()).toString());
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public static CustomerDeliveryTimeSearchList getCustomerDeliveryTimeByName(String name) throws PersistenceException{
        return ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade
            .getCustomerDeliveryTimeByName(name);
    }
    
    public CustomerDeliveryTime provideCopy() throws PersistenceException{
        CustomerDeliveryTime result = this;
        result = new CustomerDeliveryTime(this.name, 
                                          this.price, 
                                          this.deliveryTime, 
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
    protected common.Fraction price;
    protected long deliveryTime;
    protected SubjInterface subService;
    protected PersistentCustomerDeliveryTime This;
    
    public CustomerDeliveryTime(String name,common.Fraction price,long deliveryTime,SubjInterface subService,PersistentCustomerDeliveryTime This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.name = name;
        this.price = price;
        this.deliveryTime = deliveryTime;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 234;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 234) ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade
            .newCustomerDeliveryTime(name,price,deliveryTime,this.getId());
        super.store();
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public String getName() throws PersistenceException {
        return this.name;
    }
    public void setName(String newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null not allowed for persistent strings, since null = \"\" in Oracle!", 0);
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade.nameSet(this.getId(), newValue);
        this.name = newValue;
    }
    public common.Fraction getPrice() throws PersistenceException {
        return this.price;
    }
    public void setPrice(common.Fraction newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade.priceSet(this.getId(), newValue);
        this.price = newValue;
    }
    public long getDeliveryTime() throws PersistenceException {
        return this.deliveryTime;
    }
    public void setDeliveryTime(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade.deliveryTimeSet(this.getId(), newValue);
        this.deliveryTime = newValue;
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
            ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentCustomerDeliveryTime newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentCustomerDeliveryTime getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCustomerDeliveryTime result = (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCustomerDeliveryTime)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerDeliveryTime(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerDeliveryTime(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerDeliveryTime(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerDeliveryTime(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerDeliveryTime(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerDeliveryTime(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerDeliveryTime(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerDeliveryTime(this);
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
        this.setThis((PersistentCustomerDeliveryTime)This);
		if(this.isTheSameAs(This)){
			this.setName((String)final$$Fields.get("name"));
			this.setPrice((common.Fraction)final$$Fields.get("price"));
			this.setDeliveryTime((Long)final$$Fields.get("deliveryTime"));
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
