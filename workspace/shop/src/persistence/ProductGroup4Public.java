package persistence;


import model.visitor.*;

public interface ProductGroup4Public extends Component4Public {
    
    
    public void accept(ProductGroupVisitor visitor) throws PersistenceException;
    public <R> R accept(ProductGroupReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ProductGroupExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ProductGroupReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void addComponent(final Component4Public component) 
				throws model.CycleException, PersistenceException;
    public ProductGroupComponents4Public getComponents() 
				throws PersistenceException;
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void newArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer, final Invoker invoker) 
				throws PersistenceException;
    public void newSubProductGroup(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException;
    public void newSubProductGroup(final String name, final Invoker invoker) 
				throws PersistenceException;
    public void removeComponent(final Component4Public component) 
				throws PersistenceException;
    public void addComponentImplementation(final Component4Public component) 
				throws model.CycleException, PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;
    public void newArticle(final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.CycleException, PersistenceException;
    public void newSubProductGroupImplementation(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException;
    public void removeComponentImplementation(final Component4Public component) 
				throws PersistenceException;

}

