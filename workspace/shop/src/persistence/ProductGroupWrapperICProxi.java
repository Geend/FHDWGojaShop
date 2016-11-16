package persistence;



public abstract class ProductGroupWrapperICProxi extends ComponentWrapperICProxi implements PersistentProductGroupWrapper{
    
    public ProductGroupWrapperICProxi(long objectId) {
        super(objectId);
    }
    public ProductGroupWrapperICProxi(PersistentObject object) {
        super(object);
    }
    
    
    public abstract PersistentProductGroupWrapper getThis() throws PersistenceException ;
    public ProductGroup4Public getComponent() throws PersistenceException {
        return ((PersistentProductGroupWrapper)this.getTheObject()).getComponent();
    }
    
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentProductGroupWrapper)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentProductGroupWrapper)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentProductGroupWrapper)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentProductGroupWrapper)this.getTheObject()).updateObservers(event);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException{
        return ((PersistentProductGroupWrapper)this.getTheObject()).containsCompHierarchy(part);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException{
        return ((PersistentProductGroupWrapper)this.getTheObject()).containsCompHierarchy(part, visited);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentProductGroupWrapper)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentProductGroupWrapper)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentProductGroupWrapper)this.getTheObject()).initializeOnInstantiation();
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return ((PersistentProductGroupWrapper)this.getTheObject()).strategyCompHierarchy(strategy);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        return ((PersistentProductGroupWrapper)this.getTheObject()).strategyCompHierarchy(strategy, visited);
    }

    
}
