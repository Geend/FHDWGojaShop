package persistence;



import model.visitor.*;

public class ShopICProxi extends PersistentInCacheProxiOptimistic implements PersistentShop{
    
    public ShopICProxi(long objectId) {
        super(objectId);
    }
    public ShopICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theShopFacade
            .getShop(this.getId());
    }
    
    public long getClassId() {
        return 428;
    }
    
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentShop)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentShop)this.getTheObject()).setSubService(newValue);
    }
    public PersistentShop getThis() throws PersistenceException {
        return ((PersistentShop)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShop(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShop(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShop(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShop(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleShop(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShop(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShop(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShop(this);
    }
    
    
    public void acceptOrder(final CustomerOrderManager4Public manager, final Order4Public order) 
				throws model.OrderNotAcceptableException, model.NotEnoughMoneyException, PersistenceException{
        ((PersistentShop)this.getTheObject()).acceptOrder(manager, order);
    }
    public void acceptOrder(final CustomerOrderManager4Public manager, final Order4Public order, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).acceptOrder(manager, order, invoker);
    }
    public void changeArticleName(final ArticleWrapper4Public article, final String newName) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).changeArticleName(article, newName);
    }
    public void changeArticleName(final ArticleWrapper4Public article, final String newName, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).changeArticleName(article, newName, invoker);
    }
    public void changeArticlePrice(final ArticleWrapper4Public article, final common.Fraction newPrice) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).changeArticlePrice(article, newPrice);
    }
    public void changeArticlePrice(final ArticleWrapper4Public article, final common.Fraction newPrice, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).changeArticlePrice(article, newPrice, invoker);
    }
    public void changeCustomerDeliveryTimePrice(final CustomerDeliveryTime4Public customerDeliveryTime, final common.Fraction newValue) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).changeCustomerDeliveryTimePrice(customerDeliveryTime, newValue);
    }
    public void changeCustomerDeliveryTimePrice(final CustomerDeliveryTime4Public customerDeliveryTime, final common.Fraction newValue, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).changeCustomerDeliveryTimePrice(customerDeliveryTime, newValue, invoker);
    }
    public void changeCustomerDeliveryTimeTime(final CustomerDeliveryTime4Public customerDeliveryTime, final long newValue) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).changeCustomerDeliveryTimeTime(customerDeliveryTime, newValue);
    }
    public void changeCustomerDeliveryTimeTime(final CustomerDeliveryTime4Public customerDeliveryTime, final long newValue, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).changeCustomerDeliveryTimeTime(customerDeliveryTime, newValue, invoker);
    }
    public void createCustomerDeliveryTime(final String name, final common.Fraction price, final long time) 
				throws model.DoubleDefinitionException, model.EmptyDefinitionException, PersistenceException{
        ((PersistentShop)this.getTheObject()).createCustomerDeliveryTime(name, price, time);
    }
    public void createCustomerDeliveryTime(final String name, final common.Fraction price, final long time, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).createCustomerDeliveryTime(name, price, time, invoker);
    }
    public Producer4Public createProducer(final String name) 
				throws model.DoubleDefinitionException, model.EmptyDefinitionException, PersistenceException{
        return ((PersistentShop)this.getTheObject()).createProducer(name);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void moveTo(final Component4Public component, final ComponentContainer newParentGroup) 
				throws model.CycleException, PersistenceException{
        ((PersistentShop)this.getTheObject()).moveTo(component, newParentGroup);
    }
    public void moveTo(final Component4Public component, final ComponentContainer newParentGroup, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).moveTo(component, newParentGroup, invoker);
    }
    public ArticleWrapper4Public newArticle(final ComponentContainer parent, final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.DoubleDefinitionException, model.EmptyDefinitionException, model.CycleException, PersistenceException{
        return ((PersistentShop)this.getTheObject()).newArticle(parent, name, price, minStock, maxStock, producerDeliveryTime, producer);
    }
    public void newArticle(final ComponentContainer parent, final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).newArticle(parent, name, price, minStock, maxStock, producerDeliveryTime, producer, invoker);
    }
    public ProductGroup4Public newProductGroup(final ComponentContainer parent, final String name) 
				throws model.DoubleDefinitionException, model.EmptyDefinitionException, model.CycleException, PersistenceException{
        return ((PersistentShop)this.getTheObject()).newProductGroup(parent, name);
    }
    public void newProductGroup(final ComponentContainer parent, final String name, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).newProductGroup(parent, name, invoker);
    }
    public void orderCart(final CustomerOrderManager4Public manager, final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.EmptyCartException, model.ArticleOrderException, model.NotEnoughMoneyException, PersistenceException{
        ((PersistentShop)this.getTheObject()).orderCart(manager, cart, customerDeliveryTime);
    }
    public void orderCart(final CustomerOrderManager4Public manager, final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).orderCart(manager, cart, customerDeliveryTime, invoker);
    }
    public void preOrderCart(final CustomerOrderManager4Public manager, final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.EmptyCartException, model.NotEnoughMoneyException, model.ArticleNotInSaleException, PersistenceException{
        ((PersistentShop)this.getTheObject()).preOrderCart(manager, cart, customerDeliveryTime);
    }
    public void preOrderCart(final CustomerOrderManager4Public manager, final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).preOrderCart(manager, cart, customerDeliveryTime, invoker);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).register(observee);
    }
    public void startSelling(final ArticleWrapper4Public article) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).startSelling(article);
    }
    public void startSelling(final ArticleWrapper4Public article, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).startSelling(article, invoker);
    }
    public void stopSelling(final ArticleWrapper4Public article) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).stopSelling(article);
    }
    public void stopSelling(final ArticleWrapper4Public article, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).stopSelling(article, invoker);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).updateObservers(event);
    }
    public void acceptOrderImplementation(final CustomerOrderManager4Public manager, final Order4Public order) 
				throws model.OrderNotAcceptableException, model.NotEnoughMoneyException, PersistenceException{
        ((PersistentShop)this.getTheObject()).acceptOrderImplementation(manager, order);
    }
    public void changeArticleNameImplementation(final ArticleWrapper4Public article, final String newName) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).changeArticleNameImplementation(article, newName);
    }
    public void changeArticlePriceImplementation(final ArticleWrapper4Public article, final common.Fraction newPrice) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).changeArticlePriceImplementation(article, newPrice);
    }
    public void changeCustomerDeliveryTimePriceImplementation(final CustomerDeliveryTime4Public customerDeliveryTime, final common.Fraction newValue) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).changeCustomerDeliveryTimePriceImplementation(customerDeliveryTime, newValue);
    }
    public void changeCustomerDeliveryTimeTimeImplementation(final CustomerDeliveryTime4Public customerDeliveryTime, final long newValue) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).changeCustomerDeliveryTimeTimeImplementation(customerDeliveryTime, newValue);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void createCustomerDeliveryTimeImplementation(final String name, final common.Fraction price, final long time) 
				throws model.DoubleDefinitionException, model.EmptyDefinitionException, PersistenceException{
        ((PersistentShop)this.getTheObject()).createCustomerDeliveryTimeImplementation(name, price, time);
    }
    public Producer4Public createProducerImplementation(final String name) 
				throws model.DoubleDefinitionException, model.EmptyDefinitionException, PersistenceException{
        return ((PersistentShop)this.getTheObject()).createProducerImplementation(name);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).initializeOnInstantiation();
    }
    public void moveToImplementation(final Component4Public component, final ComponentContainer newParentGroup) 
				throws model.CycleException, PersistenceException{
        ((PersistentShop)this.getTheObject()).moveToImplementation(component, newParentGroup);
    }
    public ArticleWrapper4Public newArticleImplementation(final ComponentContainer parent, final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.DoubleDefinitionException, model.EmptyDefinitionException, model.CycleException, PersistenceException{
        return ((PersistentShop)this.getTheObject()).newArticleImplementation(parent, name, price, minStock, maxStock, producerDeliveryTime, producer);
    }
    public ProductGroup4Public newProductGroupImplementation(final ComponentContainer parent, final String name) 
				throws model.DoubleDefinitionException, model.EmptyDefinitionException, model.CycleException, PersistenceException{
        return ((PersistentShop)this.getTheObject()).newProductGroupImplementation(parent, name);
    }
    public void orderCartImplementation(final CustomerOrderManager4Public manager, final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.EmptyCartException, model.ArticleOrderException, model.NotEnoughMoneyException, PersistenceException{
        ((PersistentShop)this.getTheObject()).orderCartImplementation(manager, cart, customerDeliveryTime);
    }
    public void preOrderCartImplementation(final CustomerOrderManager4Public manager, final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.EmptyCartException, model.NotEnoughMoneyException, model.ArticleNotInSaleException, PersistenceException{
        ((PersistentShop)this.getTheObject()).preOrderCartImplementation(manager, cart, customerDeliveryTime);
    }
    public void startSellingImplementation(final ArticleWrapper4Public article) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).startSellingImplementation(article);
    }
    public void stopSellingImplementation(final ArticleWrapper4Public article) 
				throws PersistenceException{
        ((PersistentShop)this.getTheObject()).stopSellingImplementation(article);
    }

    
}
