
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ArticleReturn extends PersistentObject implements PersistentArticleReturn{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static ArticleReturn4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theArticleReturnFacade.getClass(objectId);
        return (ArticleReturn4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static ArticleReturn4Public createArticleReturn(Order4Public order) throws PersistenceException{
        return createArticleReturn(order,false);
    }
    
    public static ArticleReturn4Public createArticleReturn(Order4Public order,boolean delayed$Persistence) throws PersistenceException {
        PersistentArticleReturn result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theArticleReturnFacade
                .newDelayedArticleReturn();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theArticleReturnFacade
                .newArticleReturn(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("order", order);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static ArticleReturn4Public createArticleReturn(Order4Public order,boolean delayed$Persistence,ArticleReturn4Public This) throws PersistenceException {
        PersistentArticleReturn result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theArticleReturnFacade
                .newDelayedArticleReturn();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theArticleReturnFacade
                .newArticleReturn(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("order", order);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            AbstractPersistentRoot order = (AbstractPersistentRoot)this.getOrder();
            if (order != null) {
                result.put("order", order.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    order.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && order.hasEssentialFields())order.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            result.put("returnArticles", this.getReturnArticles().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ArticleReturn provideCopy() throws PersistenceException{
        ArticleReturn result = this;
        result = new ArticleReturn(this.order, 
                                   this.subService, 
                                   this.This, 
                                   this.getId());
        result.returnArticles = this.returnArticles.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentOrder order;
    protected ArticleReturn_ReturnArticlesProxi returnArticles;
    protected SubjInterface subService;
    protected PersistentArticleReturn This;
    
    public ArticleReturn(PersistentOrder order,SubjInterface subService,PersistentArticleReturn This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.order = order;
        this.returnArticles = new ArticleReturn_ReturnArticlesProxi(this);
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 349;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 349) ConnectionHandler.getTheConnectionHandler().theArticleReturnFacade
            .newArticleReturn(this.getId());
        super.store();
        if(this.getOrder() != null){
            this.getOrder().store();
            ConnectionHandler.getTheConnectionHandler().theArticleReturnFacade.orderSet(this.getId(), getOrder());
        }
        this.getReturnArticles().store();
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theArticleReturnFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theArticleReturnFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public Order4Public getOrder() throws PersistenceException {
        return this.order;
    }
    public void setOrder(Order4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.order)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.order = (PersistentOrder)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theArticleReturnFacade.orderSet(this.getId(), newValue);
        }
    }
    public ArticleReturn_ReturnArticlesProxi getReturnArticles() throws PersistenceException {
        return this.returnArticles;
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
            ConnectionHandler.getTheConnectionHandler().theArticleReturnFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentArticleReturn newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentArticleReturn)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theArticleReturnFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentArticleReturn getThis() throws PersistenceException {
        if(this.This == null){
            PersistentArticleReturn result = (PersistentArticleReturn)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentArticleReturn)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleArticleReturn(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticleReturn(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticleReturn(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticleReturn(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleArticleReturn(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticleReturn(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticleReturn(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticleReturn(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getOrder() != null) return 1;
        if (this.getReturnArticles().getLength() > 0) return 1;
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
        this.setThis((PersistentArticleReturn)This);
		if(this.isTheSameAs(This)){
			this.setOrder((PersistentOrder)final$$Fields.get("order"));
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
    
    public void addArticle(final ReturnQuantifiedArticle4Public orderQuantifiedArticle) 
				throws PersistenceException{
        //TODO: implement method: addArticle
        
    }
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
