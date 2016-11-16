package persistence;


import model.visitor.*;

public interface OwnerArticleWrapper4Public extends ArticleWrapper4Public {
    
    
    public void accept(ArticleWrapperVisitor visitor) throws PersistenceException;
    public <R> R accept(ArticleWrapperReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ArticleWrapperExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ArticleWrapperReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(ComponentWrapperVisitor visitor) throws PersistenceException;
    public <R> R accept(ComponentWrapperReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ComponentWrapperExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ComponentWrapperReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(CompHierarchyHIERARCHYVisitor visitor) throws PersistenceException;
    public <R> R accept(CompHierarchyHIERARCHYReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(CompHierarchyHIERARCHYExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(CompHierarchyHIERARCHYReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException;
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException;
    public void increaseStock(final long quantity) 
				throws PersistenceException;
    public void increaseStock(final long quantity, final Invoker invoker) 
				throws PersistenceException;
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void reduceStock(final long quantity) 
				throws model.NotEnoughStockException, PersistenceException;
    public void reduceStock(final long quantity, final Invoker invoker) 
				throws PersistenceException;
    public void startSelling() 
				throws PersistenceException;
    public void startSelling(final Invoker invoker) 
				throws PersistenceException;
    public void stopSelling() 
				throws PersistenceException;
    public void stopSelling(final Invoker invoker) 
				throws PersistenceException;
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException;
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public Article4Public getArticle() 
				throws PersistenceException;
    public String getCurrentState() 
				throws PersistenceException;
    public long getCurrentStock() 
				throws PersistenceException;
    public long getMaxStock() 
				throws PersistenceException;
    public long getMinStock() 
				throws PersistenceException;
    public String getName() 
				throws PersistenceException;
    public common.Fraction getPrice() 
				throws PersistenceException;
    public long getProducerDeliveryTime() 
				throws PersistenceException;
    public String getProducerName() 
				throws PersistenceException;
    public ArticleState4Public getState() 
				throws PersistenceException;
    public void increaseStockImplementation(final long quantity) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;
    public void reduceStockImplementation(final long quantity) 
				throws model.NotEnoughStockException, PersistenceException;
    public void startSellingImplementation() 
				throws PersistenceException;
    public void stopSellingImplementation() 
				throws PersistenceException;

}

