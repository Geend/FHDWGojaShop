
package model;

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
            result.put("components", this.getComponents().getObservee().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ComponentContainerImplementation provideCopy() throws PersistenceException{
        ComponentContainerImplementation result = this;
        result = new ComponentContainerImplementation(this.components, 
                                                      this.subService, 
                                                      this.This, 
                                                      this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentComponentContainerImplementationComponents components;
    protected SubjInterface subService;
    protected PersistentComponentContainerImplementation This;
    
    public ComponentContainerImplementation(PersistentComponentContainerImplementationComponents components,SubjInterface subService,PersistentComponentContainerImplementation This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.components = components;
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
        if(this.components != null){
            this.components.store();
            ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationFacade.componentsSet(this.getId(), components);
        }
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public void setComponents(ComponentContainerImplementationComponents4Public newValue) throws PersistenceException , model.CycleException{
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.containsCompHierarchy(getThis())) throw new model.CycleException("Cycle in CompHierarchy detected!");
        if(newValue.isTheSameAs(this.components)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.components = (PersistentComponentContainerImplementationComponents)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theComponentContainerImplementationFacade.componentsSet(this.getId(), newValue);
        }
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
        if (this.getComponents().getObservee().getLength() > 0) return 1;
        return 0;
    }
    
    
    public void addComponent(final Component4Public component) 
				throws model.CycleException, PersistenceException{
        model.meta.ComponentContainerAddComponentComponentMssg event = new model.meta.ComponentContainerAddComponentComponentMssg(component, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException{
        return getThis().containsCompHierarchy(part, new java.util.HashSet<CompHierarchyHIERARCHY>());
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException{
        if(getThis().equals(part)) return true;
		if(visited.contains(getThis())) return false;
		if(getThis().getComponents() != null && getThis().getComponents().containsCompHierarchy(part, visited)) return true;
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
    public void fireComponentChanged(final model.meta.ComponentMssgs evnt) 
				throws PersistenceException{
        model.meta.ComponentContainerFireComponentChangedComponentMssgsMssg event = new model.meta.ComponentContainerFireComponentChangedComponentMssgsMssg(evnt, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public ComponentContainerImplementationComponents4Public getComponents() 
				throws PersistenceException{
        if (this.components == null) {
			try { this.setComponents(model.ComponentContainerImplementationComponents.createComponentContainerImplementationComponents(this.isDelayed$Persistence())); } catch (CycleException e){throw new Error("Cycle shall be impossible!");}
			this.components.setObserver(this);
		}
		return this.components;
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentComponentContainerImplementation)This);
		if(this.isTheSameAs(This)){
		}
    }
    public ArticleWrapper4Public newArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.CycleException, PersistenceException{
        model.meta.ComponentContainerNewArticleStringFractionIntegerIntegerIntegerProducerMssg event = new model.meta.ComponentContainerNewArticleStringFractionIntegerIntegerIntegerProducerMssg(name, price, minStock, maxStock, producerDeliveryTime, producer, getThis());
		event.execute();
		getThis().updateObservers(event);
		return event.getResult();
    }
    public void newArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		NewArticleCommand4Public command = model.meta.NewArticleCommand.createNewArticleCommand(name, price, minStock, maxStock, producerDeliveryTime, now, now);
		command.setProducer(producer);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public ProductGroup4Public newProductGroup(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        model.meta.ComponentContainerNewProductGroupStringMssg event = new model.meta.ComponentContainerNewProductGroupStringMssg(name, getThis());
		event.execute();
		getThis().updateObservers(event);
		return event.getResult();
    }
    public void newProductGroup(final String name, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		NewProductGroupCommand4Public command = model.meta.NewProductGroupCommand.createNewProductGroupCommand(name, now, now);
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
    public void removeComponent(final Component4Public component) 
				throws PersistenceException{
        model.meta.ComponentContainerRemoveComponentComponentMssg event = new model.meta.ComponentContainerRemoveComponentComponentMssg(component, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return getThis().strategyCompHierarchy(strategy, new java.util.HashMap<CompHierarchyHIERARCHY,T>());
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        if (visited.containsKey(getThis())) return visited.get(getThis());
		T result$$components$$ComponentContainerImplementation = this.getComponents().strategyCompHierarchy(strategy, visited);
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
    
    public void addComponentImplementation(final Component4Public component) 
				throws model.CycleException, PersistenceException{
        getThis().getComponents().add(component);
    }
    public void components_update(final model.meta.ComponentMssgs event) 
				throws PersistenceException{
        getThis().fireComponentChanged(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes

    }
    public void fireComponentChangedImplementation(final model.meta.ComponentMssgs evnt) 
				throws PersistenceException{
        //TODO: implement method: fireComponentChangedImplementation
        
    }
    public void initializeOnCreation() 
				throws PersistenceException{
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        //TODO: implement method: initializeOnInstantiation

    }
    public ArticleWrapper4Public newArticleImplementation(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.CycleException, PersistenceException{
        ArticleWrapper4Public articleWrapper = ArticleWrapper.createArticleWrapper(getThis(),
                Article.createArticle(name, price, minStock, maxStock, producerDeliveryTime, producer));
        getThis().addComponent(articleWrapper);
        return articleWrapper;
    }
    public ProductGroup4Public newProductGroupImplementation(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{

        ProductGroup4Public productGroup = ProductGroup.createProductGroup(getThis(), name);
        getThis().addComponent(productGroup);
        return productGroup;
    }
    public void removeComponentImplementation(final Component4Public component) 
				throws PersistenceException{
        getThis().getComponents().filter(x -> !x.equals(component));
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
