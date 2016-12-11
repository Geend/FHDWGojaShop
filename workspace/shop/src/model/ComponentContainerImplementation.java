
package model;

import constants.StringConstants;
import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ComponentContainerImplementation extends PersistentObject implements PersistentComponentContainerImplementation{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static ComponentContainerImplementation4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationFacade.getClass(objectId);
        return (ComponentContainerImplementation4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static ComponentContainerImplementation4Public createComponentContainerImplementation() throws PersistenceException{
        return createComponentContainerImplementation(false);
    }
    
    public static ComponentContainerImplementation4Public createComponentContainerImplementation(boolean delayed$Persistence) throws PersistenceException {
        PersistentComponentContainerImplementation result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationFacade
                .newDelayedComponentContainerImplementation();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationFacade
                .newComponentContainerImplementation(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static ComponentContainerImplementation4Public createComponentContainerImplementation(boolean delayed$Persistence,ComponentContainerImplementation4Public This) throws PersistenceException {
        PersistentComponentContainerImplementation result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationFacade
                .newDelayedComponentContainerImplementation();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationFacade
                .newComponentContainerImplementation(-1);
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
            result.put("components", this.getComponents().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ComponentContainerImplementation provideCopy() throws PersistenceException{
        ComponentContainerImplementation result = this;
        result = new ComponentContainerImplementation(this.subService, 
                                                      this.This, 
                                                      this.getId());
        result.components = this.components.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected ComponentContainerImplementation_ComponentsProxi components;
    protected SubjInterface subService;
    protected PersistentComponentContainerImplementation This;
    
    public ComponentContainerImplementation(SubjInterface subService,PersistentComponentContainerImplementation This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.components = new ComponentContainerImplementation_ComponentsProxi(this);
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 395;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 395) ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationFacade
            .newComponentContainerImplementation(this.getId());
        super.store();
        this.getComponents().store();
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public ComponentContainerImplementation_ComponentsProxi getComponents() throws PersistenceException {
        return this.components;
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
            ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentComponentContainerImplementation newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentComponentContainerImplementation)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentComponentContainerImplementation getThis() throws PersistenceException {
        if(this.This == null){
            PersistentComponentContainerImplementation result = (PersistentComponentContainerImplementation)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentComponentContainerImplementation)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleComponentContainerImplementation(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleComponentContainerImplementation(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleComponentContainerImplementation(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleComponentContainerImplementation(this);
    }
    public void accept(CompHierarchyHIERARCHYVisitor visitor) throws PersistenceException {
        visitor.handleComponentContainerImplementation(this);
    }
    public <R> R accept(CompHierarchyHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleComponentContainerImplementation(this);
    }
    public <E extends model.UserException>  void accept(CompHierarchyHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleComponentContainerImplementation(this);
    }
    public <R, E extends model.UserException> R accept(CompHierarchyHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleComponentContainerImplementation(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleComponentContainerImplementation(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleComponentContainerImplementation(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleComponentContainerImplementation(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleComponentContainerImplementation(this);
    }
    public void accept(ComponentContainerVisitor visitor) throws PersistenceException {
        visitor.handleComponentContainerImplementation(this);
    }
    public <R> R accept(ComponentContainerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleComponentContainerImplementation(this);
    }
    public <E extends model.UserException>  void accept(ComponentContainerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleComponentContainerImplementation(this);
    }
    public <R, E extends model.UserException> R accept(ComponentContainerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleComponentContainerImplementation(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getComponents().getLength() > 0) return 1;
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
		java.util.Iterator<Component4Public> iterator0 = getThis().getComponents().iterator();
		while(iterator0.hasNext())
			if(((CompHierarchyHIERARCHY)iterator0.next()).containsCompHierarchy(part, visited)) return true; 
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
        this.setThis((PersistentComponentContainerImplementation)This);
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
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return getThis().strategyCompHierarchy(strategy, new java.util.HashMap<CompHierarchyHIERARCHY,T>());
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        if (visited.containsKey(getThis())) return visited.get(getThis());
		T result$$components$$ComponentContainerImplementation = strategy.ComponentContainerImplementation$$components$$$initialize(getThis());
		java.util.Iterator<?> iterator$$ = getThis().getComponents().iterator();
		while (iterator$$.hasNext()){
			Component4Public current$$Field = (Component4Public)iterator$$.next();
			T current$$ = current$$Field.strategyCompHierarchy(strategy, visited);
			result$$components$$ComponentContainerImplementation = strategy.ComponentContainerImplementation$$components$$consolidate(getThis(), result$$components$$ComponentContainerImplementation, current$$);
		}
		T result = strategy.ComponentContainerImplementation$$finalize(getThis() ,result$$components$$ComponentContainerImplementation);
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
    
    public void addComponent(final Component4Public component) 
				throws model.CycleException, PersistenceException{
       getThis().getComponents().add(component);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void initializeOnCreation() 
				throws PersistenceException{
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
    }
    public ArticleWrapper4Public newArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.DoubleDefinitionException, model.InvalidInputException, model.CycleException, PersistenceException{

        if("".equals(name)) {
            throw new InvalidInputException(StringConstants.ARTICLE_NAME_EMPTY_DEFINTION_EXCEPTION_TEXT);
        }
        if(minStock < 0){
            throw new InvalidInputException(StringConstants.NEW_ARTICLE_MIN_STOCK_NOT_NEGATIVE_MESSAGE);
        }
        if(maxStock < 0) {
            throw new InvalidInputException(StringConstants.NEW_ARTICLE_MAX_STOCK_NOT_NEGATIVE_MESSAGE);
        }
        if(maxStock<minStock)//TODO <=?
        {
            throw new InvalidInputException(StringConstants.NEW_ARTICLE_MAX_STOCK_NOT_BELOW_MIN_STOCK_MESSAGE);
        }

        Article.getArticleByName(name).applyToAllException(article ->{
            if(article.getProducer().equals(producer)){
                throw new DoubleDefinitionException(StringConstants.ARTICLE_DOUBLE_DEFINITION_EXCEPTION_MESSAGE);
            }
        });
        ArticleWrapper4Public articleWrapper = ArticleWrapper.createArticleWrapper(getThis(),
                Article.createArticle(name, price, minStock, maxStock, producerDeliveryTime, producer));
        getThis().addComponent(articleWrapper);
        return articleWrapper;
    }
    public ProductGroup4Public newProductGroup(final String name) 
				throws model.DoubleDefinitionException, model.InvalidInputException, model.CycleException, PersistenceException{

        if("".equals(name)) {
            throw new InvalidInputException(StringConstants.PRODUCT_GROUP_NAME_EMPTY_DEFINTION_EXCEPTION_TEXT);
        }

        getThis().getComponents().applyToAllException(component->
        component.accept(new ComponentExceptionVisitor<DoubleDefinitionException>() {
            @Override
            public void handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException, DoubleDefinitionException {

            }

            @Override
            public void handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException, DoubleDefinitionException {
                if(productGroup.getName().equals(name))
                    throw new DoubleDefinitionException(StringConstants.PRODUCT_GROUP_DOUBLE_DEFINITION_EXCEPTION_MESSAGE);
            }
        }));


        ProductGroup4Public productGroup = ProductGroup.createProductGroup(getThis(), name);
        getThis().addComponent(productGroup);
        return productGroup;
    }
    public void removeComponent(final Component4Public component) 
				throws PersistenceException{
       getThis().getComponents().filter(x -> !x.equals(component));
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
