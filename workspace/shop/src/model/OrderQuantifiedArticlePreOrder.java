
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class OrderQuantifiedArticlePreOrder extends model.OrderQuantifiedArticleState implements PersistentOrderQuantifiedArticlePreOrder{
    
    
    public static OrderQuantifiedArticlePreOrder4Public createOrderQuantifiedArticlePreOrder(long leftQuantity) throws PersistenceException{
        return createOrderQuantifiedArticlePreOrder(leftQuantity,false);
    }
    
    public static OrderQuantifiedArticlePreOrder4Public createOrderQuantifiedArticlePreOrder(long leftQuantity,boolean delayed$Persistence) throws PersistenceException {
        PersistentOrderQuantifiedArticlePreOrder result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticlePreOrderFacade
                .newDelayedOrderQuantifiedArticlePreOrder(leftQuantity);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticlePreOrderFacade
                .newOrderQuantifiedArticlePreOrder(leftQuantity,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("leftQuantity", leftQuantity);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static OrderQuantifiedArticlePreOrder4Public createOrderQuantifiedArticlePreOrder(long leftQuantity,boolean delayed$Persistence,OrderQuantifiedArticlePreOrder4Public This) throws PersistenceException {
        PersistentOrderQuantifiedArticlePreOrder result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticlePreOrderFacade
                .newDelayedOrderQuantifiedArticlePreOrder(leftQuantity);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticlePreOrderFacade
                .newOrderQuantifiedArticlePreOrder(leftQuantity,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("leftQuantity", leftQuantity);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("leftQuantity", new Long(this.getLeftQuantity()).toString());
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public OrderQuantifiedArticlePreOrder provideCopy() throws PersistenceException{
        OrderQuantifiedArticlePreOrder result = this;
        result = new OrderQuantifiedArticlePreOrder(this.subService, 
                                                    this.This, 
                                                    this.leftQuantity, 
                                                    this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected long leftQuantity;
    
    public OrderQuantifiedArticlePreOrder(SubjInterface subService,PersistentOrderQuantifiedArticleState This,long leftQuantity,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((SubjInterface)subService,(PersistentOrderQuantifiedArticleState)This,id);
        this.leftQuantity = leftQuantity;        
    }
    
    static public long getTypeId() {
        return 451;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 451) ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticlePreOrderFacade
            .newOrderQuantifiedArticlePreOrder(leftQuantity,this.getId());
        super.store();
        
    }
    
    public long getLeftQuantity() throws PersistenceException {
        return this.leftQuantity;
    }
    public void setLeftQuantity(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticlePreOrderFacade.leftQuantitySet(this.getId(), newValue);
        this.leftQuantity = newValue;
    }
    public PersistentOrderQuantifiedArticlePreOrder getThis() throws PersistenceException {
        if(this.This == null){
            PersistentOrderQuantifiedArticlePreOrder result = (PersistentOrderQuantifiedArticlePreOrder)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentOrderQuantifiedArticlePreOrder)this.This;
    }
    
    public void accept(OrderQuantifiedArticleStateVisitor visitor) throws PersistenceException {
        visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <R> R accept(OrderQuantifiedArticleStateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <E extends model.UserException>  void accept(OrderQuantifiedArticleStateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <R, E extends model.UserException> R accept(OrderQuantifiedArticleStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderQuantifiedArticlePreOrder(this);
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
        this.setThis((PersistentOrderQuantifiedArticlePreOrder)This);
		if(this.isTheSameAs(This)){
			this.setLeftQuantity((Long)final$$Fields.get("leftQuantity"));
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
