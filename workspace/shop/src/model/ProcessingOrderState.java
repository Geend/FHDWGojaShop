
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ProcessingOrderState extends model.OrderStatus implements PersistentProcessingOrderState{
    
    
    public static ProcessingOrderState4Public createProcessingOrderState() throws PersistenceException{
        return createProcessingOrderState(false);
    }
    
    public static ProcessingOrderState4Public createProcessingOrderState(boolean delayed$Persistence) throws PersistenceException {
        PersistentProcessingOrderState result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theProcessingOrderStateFacade
                .newDelayedProcessingOrderState();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theProcessingOrderStateFacade
                .newProcessingOrderState(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static ProcessingOrderState4Public createProcessingOrderState(boolean delayed$Persistence,ProcessingOrderState4Public This) throws PersistenceException {
        PersistentProcessingOrderState result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theProcessingOrderStateFacade
                .newDelayedProcessingOrderState();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theProcessingOrderStateFacade
                .newProcessingOrderState(-1);
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
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ProcessingOrderState provideCopy() throws PersistenceException{
        ProcessingOrderState result = this;
        result = new ProcessingOrderState(this.subService, 
                                          this.This, 
                                          this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    
    public ProcessingOrderState(SubjInterface subService,PersistentOrderStatus This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((SubjInterface)subService,(PersistentOrderStatus)This,id);        
    }
    
    static public long getTypeId() {
        return 335;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 335) ConnectionHandler.getTheConnectionHandler().theProcessingOrderStateFacade
            .newProcessingOrderState(this.getId());
        super.store();
        
    }
    
    public PersistentProcessingOrderState getThis() throws PersistenceException {
        if(this.This == null){
            PersistentProcessingOrderState result = (PersistentProcessingOrderState)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentProcessingOrderState)this.This;
    }
    
    public void accept(OrderStatusVisitor visitor) throws PersistenceException {
        visitor.handleProcessingOrderState(this);
    }
    public <R> R accept(OrderStatusReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProcessingOrderState(this);
    }
    public <E extends model.UserException>  void accept(OrderStatusExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProcessingOrderState(this);
    }
    public <R, E extends model.UserException> R accept(OrderStatusReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProcessingOrderState(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleProcessingOrderState(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProcessingOrderState(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProcessingOrderState(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProcessingOrderState(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleProcessingOrderState(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProcessingOrderState(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProcessingOrderState(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProcessingOrderState(this);
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
        this.setThis((PersistentProcessingOrderState)This);
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
