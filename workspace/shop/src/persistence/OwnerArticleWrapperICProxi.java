package persistence;



import model.visitor.*;

public class OwnerArticleWrapperICProxi extends ArticleWrapperICProxi implements PersistentOwnerArticleWrapper{
    
    public OwnerArticleWrapperICProxi(long objectId) {
        super(objectId);
    }
    public OwnerArticleWrapperICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theOwnerArticleWrapperFacade
            .getOwnerArticleWrapper(this.getId());
    }
    
    public long getClassId() {
        return 295;
    }
    
    public PersistentOwnerArticleWrapper getThis() throws PersistenceException {
        return ((PersistentOwnerArticleWrapper)this.getTheObject()).getThis();
    }
    
    public void accept(ArticleWrapperVisitor visitor) throws PersistenceException {
        visitor.handleOwnerArticleWrapper(this);
    }
    public <R> R accept(ArticleWrapperReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(ArticleWrapperExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(ArticleWrapperReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public void accept(ComponentWrapperVisitor visitor) throws PersistenceException {
        visitor.handleOwnerArticleWrapper(this);
    }
    public <R> R accept(ComponentWrapperReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(ComponentWrapperExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(ComponentWrapperReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOwnerArticleWrapper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public void accept(CompHierarchyHIERARCHYVisitor visitor) throws PersistenceException {
        visitor.handleOwnerArticleWrapper(this);
    }
    public <R> R accept(CompHierarchyHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(CompHierarchyHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(CompHierarchyHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOwnerArticleWrapper(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOwnerArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOwnerArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOwnerArticleWrapper(this);
    }
    
    
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException{
        return ((PersistentOwnerArticleWrapper)this.getTheObject()).containsCompHierarchy(part);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException{
        return ((PersistentOwnerArticleWrapper)this.getTheObject()).containsCompHierarchy(part, visited);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOwnerArticleWrapper)this.getTheObject()).deregister(observee);
    }
    public void increaseStock(final long quantity) 
				throws PersistenceException{
        ((PersistentOwnerArticleWrapper)this.getTheObject()).increaseStock(quantity);
    }
    public void increaseStock(final long quantity, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentOwnerArticleWrapper)this.getTheObject()).increaseStock(quantity, invoker);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentOwnerArticleWrapper)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void reduceStock(final long quantity) 
				throws model.NotEnoughStockException, PersistenceException{
        ((PersistentOwnerArticleWrapper)this.getTheObject()).reduceStock(quantity);
    }
    public void reduceStock(final long quantity, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentOwnerArticleWrapper)this.getTheObject()).reduceStock(quantity, invoker);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOwnerArticleWrapper)this.getTheObject()).register(observee);
    }
    public void startSelling() 
				throws PersistenceException{
        ((PersistentOwnerArticleWrapper)this.getTheObject()).startSelling();
    }
    public void startSelling(final Invoker invoker) 
				throws PersistenceException{
        ((PersistentOwnerArticleWrapper)this.getTheObject()).startSelling(invoker);
    }
    public void stopSelling() 
				throws PersistenceException{
        ((PersistentOwnerArticleWrapper)this.getTheObject()).stopSelling();
    }
    public void stopSelling(final Invoker invoker) 
				throws PersistenceException{
        ((PersistentOwnerArticleWrapper)this.getTheObject()).stopSelling(invoker);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return ((PersistentOwnerArticleWrapper)this.getTheObject()).strategyCompHierarchy(strategy);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        return ((PersistentOwnerArticleWrapper)this.getTheObject()).strategyCompHierarchy(strategy, visited);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentOwnerArticleWrapper)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentOwnerArticleWrapper)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public Article4Public getArticle() 
				throws PersistenceException{
        return ((PersistentOwnerArticleWrapper)this.getTheObject()).getArticle();
    }
    public String getCurrentState() 
				throws PersistenceException{
        return ((PersistentOwnerArticleWrapper)this.getTheObject()).getCurrentState();
    }
    public long getCurrentStock() 
				throws PersistenceException{
        return ((PersistentOwnerArticleWrapper)this.getTheObject()).getCurrentStock();
    }
    public long getMaxStock() 
				throws PersistenceException{
        return ((PersistentOwnerArticleWrapper)this.getTheObject()).getMaxStock();
    }
    public long getMinStock() 
				throws PersistenceException{
        return ((PersistentOwnerArticleWrapper)this.getTheObject()).getMinStock();
    }
    public String getName() 
				throws PersistenceException{
        return ((PersistentOwnerArticleWrapper)this.getTheObject()).getName();
    }
    public common.Fraction getPrice() 
				throws PersistenceException{
        return ((PersistentOwnerArticleWrapper)this.getTheObject()).getPrice();
    }
    public long getProducerDeliveryTime() 
				throws PersistenceException{
        return ((PersistentOwnerArticleWrapper)this.getTheObject()).getProducerDeliveryTime();
    }
    public String getProducerName() 
				throws PersistenceException{
        return ((PersistentOwnerArticleWrapper)this.getTheObject()).getProducerName();
    }
    public ArticleState4Public getState() 
				throws PersistenceException{
        return ((PersistentOwnerArticleWrapper)this.getTheObject()).getState();
    }
    public void increaseStockImplementation(final long quantity) 
				throws PersistenceException{
        ((PersistentOwnerArticleWrapper)this.getTheObject()).increaseStockImplementation(quantity);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentOwnerArticleWrapper)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentOwnerArticleWrapper)this.getTheObject()).initializeOnInstantiation();
    }
    public void reduceStockImplementation(final long quantity) 
				throws model.NotEnoughStockException, PersistenceException{
        ((PersistentOwnerArticleWrapper)this.getTheObject()).reduceStockImplementation(quantity);
    }
    public void startSellingImplementation() 
				throws PersistenceException{
        ((PersistentOwnerArticleWrapper)this.getTheObject()).startSellingImplementation();
    }
    public void stopSellingImplementation() 
				throws PersistenceException{
        ((PersistentOwnerArticleWrapper)this.getTheObject()).stopSellingImplementation();
    }

    
}
