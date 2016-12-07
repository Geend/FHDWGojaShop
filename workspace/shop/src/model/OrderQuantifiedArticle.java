
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class OrderQuantifiedArticle extends model.QuantifiedArticle implements PersistentOrderQuantifiedArticle{
    
    
    public static OrderQuantifiedArticle4Public createOrderQuantifiedArticle(long quantity,ArticleWrapper4Public article,common.Fraction articlePriceAtOrderTime) throws PersistenceException{
        return createOrderQuantifiedArticle(quantity,article,articlePriceAtOrderTime,false);
    }
    
    public static OrderQuantifiedArticle4Public createOrderQuantifiedArticle(long quantity,ArticleWrapper4Public article,common.Fraction articlePriceAtOrderTime,boolean delayed$Persistence) throws PersistenceException {
        PersistentOrderQuantifiedArticle result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticleFacade
                .newDelayedOrderQuantifiedArticle(quantity,articlePriceAtOrderTime);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticleFacade
                .newOrderQuantifiedArticle(quantity,articlePriceAtOrderTime,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("quantity", quantity);
        final$$Fields.put("article", article);
        final$$Fields.put("articlePriceAtOrderTime", articlePriceAtOrderTime);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static OrderQuantifiedArticle4Public createOrderQuantifiedArticle(long quantity,ArticleWrapper4Public article,common.Fraction articlePriceAtOrderTime,boolean delayed$Persistence,OrderQuantifiedArticle4Public This) throws PersistenceException {
        PersistentOrderQuantifiedArticle result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticleFacade
                .newDelayedOrderQuantifiedArticle(quantity,articlePriceAtOrderTime);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticleFacade
                .newOrderQuantifiedArticle(quantity,articlePriceAtOrderTime,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("quantity", quantity);
        final$$Fields.put("article", article);
        final$$Fields.put("articlePriceAtOrderTime", articlePriceAtOrderTime);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("articlePriceAtOrderTime", this.getArticlePriceAtOrderTime().toString());
            AbstractPersistentRoot state = (AbstractPersistentRoot)this.getState();
            if (state != null) {
                result.put("state", state.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    state.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && state.hasEssentialFields())state.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public OrderQuantifiedArticle provideCopy() throws PersistenceException{
        OrderQuantifiedArticle result = this;
        result = new OrderQuantifiedArticle(this.quantity, 
                                            this.article, 
                                            this.subService, 
                                            this.This, 
                                            this.articlePriceAtOrderTime, 
                                            this.state, 
                                            this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected common.Fraction articlePriceAtOrderTime;
    protected PersistentOrderQuantifiedArticleState state;
    
    public OrderQuantifiedArticle(long quantity,PersistentArticleWrapper article,SubjInterface subService,PersistentQuantifiedArticle This,common.Fraction articlePriceAtOrderTime,PersistentOrderQuantifiedArticleState state,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((long)quantity,(PersistentArticleWrapper)article,(SubjInterface)subService,(PersistentQuantifiedArticle)This,id);
        this.articlePriceAtOrderTime = articlePriceAtOrderTime;
        this.state = state;        
    }
    
    static public long getTypeId() {
        return 232;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 232) ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticleFacade
            .newOrderQuantifiedArticle(quantity,articlePriceAtOrderTime,this.getId());
        super.store();
        if(this.getState() != null){
            this.getState().store();
            ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticleFacade.stateSet(this.getId(), getState());
        }
        
    }
    
    public common.Fraction getArticlePriceAtOrderTime() throws PersistenceException {
        return this.articlePriceAtOrderTime;
    }
    public void setArticlePriceAtOrderTime(common.Fraction newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticleFacade.articlePriceAtOrderTimeSet(this.getId(), newValue);
        this.articlePriceAtOrderTime = newValue;
    }
    public OrderQuantifiedArticleState4Public getState() throws PersistenceException {
        return this.state;
    }
    public void setState(OrderQuantifiedArticleState4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.state)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.state = (PersistentOrderQuantifiedArticleState)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticleFacade.stateSet(this.getId(), newValue);
        }
    }
    public PersistentOrderQuantifiedArticle getThis() throws PersistenceException {
        if(this.This == null){
            PersistentOrderQuantifiedArticle result = (PersistentOrderQuantifiedArticle)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentOrderQuantifiedArticle)this.This;
    }
    
    public void accept(QuantifiedArticleVisitor visitor) throws PersistenceException {
        visitor.handleOrderQuantifiedArticle(this);
    }
    public <R> R accept(QuantifiedArticleReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(QuantifiedArticleExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(QuantifiedArticleReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderQuantifiedArticle(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOrderQuantifiedArticle(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderQuantifiedArticle(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOrderQuantifiedArticle(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderQuantifiedArticle(this);
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
        this.setThis((PersistentOrderQuantifiedArticle)This);
		if(this.isTheSameAs(This)){
			this.setQuantity((Long)final$$Fields.get("quantity"));
			this.setArticle((PersistentArticleWrapper)final$$Fields.get("article"));
			this.setArticlePriceAtOrderTime((common.Fraction)final$$Fields.get("articlePriceAtOrderTime"));
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
        getThis().setState(OrderQuantifiedArticleNormalState.createOrderQuantifiedArticleNormalState());
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
		//TODO: implement method: initializeOnInstantiation
    }
    public void markForReturn() 
				throws PersistenceException{
        getThis().setState(OrderQuantifiedArticleMarkedForReturnState.createOrderQuantifiedArticleMarkedForReturnState());
    }
    public void unmarkForReturn() 
				throws PersistenceException{
        getThis().setState(OrderQuantifiedArticleNormalState.createOrderQuantifiedArticleNormalState());
        
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
