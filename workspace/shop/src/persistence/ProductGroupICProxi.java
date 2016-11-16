package persistence;



public abstract class ProductGroupICProxi extends ComponentICProxi implements PersistentProductGroup{
    
    public ProductGroupICProxi(long objectId) {
        super(objectId);
    }
    public ProductGroupICProxi(PersistentObject object) {
        super(object);
    }
    
    
    public void setComponents(ProductGroupComponents4Public newValue) throws PersistenceException , model.CycleException{
        ((PersistentProductGroup)this.getTheObject()).setComponents(newValue);
    }
    public abstract PersistentProductGroup getThis() throws PersistenceException ;
    
    
    
    public void addComponentWrapper(final ComponentWrapper4Public componentWrapper) 
				throws model.CycleException, PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).addComponentWrapper(componentWrapper);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).deregister(observee);
    }
    public ProductGroupComponents4Public getComponents() 
				throws PersistenceException{
        return ((PersistentProductGroup)this.getTheObject()).getComponents();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void newArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).newArticle(name, price, minStock, maxStock, producerDeliveryTime, producer, invoker);
    }
    public void newSubProductGroup(final String name, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).newSubProductGroup(name, invoker);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).register(observee);
    }
    public void removeComponent(final Component4Public component) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).removeComponent(component);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).updateObservers(event);
    }
    public void addComponentWrapperImplementation(final ComponentWrapper4Public componentWrapper) 
				throws model.CycleException, PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).addComponentWrapperImplementation(componentWrapper);
    }
    public void components_update(final model.meta.ComponentWrapperMssgs event) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).components_update(event);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException{
        return ((PersistentProductGroup)this.getTheObject()).containsCompHierarchy(part);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException{
        return ((PersistentProductGroup)this.getTheObject()).containsCompHierarchy(part, visited);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).initializeOnInstantiation();
    }
    public void newArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.CycleException, PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).newArticle(name, price, minStock, maxStock, producerDeliveryTime, producer);
    }
    public void newSubProductGroup(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).newSubProductGroup(name);
    }
    public void removeComponentImplementation(final Component4Public component) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).removeComponentImplementation(component);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return ((PersistentProductGroup)this.getTheObject()).strategyCompHierarchy(strategy);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        return ((PersistentProductGroup)this.getTheObject()).strategyCompHierarchy(strategy, visited);
    }

    
}
