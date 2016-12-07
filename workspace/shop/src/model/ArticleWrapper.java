
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ArticleWrapper extends model.Component implements PersistentArticleWrapper{
    
    
    public static ArticleWrapper4Public createArticleWrapper(ComponentContainer parent,Article4Public article) throws PersistenceException{
        return createArticleWrapper(parent,article,false);
    }
    
    public static ArticleWrapper4Public createArticleWrapper(ComponentContainer parent,Article4Public article,boolean delayed$Persistence) throws PersistenceException {
        PersistentArticleWrapper result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade
                .newDelayedArticleWrapper();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade
                .newArticleWrapper(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("parent", parent);
        final$$Fields.put("article", article);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static ArticleWrapper4Public createArticleWrapper(ComponentContainer parent,Article4Public article,boolean delayed$Persistence,ArticleWrapper4Public This) throws PersistenceException {
        PersistentArticleWrapper result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade
                .newDelayedArticleWrapper();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade
                .newArticleWrapper(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("parent", parent);
        final$$Fields.put("article", article);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("price", this.getPrice().toString());
            result.put("name", this.getName());
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ArticleWrapper provideCopy() throws PersistenceException{
        ArticleWrapper result = this;
        result = new ArticleWrapper(this.parent, 
                                    this.subService, 
                                    this.This, 
                                    this.article, 
                                    this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentArticle article;
    
    public ArticleWrapper(ComponentContainer parent,SubjInterface subService,PersistentComponent This,PersistentArticle article,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((ComponentContainer)parent,(SubjInterface)subService,(PersistentComponent)This,id);
        this.article = article;        
    }
    
    static public long getTypeId() {
        return 242;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 242) ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade
            .newArticleWrapper(this.getId());
        super.store();
        if(this.getArticle() != null){
            this.getArticle().store();
            ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade.articleSet(this.getId(), getArticle());
        }
        
    }
    
    public Article4Public getArticle() throws PersistenceException {
        return this.article;
    }
    public void setArticle(Article4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.article)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.article = (PersistentArticle)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade.articleSet(this.getId(), newValue);
        }
    }
    public PersistentArticleWrapper getThis() throws PersistenceException {
        if(this.This == null){
            PersistentArticleWrapper result = (PersistentArticleWrapper)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentArticleWrapper)this.This;
    }
    
    public void accept(ComponentVisitor visitor) throws PersistenceException {
        visitor.handleArticleWrapper(this);
    }
    public <R> R accept(ComponentReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(ComponentExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(ComponentReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticleWrapper(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleArticleWrapper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticleWrapper(this);
    }
    public void accept(CompHierarchyHIERARCHYVisitor visitor) throws PersistenceException {
        visitor.handleArticleWrapper(this);
    }
    public <R> R accept(CompHierarchyHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(CompHierarchyHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(CompHierarchyHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticleWrapper(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleArticleWrapper(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticleWrapper(this);
    }
    public int getLeafInfo() throws PersistenceException{
        return 0;
    }
    
    
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException{
        return getThis().containsCompHierarchy(part, new java.util.HashSet<CompHierarchyHIERARCHY>());
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException{
        if(getThis().equals(part)) return true;
		if(visited.contains(getThis())) return false;
		visited.add(getThis());
		return false;
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
        this.setThis((PersistentArticleWrapper)This);
		if(this.isTheSameAs(This)){
			this.setParent((ComponentContainer)final$$Fields.get("parent"));
			this.setArticle((PersistentArticle)final$$Fields.get("article"));
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
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return getThis().strategyCompHierarchy(strategy, new java.util.HashMap<CompHierarchyHIERARCHY,T>());
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        if (visited.containsKey(getThis())) return visited.get(getThis());
		T result = strategy.ArticleWrapper$$finalize(getThis() );
		visited.put(getThis(),result);
		return result;
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
    public String getName() 
				throws PersistenceException{
       return getArticle().getName();
    }
    public common.Fraction getPrice() 
				throws PersistenceException{
       return getThis().getArticle().getPrice();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
