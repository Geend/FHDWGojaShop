
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ArticlesInReturnOrderState extends model.OrderStatus implements PersistentArticlesInReturnOrderState{
    
    
    public static ArticlesInReturnOrderState4Public createArticlesInReturnOrderState(ArticleReturn4Public articleReturn,long ticksLeft) throws PersistenceException{
        return createArticlesInReturnOrderState(articleReturn,ticksLeft,false);
    }
    
    public static ArticlesInReturnOrderState4Public createArticlesInReturnOrderState(ArticleReturn4Public articleReturn,long ticksLeft,boolean delayed$Persistence) throws PersistenceException {
        PersistentArticlesInReturnOrderState result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theArticlesInReturnOrderStateFacade
                .newDelayedArticlesInReturnOrderState(ticksLeft);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theArticlesInReturnOrderStateFacade
                .newArticlesInReturnOrderState(ticksLeft,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("articleReturn", articleReturn);
        final$$Fields.put("ticksLeft", ticksLeft);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static ArticlesInReturnOrderState4Public createArticlesInReturnOrderState(ArticleReturn4Public articleReturn,long ticksLeft,boolean delayed$Persistence,ArticlesInReturnOrderState4Public This) throws PersistenceException {
        PersistentArticlesInReturnOrderState result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theArticlesInReturnOrderStateFacade
                .newDelayedArticlesInReturnOrderState(ticksLeft);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theArticlesInReturnOrderStateFacade
                .newArticlesInReturnOrderState(ticksLeft,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("articleReturn", articleReturn);
        final$$Fields.put("ticksLeft", ticksLeft);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            AbstractPersistentRoot articleReturn = (AbstractPersistentRoot)this.getArticleReturn();
            if (articleReturn != null) {
                result.put("articleReturn", articleReturn.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    articleReturn.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && articleReturn.hasEssentialFields())articleReturn.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            result.put("ticksLeft", new Long(this.getTicksLeft()).toString());
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ArticlesInReturnOrderState provideCopy() throws PersistenceException{
        ArticlesInReturnOrderState result = this;
        result = new ArticlesInReturnOrderState(this.subService, 
                                                this.This, 
                                                this.articleReturn, 
                                                this.ticksLeft, 
                                                this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentArticleReturn articleReturn;
    protected long ticksLeft;
    
    public ArticlesInReturnOrderState(SubjInterface subService,PersistentOrderStatus This,PersistentArticleReturn articleReturn,long ticksLeft,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((SubjInterface)subService,(PersistentOrderStatus)This,id);
        this.articleReturn = articleReturn;
        this.ticksLeft = ticksLeft;        
    }
    
    static public long getTypeId() {
        return 361;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 361) ConnectionHandler.getTheConnectionHandler().theArticlesInReturnOrderStateFacade
            .newArticlesInReturnOrderState(ticksLeft,this.getId());
        super.store();
        if(this.getArticleReturn() != null){
            this.getArticleReturn().store();
            ConnectionHandler.getTheConnectionHandler().theArticlesInReturnOrderStateFacade.articleReturnSet(this.getId(), getArticleReturn());
        }
        
    }
    
    public ArticleReturn4Public getArticleReturn() throws PersistenceException {
        return this.articleReturn;
    }
    public void setArticleReturn(ArticleReturn4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.articleReturn)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.articleReturn = (PersistentArticleReturn)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theArticlesInReturnOrderStateFacade.articleReturnSet(this.getId(), newValue);
        }
    }
    public long getTicksLeft() throws PersistenceException {
        return this.ticksLeft;
    }
    public void setTicksLeft(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theArticlesInReturnOrderStateFacade.ticksLeftSet(this.getId(), newValue);
        this.ticksLeft = newValue;
    }
    public PersistentArticlesInReturnOrderState getThis() throws PersistenceException {
        if(this.This == null){
            PersistentArticlesInReturnOrderState result = (PersistentArticlesInReturnOrderState)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentArticlesInReturnOrderState)this.This;
    }
    
    public void accept(OrderStatusVisitor visitor) throws PersistenceException {
        visitor.handleArticlesInReturnOrderState(this);
    }
    public <R> R accept(OrderStatusReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticlesInReturnOrderState(this);
    }
    public <E extends model.UserException>  void accept(OrderStatusExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticlesInReturnOrderState(this);
    }
    public <R, E extends model.UserException> R accept(OrderStatusReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticlesInReturnOrderState(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleArticlesInReturnOrderState(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticlesInReturnOrderState(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticlesInReturnOrderState(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticlesInReturnOrderState(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleArticlesInReturnOrderState(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticlesInReturnOrderState(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticlesInReturnOrderState(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticlesInReturnOrderState(this);
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
        this.setThis((PersistentArticlesInReturnOrderState)This);
		if(this.isTheSameAs(This)){
			this.setArticleReturn((PersistentArticleReturn)final$$Fields.get("articleReturn"));
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
