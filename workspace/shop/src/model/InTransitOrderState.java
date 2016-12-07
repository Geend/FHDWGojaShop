
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class InTransitOrderState extends model.OrderStatus implements PersistentInTransitOrderState{
    
    
    public static InTransitOrderState4Public createInTransitOrderState(long ticksLeft) throws PersistenceException{
        return createInTransitOrderState(ticksLeft,false);
    }
    
    public static InTransitOrderState4Public createInTransitOrderState(long ticksLeft,boolean delayed$Persistence) throws PersistenceException {
        PersistentInTransitOrderState result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theInTransitOrderStateFacade
                .newDelayedInTransitOrderState(ticksLeft);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theInTransitOrderStateFacade
                .newInTransitOrderState(ticksLeft,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("ticksLeft", ticksLeft);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static InTransitOrderState4Public createInTransitOrderState(long ticksLeft,boolean delayed$Persistence,InTransitOrderState4Public This) throws PersistenceException {
        PersistentInTransitOrderState result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theInTransitOrderStateFacade
                .newDelayedInTransitOrderState(ticksLeft);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theInTransitOrderStateFacade
                .newInTransitOrderState(ticksLeft,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("ticksLeft", ticksLeft);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("ticksLeft", new Long(this.getTicksLeft()).toString());
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public InTransitOrderState provideCopy() throws PersistenceException{
        InTransitOrderState result = this;
        result = new InTransitOrderState(this.subService, 
                                         this.This, 
                                         this.ticksLeft, 
                                         this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected long ticksLeft;
    
    public InTransitOrderState(SubjInterface subService,PersistentOrderStatus This,long ticksLeft,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((SubjInterface)subService,(PersistentOrderStatus)This,id);
        this.ticksLeft = ticksLeft;        
    }
    
    static public long getTypeId() {
        return 336;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 336) ConnectionHandler.getTheConnectionHandler().theInTransitOrderStateFacade
            .newInTransitOrderState(ticksLeft,this.getId());
        super.store();
        
    }
    
    public long getTicksLeft() throws PersistenceException {
        return this.ticksLeft;
    }
    public void setTicksLeft(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theInTransitOrderStateFacade.ticksLeftSet(this.getId(), newValue);
        this.ticksLeft = newValue;
    }
    public PersistentInTransitOrderState getThis() throws PersistenceException {
        if(this.This == null){
            PersistentInTransitOrderState result = (PersistentInTransitOrderState)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentInTransitOrderState)this.This;
    }
    
    public void accept(OrderStatusVisitor visitor) throws PersistenceException {
        visitor.handleInTransitOrderState(this);
    }
    public <R> R accept(OrderStatusReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleInTransitOrderState(this);
    }
    public <E extends model.UserException>  void accept(OrderStatusExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleInTransitOrderState(this);
    }
    public <R, E extends model.UserException> R accept(OrderStatusReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleInTransitOrderState(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleInTransitOrderState(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleInTransitOrderState(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleInTransitOrderState(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleInTransitOrderState(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleInTransitOrderState(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleInTransitOrderState(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleInTransitOrderState(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleInTransitOrderState(this);
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
        this.setThis((PersistentInTransitOrderState)This);
		if(this.isTheSameAs(This)){
			this.setTicksLeft((Long)final$$Fields.get("ticksLeft"));
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
        super.initializeOnCreation();
		//TODO: implement method: initializeOnCreation
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
		//TODO: implement method: initializeOnInstantiation
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
