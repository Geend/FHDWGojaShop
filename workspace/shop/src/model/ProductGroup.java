
package model;

import common.Fraction;
import model.meta.ComponentMssgs;
import model.meta.ComponentMssgsVisitor;
import model.meta.ComponentWrapperMssgs;
import model.meta.SubComponentMoveToProductGroupMssg;
import persistence.*;


/* Additional import section end */

public abstract class ProductGroup extends model.Component implements PersistentProductGroup{
    
    
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
    
    public abstract ProductGroup provideCopy() throws PersistenceException;
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentProductGroupComponents components;
    
    public ProductGroup(String name,SubjInterface subService,PersistentComponent This,PersistentProductGroupComponents components,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((String)name,(SubjInterface)subService,(PersistentComponent)This,id);
        this.components = components;        
    }
    
    static public long getTypeId() {
        return 121;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        super.store();
        if(this.components != null){
            this.components.store();
            ConnectionHandler.getTheConnectionHandler().theProductGroupFacade.componentsSet(this.getId(), components);
        }
        
    }
    
    public void setComponents(ProductGroupComponents4Public newValue) throws PersistenceException , model.CycleException{
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.containsCompHierarchy(getThis())) throw new model.CycleException("Cycle in CompHierarchy detected!");
        if(newValue.isTheSameAs(this.components)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.components = (PersistentProductGroupComponents)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theProductGroupFacade.componentsSet(this.getId(), newValue);
        }
    }
    public abstract PersistentProductGroup getThis() throws PersistenceException ;
    
    
    
    public void addComponentWrapper(final ComponentWrapper4Public componentWrapper) 
				throws model.CycleException, PersistenceException{
        model.meta.ProductGroupAddComponentWrapperComponentWrapperMssg event = new model.meta.ProductGroupAddComponentWrapperComponentWrapperMssg(componentWrapper, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public ProductGroupComponents4Public getComponents() 
				throws PersistenceException{
        if (this.components == null) {
			try { this.setComponents(model.ProductGroupComponents.createProductGroupComponents(this.isDelayed$Persistence())); } catch (CycleException e){throw new Error("Cycle shall be impossible!");}
			this.components.setObserver(this);
		}
		return this.components;
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentProductGroup)This);
		if(this.isTheSameAs(This)){
			this.setName((String)final$$Fields.get("name"));
		}
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
    public void newSubProductGroup(final String name, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		NewSubProductGroupCommand4Public command = model.meta.NewSubProductGroupCommand.createNewSubProductGroupCommand(name, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void removeComponent(final Component4Public component) 
				throws PersistenceException{
        model.meta.ProductGroupRemoveComponentComponentMssg event = new model.meta.ProductGroupRemoveComponentComponentMssg(component, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
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
    
    public void addComponentWrapperImplementation(final ComponentWrapper4Public componentWrapper) 
				throws model.CycleException, PersistenceException{
        getThis().getComponents().add(componentWrapper);
    }
    public void newSubProductGroup(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{

        SubProductGroup4Public subProductGroup4Public = SubProductGroup.createSubProductGroup(name, getThis());
        ProductGroupWrapper4Public dpgw= DefaultProductGroupWrapper.createDefaultProductGroupWrapper(subProductGroup4Public);
        getThis().addComponentWrapper(dpgw);


    }
    public void removeComponentImplementation(final Component4Public component) 
				throws PersistenceException{
        getThis().getComponents().filter(x -> !x.equals(component));
    }

    /* Start of protected part that is not overridden by persistence generator */



    public void newArticle(String name, Fraction price, long minStock, long maxStock, long producerDeliveryTime, Producer4Public producer) throws CycleException, PersistenceException {
        Article4Public article4Public = Article.createArticle(name, price, minStock, maxStock, producerDeliveryTime, producer, getThis());

        ComponentWrapper4Public wrapper = StandardArticleWrapper.createStandardArticleWrapper(article4Public);
        getThis().addComponentWrapper(wrapper);
    }
    @Override
    public void components_update(ComponentWrapperMssgs event) throws PersistenceException {

    }
    /* End of protected part that is not overridden by persistence generator */
    
}
