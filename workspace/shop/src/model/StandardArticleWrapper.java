
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class StandardArticleWrapper extends model.ArticleWrapper implements PersistentStandardArticleWrapper{
    
    
    public static StandardArticleWrapper4Public createStandardArticleWrapper(Article4Public component) throws PersistenceException, CycleException{
        return createStandardArticleWrapper(component,false);
    }
    
    public static StandardArticleWrapper4Public createStandardArticleWrapper(Article4Public component,boolean delayed$Persistence) throws PersistenceException, CycleException {
        PersistentStandardArticleWrapper result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theStandardArticleWrapperFacade
                .newDelayedStandardArticleWrapper();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theStandardArticleWrapperFacade
                .newStandardArticleWrapper(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("component", component);
        try{
            result.initialize(result, final$$Fields);
            result.initializeOnCreation();            
        }catch(persistence.PersistenceExceptionCycleTunnel ce){
            throw ce.cycleException;
        }
        if(result.getThis().getComponent() == null)throw new PersistenceException("Field component in type StandardArticleWrapper has not been initialized!",0);
        return result;
    }
    
    public static StandardArticleWrapper4Public createStandardArticleWrapper(Article4Public component,boolean delayed$Persistence,StandardArticleWrapper4Public This) throws PersistenceException, CycleException {
        PersistentStandardArticleWrapper result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theStandardArticleWrapperFacade
                .newDelayedStandardArticleWrapper();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theStandardArticleWrapperFacade
                .newStandardArticleWrapper(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("component", component);
        try{
            result.initialize(This, final$$Fields);
            result.initializeOnCreation();            
        }catch(persistence.PersistenceExceptionCycleTunnel ce){
            throw ce.cycleException;
        }
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("name", this.getName());
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public StandardArticleWrapper provideCopy() throws PersistenceException{
        StandardArticleWrapper result = this;
        result = new StandardArticleWrapper((PersistentArticle)this.component, 
                                            this.subService, 
                                            this.This, 
                                            this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    
    public StandardArticleWrapper(PersistentArticle component,SubjInterface subService,PersistentComponentWrapper This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((PersistentArticle)component,(SubjInterface)subService,(PersistentComponentWrapper)This,id);        
    }
    
    static public long getTypeId() {
        return 294;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 294) ConnectionHandler.getTheConnectionHandler().theStandardArticleWrapperFacade
            .newStandardArticleWrapper(this.getId());
        super.store();
        
    }
    
    public PersistentStandardArticleWrapper getThis() throws PersistenceException {
        if(this.This == null){
            PersistentStandardArticleWrapper result = (PersistentStandardArticleWrapper)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentStandardArticleWrapper)this.This;
    }
    
    public void accept(ArticleWrapperVisitor visitor) throws PersistenceException {
        visitor.handleStandardArticleWrapper(this);
    }
    public <R> R accept(ArticleWrapperReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleStandardArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(ArticleWrapperExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleStandardArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(ArticleWrapperReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleStandardArticleWrapper(this);
    }
    public void accept(ComponentWrapperVisitor visitor) throws PersistenceException {
        visitor.handleStandardArticleWrapper(this);
    }
    public <R> R accept(ComponentWrapperReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleStandardArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(ComponentWrapperExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleStandardArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(ComponentWrapperReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleStandardArticleWrapper(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleStandardArticleWrapper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleStandardArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleStandardArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleStandardArticleWrapper(this);
    }
    public void accept(CompHierarchyHIERARCHYVisitor visitor) throws PersistenceException {
        visitor.handleStandardArticleWrapper(this);
    }
    public <R> R accept(CompHierarchyHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleStandardArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(CompHierarchyHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleStandardArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(CompHierarchyHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleStandardArticleWrapper(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleStandardArticleWrapper(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleStandardArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleStandardArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleStandardArticleWrapper(this);
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
		if(getThis().getComponent() != null && getThis().getComponent().containsCompHierarchy(part, visited)) return true;
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
        this.setThis((PersistentStandardArticleWrapper)This);
		if(this.isTheSameAs(This)){
			try { this.setComponent((PersistentComponent)final$$Fields.get("component")); } catch (model.CycleException e){throw new persistence.PersistenceExceptionCycleTunnel(e);}
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
		T result$$component$$StandardArticleWrapper = this.getComponent().strategyCompHierarchy(strategy, visited);
		T result = strategy.StandardArticleWrapper$$finalize(getThis() ,result$$component$$StandardArticleWrapper);
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
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public Article4Public gArticle() 
				throws PersistenceException{
        //TODO! Report a bug in goja? Type of getter is not special enough for public attributes of super class that were specialized (with the specializable keyword in goja)
       return getThis().getComponent();
    }
    public String getName() 
				throws PersistenceException{

        return getComponent().getName();
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
