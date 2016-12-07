package persistence;


import model.visitor.*;

public interface Shop4Public extends Anything, SubjInterface, AbstractPersistentProxi {
    
    public ComponentManager4Public getComponentManager() throws PersistenceException ;
    public ProducerLst4Public getPrmanager() throws PersistenceException ;
    public CustomerDeliveryTimeManager4Public getCustomerDeliveryTimeManager() throws PersistenceException ;
    
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void changeArticleName(final ArticleWrapper4Public article, final String newName) 
				throws PersistenceException;
    public void changeArticleName(final ArticleWrapper4Public article, final String newName, final Invoker invoker) 
				throws PersistenceException;
    public void changeArticlePrice(final ArticleWrapper4Public article, final common.Fraction newPrice) 
				throws PersistenceException;
    public void changeArticlePrice(final ArticleWrapper4Public article, final common.Fraction newPrice, final Invoker invoker) 
				throws PersistenceException;
    public void changeCustomerDeliveryTimePrice(final CustomerDeliveryTime4Public customerDeliveryTime, final common.Fraction newValue) 
				throws PersistenceException;
    public void changeCustomerDeliveryTimePrice(final CustomerDeliveryTime4Public customerDeliveryTime, final common.Fraction newValue, final Invoker invoker) 
				throws PersistenceException;
    public void changeCustomerDeliveryTimeTime(final CustomerDeliveryTime4Public customerDeliveryTime, final long newValue) 
				throws PersistenceException;
    public void changeCustomerDeliveryTimeTime(final CustomerDeliveryTime4Public customerDeliveryTime, final long newValue, final Invoker invoker) 
				throws PersistenceException;
    public void createCustomerDeliveryTime(final String name, final common.Fraction price, final long time) 
				throws model.DoubleDefinitionException, PersistenceException;
    public void createCustomerDeliveryTime(final String name, final common.Fraction price, final long time, final Invoker invoker) 
				throws PersistenceException;
    public void createProducer(final String name) 
				throws model.DoubleDefinitionException, PersistenceException;
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void moveTo(final Component4Public component, final ComponentContainer newParentGroup) 
				throws model.CycleException, PersistenceException;
    public void moveTo(final Component4Public component, final ComponentContainer newParentGroup, final Invoker invoker) 
				throws PersistenceException;
    public void newArticle(final ComponentContainer parent, final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException;
    public void newArticle(final ComponentContainer parent, final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer, final Invoker invoker) 
				throws PersistenceException;
    public void newProductGroup(final ComponentContainer parent, final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException;
    public void newProductGroup(final ComponentContainer parent, final String name, final Invoker invoker) 
				throws PersistenceException;
    public void newProductGroup(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException;
    public void startSelling(final ArticleWrapper4Public article) 
				throws PersistenceException;
    public void startSelling(final ArticleWrapper4Public article, final Invoker invoker) 
				throws PersistenceException;
    public void stopSelling(final ArticleWrapper4Public article) 
				throws PersistenceException;
    public void stopSelling(final ArticleWrapper4Public article, final Invoker invoker) 
				throws PersistenceException;
    public void changeArticleNameImplementation(final ArticleWrapper4Public article, final String newName) 
				throws PersistenceException;
    public void changeArticlePriceImplementation(final ArticleWrapper4Public article, final common.Fraction newPrice) 
				throws PersistenceException;
    public void changeCustomerDeliveryTimePriceImplementation(final CustomerDeliveryTime4Public customerDeliveryTime, final common.Fraction newValue) 
				throws PersistenceException;
    public void changeCustomerDeliveryTimeTimeImplementation(final CustomerDeliveryTime4Public customerDeliveryTime, final long newValue) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void createCustomerDeliveryTimeImplementation(final String name, final common.Fraction price, final long time) 
				throws model.DoubleDefinitionException, PersistenceException;
    public void createProducerImplementation(final String name) 
				throws model.DoubleDefinitionException, PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;
    public void moveToImplementation(final Component4Public component, final ComponentContainer newParentGroup) 
				throws model.CycleException, PersistenceException;
    public void newArticleImplementation(final ComponentContainer parent, final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException;
    public void newProductGroupImplementation(final ComponentContainer parent, final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException;
    public void newProductGroupImplementation(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException;
    public void startSellingImplementation(final ArticleWrapper4Public article) 
				throws PersistenceException;
    public void stopSellingImplementation(final ArticleWrapper4Public article) 
				throws PersistenceException;

}
