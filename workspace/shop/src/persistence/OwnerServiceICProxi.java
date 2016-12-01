package persistence;



import model.visitor.*;

public class OwnerServiceICProxi extends ServiceICProxi implements PersistentOwnerService{
    
    public OwnerServiceICProxi(long objectId) {
        super(objectId);
    }
    public OwnerServiceICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theOwnerServiceFacade
            .getOwnerService(this.getId());
    }
    
    public long getClassId() {
        return -276;
    }
    
    public RootProductGroup4Public getRootProductGroup() throws PersistenceException {
        return ((PersistentOwnerService)this.getTheObject()).getRootProductGroup();
    }
    public void setRootProductGroup(RootProductGroup4Public newValue) throws PersistenceException {
        ((PersistentOwnerService)this.getTheObject()).setRootProductGroup(newValue);
    }
    public CustomerDeliveryTimeManager4Public getCustomerDeliveryTimeManager() throws PersistenceException {
        return ((PersistentOwnerService)this.getTheObject()).getCustomerDeliveryTimeManager();
    }
    public void setCustomerDeliveryTimeManager(CustomerDeliveryTimeManager4Public newValue) throws PersistenceException {
        ((PersistentOwnerService)this.getTheObject()).setCustomerDeliveryTimeManager(newValue);
    }
    public ProducerLst4Public getPrmanager() throws PersistenceException {
        return ((PersistentOwnerService)this.getTheObject()).getPrmanager();
    }
    public void setPrmanager(ProducerLst4Public newValue) throws PersistenceException {
        ((PersistentOwnerService)this.getTheObject()).setPrmanager(newValue);
    }
    public Settings4Public getSettings() throws PersistenceException {
        return ((PersistentOwnerService)this.getTheObject()).getSettings();
    }
    public void setSettings(Settings4Public newValue) throws PersistenceException {
        ((PersistentOwnerService)this.getTheObject()).setSettings(newValue);
    }
    public ReOrderManager4Public getReOrderManager() throws PersistenceException {
        return ((PersistentOwnerService)this.getTheObject()).getReOrderManager();
    }
    public void setReOrderManager(ReOrderManager4Public newValue) throws PersistenceException {
        ((PersistentOwnerService)this.getTheObject()).setReOrderManager(newValue);
    }
    public OwnerOrderManager4Public getOwnerOrderManager() throws PersistenceException {
        return ((PersistentOwnerService)this.getTheObject()).getOwnerOrderManager();
    }
    public void setOwnerOrderManager(OwnerOrderManager4Public newValue) throws PersistenceException {
        ((PersistentOwnerService)this.getTheObject()).setOwnerOrderManager(newValue);
    }
    public ReturnManager4Public getReturnManager() throws PersistenceException {
        return ((PersistentOwnerService)this.getTheObject()).getReturnManager();
    }
    public void setReturnManager(ReturnManager4Public newValue) throws PersistenceException {
        ((PersistentOwnerService)this.getTheObject()).setReturnManager(newValue);
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
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).changeArticlePrice(article, newPrice);
    }
    public void changeCustomerDeliveryTimePrice(final CustomerDeliveryTime4Public customerDeliveryTime, final common.Fraction newValue) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).changeCustomerDeliveryTimePrice(customerDeliveryTime, newValue);
    }
    public void changeCustomerDeliveryTimeTime(final CustomerDeliveryTime4Public customerDeliveryTime, final long newValue) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).changeCustomerDeliveryTimeTime(customerDeliveryTime, newValue);
    }
    public void changeNewCustomerDefaultBalance(final common.Fraction newValue) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).changeNewCustomerDefaultBalance(newValue);
    }
    public void changeNewCustomerDefaultLimit(final common.Fraction newValue) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).changeNewCustomerDefaultLimit(newValue);
    }
    public void changeReturnPercentage(final common.Fraction newValue) 
				throws PersistenceException{
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
    public void createCustomerDeliveryTime(final String name, final common.Fraction price, final long time) 
				throws model.DoubleDefinitionException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).createCustomerDeliveryTime(name, price, time);
    }
    public void createProducer(final String name) 
				throws model.DoubleDefinitionException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).createProducer(name);
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
    public void moveTo(final SubComponent component, final ProductGroup4Public newParentGroup) 
				throws model.CycleException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).moveTo(component, newParentGroup);
    }
    public void newArticle(final ProductGroup4Public parent, final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.CycleException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).newArticle(parent, name, price, minStock, maxStock, producerDeliveryTime, producer);
    }
    public void newProductGroup(final ProductGroup4Public parent, final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).newProductGroup(parent, name);
    }
    public void newProductGroup(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).newProductGroup(name);
    }
    public void reduceArticleStock(final ArticleWrapper4Public article, final long quantity) 
				throws model.NotEnoughStockException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).reduceArticleStock(article, quantity);
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
