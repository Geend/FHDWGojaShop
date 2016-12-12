package persistence;



import model.visitor.*;

public class OwnerServiceProxi extends ServiceProxi implements PersistentOwnerService{
    
    public OwnerServiceProxi(long objectId) {
        super(objectId);
    }
    public OwnerServiceProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return -276;
    }
    
    public void setShop(OwnerServiceShop4Public newValue) throws PersistenceException {
        ((PersistentOwnerService)this.getTheObject()).setShop(newValue);
    }
    public ComponentManager4Public getComponentManager() throws PersistenceException {
        return ((PersistentOwnerService)this.getTheObject()).getComponentManager();
    }
    public void setComponentManager(ComponentManager4Public newValue) throws PersistenceException {
        ((PersistentOwnerService)this.getTheObject()).setComponentManager(newValue);
    }
    public ProducerLst4Public getPrmanager() throws PersistenceException {
        return ((PersistentOwnerService)this.getTheObject()).getPrmanager();
    }
    public void setPrmanager(ProducerLst4Public newValue) throws PersistenceException {
        ((PersistentOwnerService)this.getTheObject()).setPrmanager(newValue);
    }
    public CustomerDeliveryTimeManager4Public getCustomerDeliveryTimeManager() throws PersistenceException {
        return ((PersistentOwnerService)this.getTheObject()).getCustomerDeliveryTimeManager();
    }
    public void setCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public newValue) throws PersistenceException {
        ((PersistentOwnerService)this.getTheObject()).setCustomerDeliveryTimeManager(newValue);
    }
    public Settings4Public getSettings() throws PersistenceException {
        return ((PersistentOwnerService)this.getTheObject()).getSettings();
    }
    public void setSettings(Settings4Public newValue) throws PersistenceException {
        ((PersistentOwnerService)this.getTheObject()).setSettings(newValue);
    }
    public void setReOrderManager(OwnerServiceReOrderManager4Public newValue) throws PersistenceException {
        ((PersistentOwnerService)this.getTheObject()).setReOrderManager(newValue);
    }
    public void setOrderManager(OwnerServiceOrderManager4Public newValue) throws PersistenceException {
        ((PersistentOwnerService)this.getTheObject()).setOrderManager(newValue);
    }
    public ReturnManager4Public getReturnManager() throws PersistenceException {
        return ((PersistentOwnerService)this.getTheObject()).getReturnManager();
    }
    public void setReturnManager(ReturnManager4Public newValue) throws PersistenceException {
        ((PersistentOwnerService)this.getTheObject()).setReturnManager(newValue);
    }
    public GlobalOrderArchive4Public getOrderArchive() throws PersistenceException {
        return ((PersistentOwnerService)this.getTheObject()).getOrderArchive();
    }
    public void setOrderArchive(GlobalOrderArchive4Public newValue) throws PersistenceException {
        ((PersistentOwnerService)this.getTheObject()).setOrderArchive(newValue);
    }
    public PersistentOwnerService getThis() throws PersistenceException {
        return ((PersistentOwnerService)this.getTheObject()).getThis();
    }
    
    public void accept(ServiceVisitor visitor) throws PersistenceException {
        visitor.handleOwnerService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerService(this);
    }
    public <E extends model.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerService(this);
    }
    public <R, E extends model.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerService(this);
    }
    public void accept(InvokerVisitor visitor) throws PersistenceException {
        visitor.handleOwnerService(this);
    }
    public <R> R accept(InvokerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerService(this);
    }
    public <E extends model.UserException>  void accept(InvokerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerService(this);
    }
    public <R, E extends model.UserException> R accept(InvokerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerService(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOwnerService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerService(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerService(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerService(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOwnerService(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerService(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerService(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerService(this);
    }
    public void accept(RemoteVisitor visitor) throws PersistenceException {
        visitor.handleOwnerService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerService(this);
    }
    public <E extends model.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerService(this);
    }
    public <R, E extends model.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerService(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).deregister(observee);
    }
    public GlobalOrderManager4Public getOrderManager() 
				throws PersistenceException{
        return ((PersistentOwnerService)this.getTheObject()).getOrderManager();
    }
    public ReOrderManager4Public getReOrderManager() 
				throws PersistenceException{
        return ((PersistentOwnerService)this.getTheObject()).getReOrderManager();
    }
    public Shop4Public getShop() 
				throws PersistenceException{
        return ((PersistentOwnerService)this.getTheObject()).getShop();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).initialize(This, final$$Fields);
    }
    public String ownerService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        return ((PersistentOwnerService)this.getTheObject()).ownerService_Menu_Filter(anything);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).register(observee);
    }
    public void setOrderManager(final GlobalOrderManager4Public orderManager) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).setOrderManager(orderManager);
    }
    public void setReOrderManager(final ReOrderManager4Public reOrderManager) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).setReOrderManager(reOrderManager);
    }
    public void setShop(final Shop4Public shop) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).setShop(shop);
    }
    public void signalChanged(final boolean signal) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).signalChanged(signal);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).updateObservers(event);
    }
    public void changeArticleName(final ArticleWrapper4Public article, final String newName) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).changeArticleName(article, newName);
    }
    public void changeArticlePrice(final ArticleWrapper4Public article, final common.Fraction newPrice) 
				throws model.InvalidInputException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).changeArticlePrice(article, newPrice);
    }
    public void changeArticleProducerDeliveryTime(final ArticleWrapper4Public article, final long newValue) 
				throws model.InvalidInputException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).changeArticleProducerDeliveryTime(article, newValue);
    }
    public void changeCustomerDeliveryTimePrice(final CustomerDeliveryTime4Public customerDeliveryTime, final common.Fraction newValue) 
				throws model.InvalidInputException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).changeCustomerDeliveryTimePrice(customerDeliveryTime, newValue);
    }
    public void changeCustomerDeliveryTimeTime(final CustomerDeliveryTime4Public customerDeliveryTime, final long newValue) 
				throws model.InvalidInputException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).changeCustomerDeliveryTimeTime(customerDeliveryTime, newValue);
    }
    public void changeMaxStock(final ArticleWrapper4Public article, final long newValue) 
				throws model.InvalidInputException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).changeMaxStock(article, newValue);
    }
    public void changeMinStock(final ArticleWrapper4Public article, final long newValue) 
				throws model.InvalidInputException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).changeMinStock(article, newValue);
    }
    public void changeNewCustomerDefaultBalance(final common.Fraction newValue) 
				throws model.InvalidInputException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).changeNewCustomerDefaultBalance(newValue);
    }
    public void changeNewCustomerDefaultLimit(final common.Fraction newValue) 
				throws model.InvalidInputException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).changeNewCustomerDefaultLimit(newValue);
    }
    public void changeReturnPercentage(final common.Fraction newValue) 
				throws model.InvalidInputException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).changeReturnPercentage(newValue);
    }
    public void connected(final String user) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).connected(user);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void createCustomerDeliveryTime(final CustomerDeliveryTimeManager4Public customerDeliveryTimeManager, final String name, final common.Fraction price, final long time) 
				throws model.DoubleDefinitionException, model.InvalidInputException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).createCustomerDeliveryTime(customerDeliveryTimeManager, name, price, time);
    }
    public void createProducer(final ProducerLst4Public prmanager, final String name) 
				throws model.DoubleDefinitionException, model.InvalidInputException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).createProducer(prmanager, name);
    }
    public void disconnected() 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).disconnected();
    }
    public Article4Public getArticle(final ArticleWrapper4Public wrapper) 
				throws PersistenceException{
        return ((PersistentOwnerService)this.getTheObject()).getArticle(wrapper);
    }
    public void handleException(final Command command, final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).handleException(command, exception);
    }
    public void handleResult(final Command command) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).handleResult(command);
    }
    public boolean hasChanged() 
				throws PersistenceException{
        return ((PersistentOwnerService)this.getTheObject()).hasChanged();
    }
    public void increaseArticleStock(final ArticleWrapper4Public article, final long quantity) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).increaseArticleStock(article, quantity);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).initializeOnInstantiation();
    }
    public void moveTo(final Component4Public component, final ComponentContainer newParentGroup) 
				throws model.CycleException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).moveTo(component, newParentGroup);
    }
    public void newArticle(final ComponentContainer parent, final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).newArticle(parent, name, price, minStock, maxStock, producerDeliveryTime, producer);
    }
    public void newProductGroup(final ComponentContainer parent, final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).newProductGroup(parent, name);
    }
    public void orderManager_update(final model.meta.GlobalOrderManagerMssgs event) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).orderManager_update(event);
    }
    public void reOrderManager_update(final model.meta.ReOrderManagerMssgs event) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).reOrderManager_update(event);
    }
    public void reduceArticleStock(final ArticleWrapper4Public article, final long quantity) 
				throws model.NotEnoughStockException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).reduceArticleStock(article, quantity);
    }
    public void reloadUI() 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).reloadUI();
    }
    public void shop_update(final model.meta.ShopMssgs event) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).shop_update(event);
    }
    public void startSelling(final ArticleWrapper4Public article) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).startSelling(article);
    }
    public void stopSelling(final ArticleWrapper4Public article) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).stopSelling(article);
    }

    
}
