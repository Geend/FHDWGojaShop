package persistence;


public interface PersistentProductGroup extends ComponentContainer, PersistentComponent, ProductGroup4Public {
    
    public void setComponents(ProductGroupComponents4Public newValue) throws PersistenceException , model.CycleException;
    public PersistentProductGroup getThis() throws PersistenceException ;
    
    
    public void components_update(final model.meta.ComponentMssgs event) 
				throws PersistenceException;

}

