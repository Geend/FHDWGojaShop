
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ArticleWrapper extends model.Component implements PersistentArticleWrapper{
    
    
    public static ArticleWrapper4Public createArticleWrapper(String name,Article4Public article,ProductGroup4Public parent) throws PersistenceException{
        return createArticleWrapper(name,article,parent,false);
    }
    
    public static ArticleWrapper4Public createArticleWrapper(String name,Article4Public article,ProductGroup4Public parent,boolean delayed$Persistence) throws PersistenceException {
        PersistentArticleWrapper result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade
                .newDelayedArticleWrapper(name);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade
                .newArticleWrapper(name,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("name", name);
        final$$Fields.put("article", article);
        final$$Fields.put("parent", parent);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static ArticleWrapper4Public createArticleWrapper(String name,Article4Public article,ProductGroup4Public parent,boolean delayed$Persistence,ArticleWrapper4Public This) throws PersistenceException {
        PersistentArticleWrapper result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade
                .newDelayedArticleWrapper(name);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade
                .newArticleWrapper(name,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("name", name);
        final$$Fields.put("article", article);
        final$$Fields.put("parent", parent);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("price", this.getPrice().toString());
            AbstractPersistentRoot parent = (AbstractPersistentRoot)this.getParent();
            if (parent != null) {
                result.put("parent", parent.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    parent.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && parent.hasEssentialFields())parent.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ArticleWrapper provideCopy() throws PersistenceException{
        ArticleWrapper result = this;
        result = new ArticleWrapper(this.name, 
                                    this.subService, 
                                    this.This, 
                                    this.article, 
                                    this.parent, 
                                    this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentArticle article;
    protected PersistentProductGroup parent;
    
    public ArticleWrapper(String name,SubjInterface subService,PersistentComponent This,PersistentArticle article,PersistentProductGroup parent,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((String)name,(SubjInterface)subService,(PersistentComponent)This,id);
        this.article = article;
        this.parent = parent;        
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
            .newArticleWrapper(name,this.getId());
        super.store();
        if(this.getArticle() != null){
            this.getArticle().store();
            ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade.articleSet(this.getId(), getArticle());
        }
        if(this.getParent() != null){
            this.getParent().store();
            ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade.parentSet(this.getId(), getParent());
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
    public ProductGroup4Public getParent() throws PersistenceException {
        return this.parent;
    }
    public void setParent(ProductGroup4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.parent)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.parent = (PersistentProductGroup)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade.parentSet(this.getId(), newValue);
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
    public void accept(SubComponentVisitor visitor) throws PersistenceException {
        visitor.handleArticleWrapper(this);
    }
    public <R> R accept(SubComponentReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(SubComponentExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(SubComponentReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticleWrapper(this);
    }
    public int getLeafInfo() throws PersistenceException{
        return 0;
    }
    
    
    public void changeArticleName(final String newName) 
				throws PersistenceException{
        model.meta.ArticleWrapperChangeArticleNameStringMssg event = new model.meta.ArticleWrapperChangeArticleNameStringMssg(newName, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void changeArticleName(final String newName, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		ChangeArticleNameCommand4Public command = model.meta.ChangeArticleNameCommand.createChangeArticleNameCommand(newName, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void changePrice(final common.Fraction newPrice, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		ChangePriceCommand4Public command = model.meta.ChangePriceCommand.createChangePriceCommand(newPrice, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
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
			this.setName((String)final$$Fields.get("name"));
			this.setArticle((PersistentArticle)final$$Fields.get("article"));
			this.setParent((PersistentProductGroup)final$$Fields.get("parent"));
		}
    }
    public void moveTo(final ProductGroup4Public productGroup) 
				throws model.CycleException, PersistenceException{
        model.meta.SubComponentMoveToProductGroupMssg event = new model.meta.SubComponentMoveToProductGroupMssg(productGroup, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void moveTo(final ProductGroup4Public productGroup, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		MoveToCommand4Public command = model.meta.MoveToCommand.createMoveToCommand(now, now);
		command.setProductGroup(productGroup);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
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
    
    public void changeArticleNameImplementation(final String newName) 
				throws PersistenceException{
        getThis().setName(newName);
        getThis().getArticle().setName(newName);
    }
    public void changePrice(final common.Fraction newPrice) 
				throws PersistenceException{
        getThis().getArticle().setPrice(newPrice);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
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
    public void moveToImplementation(final ProductGroup4Public productGroup) 
				throws model.CycleException, PersistenceException{
        getThis().getParent().removeComponent(getThis());

        productGroup.addComponent(getThis());
        getThis().setParent(productGroup);

    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
