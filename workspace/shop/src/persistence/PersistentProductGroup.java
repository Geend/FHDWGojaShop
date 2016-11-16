package persistence;


public interface PersistentProductGroup extends PersistentComponent, ProductGroup4Public {
    
    public void setComponents(ProductGroupComponents4Public newValue) throws PersistenceException , model.CycleException;
    public abstract PersistentProductGroup getThis() throws PersistenceException ;
    
    
    public void components_update(final model.meta.ComponentWrapperMssgs event) 
				throws PersistenceException;

}

