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
    
    public ProducerLst4Public getPrmanager() throws PersistenceException {
        return ((PersistentOwnerService)this.getTheObject()).getPrmanager();
    }
    public void setPrmanager(ProducerLst4Public newValue) throws PersistenceException {
        ((PersistentOwnerService)this.getTheObject()).setPrmanager(newValue);
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
    public RootProductGroup4Public getRootProductGroup() 
				throws PersistenceException{
        return ((PersistentOwnerService)this.getTheObject()).getRootProductGroup();
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
    public void setRootProductGroup(final RootProductGroup4Public rootProductGroup) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).setRootProductGroup(rootProductGroup);
    }
    public void signalChanged(final boolean signal) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).signalChanged(signal);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).updateObservers(event);
    }
    public void changeArticleName(final OwnerArticleWrapper4Public article, final String newName) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).changeArticleName(article, newName);
    }
    public void connected(final String user) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).connected(user);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void createProducer(final String name) 
				throws model.DoubleDefinitionException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).createProducer(name);
    }
    public void disconnected() 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).disconnected();
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
    public void increaseArticleStock(final StandardArticleWrapper4Public article, final long quantity) 
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
    public OwnerArticleWrapper4Public loadOwnerServiceArticleWrapper(final StandardArticleWrapper4Public wrapper) 
				throws PersistenceException{
        return ((PersistentOwnerService)this.getTheObject()).loadOwnerServiceArticleWrapper(wrapper);
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
    public void reduceArticleStock(final StandardArticleWrapper4Public article, final long quantity) 
				throws model.NotEnoughStockException, PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).reduceArticleStock(article, quantity);
    }
    public void rootProductGroup_update(final model.meta.RootProductGroupMssgs event) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).rootProductGroup_update(event);
    }
    public void startSelling(final StandardArticleWrapper4Public article) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).startSelling(article);
    }
    public void stopSelling(final StandardArticleWrapper4Public article) 
				throws PersistenceException{
        ((PersistentOwnerService)this.getTheObject()).stopSelling(article);
    }

    
}
