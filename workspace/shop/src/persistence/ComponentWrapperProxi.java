package persistence;



public abstract class ComponentWrapperProxi extends PersistentProxi implements PersistentComponentWrapper{
    
    public ComponentWrapperProxi(long objectId) {
        super(objectId);
    }
    public ComponentWrapperProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public Component4Public getComponent() throws PersistenceException {
        return (PersistentComponent)((PersistentComponentWrapper)this.getTheObject()).getComponent();
    }
    public void setComponent(Component4Public newValue) throws PersistenceException , model.CycleException{
        ((PersistentComponentWrapper)this.getTheObject()).setComponent(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentComponentWrapper)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentComponentWrapper)this.getTheObject()).setSubService(newValue);
    }
    public abstract PersistentComponentWrapper getThis() throws PersistenceException ;
    
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentComponentWrapper)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentComponentWrapper)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentComponentWrapper)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentComponentWrapper)this.getTheObject()).updateObservers(event);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException{
        return ((PersistentComponentWrapper)this.getTheObject()).containsCompHierarchy(part);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException{
        return ((PersistentComponentWrapper)this.getTheObject()).containsCompHierarchy(part, visited);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentComponentWrapper)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentComponentWrapper)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentComponentWrapper)this.getTheObject()).initializeOnInstantiation();
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return ((PersistentComponentWrapper)this.getTheObject()).strategyCompHierarchy(strategy);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        return ((PersistentComponentWrapper)this.getTheObject()).strategyCompHierarchy(strategy, visited);
    }

    
}
