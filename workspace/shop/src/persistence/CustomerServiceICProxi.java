package persistence;



import model.visitor.*;

public class CustomerServiceICProxi extends ServiceICProxi implements PersistentCustomerService{
    
    public CustomerServiceICProxi(long objectId) {
        super(objectId);
    }
    public CustomerServiceICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade
            .getCustomerService(this.getId());
    }
    
    public long getClassId() {
        return -278;
    }
    
    public void setShop(CustomerServiceShop4Public newValue) throws PersistenceException {
        ((PersistentCustomerService)this.getTheObject()).setShop(newValue);
    }
    public CustomerArticleLst4Public getArticleLst() throws PersistenceException {
        return ((PersistentCustomerService)this.getTheObject()).getArticleLst();
    }
    public void setArticleLst(CustomerArticleLst4Public newValue) throws PersistenceException {
        ((PersistentCustomerService)this.getTheObject()).setArticleLst(newValue);
    }
    public ComponentManager4Public getComponentManager() throws PersistenceException {
        return ((PersistentCustomerService)this.getTheObject()).getComponentManager();
    }
    public void setComponentManager(ComponentManager4Public newValue) throws PersistenceException {
        ((PersistentCustomerService)this.getTheObject()).setComponentManager(newValue);
    }
    public CustomerDeliveryTimeManager4Public getCustomerDeliveryTimeManager() throws PersistenceException {
        return ((PersistentCustomerService)this.getTheObject()).getCustomerDeliveryTimeManager();
    }
    public void setCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public newValue) throws PersistenceException {
        ((PersistentCustomerService)this.getTheObject()).setCustomerDeliveryTimeManager(newValue);
    }
    public CustomerAccount4Public getAccount() throws PersistenceException {
        return ((PersistentCustomerService)this.getTheObject()).getAccount();
    }
    public void setAccount(CustomerAccount4Public newValue) throws PersistenceException {
        ((PersistentCustomerService)this.getTheObject()).setAccount(newValue);
    }
    public ShoppingCart4Public getCart() throws PersistenceException {
        return ((PersistentCustomerService)this.getTheObject()).getCart();
    }
    public void setCart(ShoppingCart4Public newValue) throws PersistenceException {
        ((PersistentCustomerService)this.getTheObject()).setCart(newValue);
    }
    public void setOrderManager(CustomerServiceOrderManager4Public newValue) throws PersistenceException {
        ((PersistentCustomerService)this.getTheObject()).setOrderManager(newValue);
    }
    public PersistentCustomerService getThis() throws PersistenceException {
        return ((PersistentCustomerService)this.getTheObject()).getThis();
    }
    
    public void accept(ServiceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerService(this);
    }
    public <E extends model.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends model.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerService(this);
    }
    public void accept(InvokerVisitor visitor) throws PersistenceException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(InvokerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerService(this);
    }
    public <E extends model.UserException>  void accept(InvokerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends model.UserException> R accept(InvokerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerService(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerService(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerService(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerService(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerService(this);
    }
    public void accept(RemoteVisitor visitor) throws PersistenceException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerService(this);
    }
    public <E extends model.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends model.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerService(this);
    }
    
    
    public String customerService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        return ((PersistentCustomerService)this.getTheObject()).customerService_Menu_Filter(anything);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).deregister(observee);
    }
    public CustomerOrderManager4Public getOrderManager() 
				throws PersistenceException{
        return ((PersistentCustomerService)this.getTheObject()).getOrderManager();
    }
    public Shop4Public getShop() 
				throws PersistenceException{
        return ((PersistentCustomerService)this.getTheObject()).getShop();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).register(observee);
    }
    public void setOrderManager(final CustomerOrderManager4Public orderManager) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).setOrderManager(orderManager);
    }
    public void setShop(final Shop4Public shop) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).setShop(shop);
    }
    public void signalChanged(final boolean signal) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).signalChanged(signal);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).updateObservers(event);
    }
    public void acceptOrder(final Order4Public order) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).acceptOrder(order);
    }
    public void addToCart(final ArticleWrapper4Public article, final long quantity) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).addToCart(article, quantity);
    }
    public void cancelPreOrder(final Order4Public order) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).cancelPreOrder(order);
    }
    public void changeArticleQuantity(final ShoppingCartQuantifiedArticle4Public article, final long newQuantity) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).changeArticleQuantity(article, newQuantity);
    }
    public void clearError(final ErrorDisplay4Public error) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).clearError(error);
    }
    public void clear(final CustomerArticleLst4Public customerArticleLst) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).clear(customerArticleLst);
    }
    public void connected(final String user) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).connected(user);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void deposit(final CustomerAccount4Public customerAccount, final common.Fraction amount) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).deposit(customerAccount, amount);
    }
    public void disconnected() 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).disconnected();
    }
    public void emptyCart(final ShoppingCart4Public cart) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).emptyCart(cart);
    }
    public void findArticle(final CustomerArticleLst4Public customerArticleLst, final String name) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).findArticle(customerArticleLst, name);
    }
    public void handleException(final Command command, final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).handleException(command, exception);
    }
    public void handleResult(final Command command) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).handleResult(command);
    }
    public boolean hasChanged() 
				throws PersistenceException{
        return ((PersistentCustomerService)this.getTheObject()).hasChanged();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).initializeOnInstantiation();
    }
    public void markForReturn(final OrderQuantifiedArticle4Public article) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).markForReturn(article);
    }
    public void orderManager_update(final model.meta.CustomerOrderManagerMssgs event) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).orderManager_update(event);
    }
    public void order(final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.EmptyCartException, model.NotEnoughStockException, model.NotEnoughMoneyException, PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).order(cart, customerDeliveryTime);
    }
    public void preOrder(final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.EmptyCartException, model.NotEnoughMoneyException, PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).preOrder(cart, customerDeliveryTime);
    }
    public void reloadUI() 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).reloadUI();
    }
    public void removeFromCart(final ShoppingCartQuantifiedArticle4Public article) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).removeFromCart(article);
    }
    public void shop_update(final model.meta.ShopMssgs event) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).shop_update(event);
    }
    public void unmarkForReturn(final OrderQuantifiedArticle4Public article) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).unmarkForReturn(article);
    }
    public void withdraw(final CustomerAccount4Public customerAccount, final common.Fraction amount) 
				throws model.NotEnoughMoneyException, PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).withdraw(customerAccount, amount);
    }

    
}
