
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CustomerDeliveryTime extends PersistentObject implements PersistentCustomerDeliveryTime{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentCustomerDeliveryTime getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade.getClass(objectId);
        return (PersistentCustomerDeliveryTime)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentCustomerDeliveryTime createCustomerDeliveryTime(common.Fraction price,long deliveryTime) throws PersistenceException{
        return createCustomerDeliveryTime(price,deliveryTime,false);
    }
    
    public static PersistentCustomerDeliveryTime createCustomerDeliveryTime(common.Fraction price,long deliveryTime,boolean delayed$Persistence) throws PersistenceException {
        PersistentCustomerDeliveryTime result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade
                .newDelayedCustomerDeliveryTime(price,deliveryTime);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade
                .newCustomerDeliveryTime(price,deliveryTime,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("price", price);
        final$$Fields.put("deliveryTime", deliveryTime);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentCustomerDeliveryTime createCustomerDeliveryTime(common.Fraction price,long deliveryTime,boolean delayed$Persistence,PersistentCustomerDeliveryTime This) throws PersistenceException {
        PersistentCustomerDeliveryTime result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade
                .newDelayedCustomerDeliveryTime(price,deliveryTime);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade
                .newCustomerDeliveryTime(price,deliveryTime,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
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
            result.put("price", this.getPrice().toString());
            result.put("deliveryTime", new Long(this.getDeliveryTime()).toString());
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public CustomerDeliveryTime provideCopy() throws PersistenceException{
        CustomerDeliveryTime result = this;
        result = new CustomerDeliveryTime(this.price, 
                                          this.deliveryTime, 
                                          this.This, 
                                          this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected common.Fraction price;
    protected long deliveryTime;
    protected PersistentCustomerDeliveryTime This;
    
    public CustomerDeliveryTime(common.Fraction price,long deliveryTime,PersistentCustomerDeliveryTime This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.price = price;
        this.deliveryTime = deliveryTime;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 150;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 150) ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade
            .newCustomerDeliveryTime(price,deliveryTime,this.getId());
        super.store();
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryTimeFacade.ThisSet(this.getId(), getThis());
        }
        
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
    public int getLeafInfo() throws PersistenceException{
        return 0;
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentCustomerDeliveryTime)This);
		if(this.isTheSameAs(This)){
			this.setPrice((common.Fraction)final$$Fields.get("price"));
			this.setDeliveryTime((Long)final$$Fields.get("deliveryTime"));
		}
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
