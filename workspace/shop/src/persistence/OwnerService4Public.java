package persistence;


import model.visitor.*;

public interface OwnerService4Public extends Service4Public {
    
    
    public void accept(ServiceVisitor visitor) throws PersistenceException;
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(InvokerVisitor visitor) throws PersistenceException;
    public <R> R accept(InvokerReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(InvokerExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(InvokerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(RemoteVisitor visitor) throws PersistenceException;
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public String ownerService_Menu_Filter(final Anything anything) 
				throws PersistenceException;
    public void changeArticleName(final ArticleWrapper4Public article, final String newName) 
				throws PersistenceException;
    public void changeArticlePrice(final ArticleWrapper4Public article, final common.Fraction newPrice) 
				throws PersistenceException;
    public void changeCustomerDeliveryTimePrice(final CustomerDeliveryTime4Public customerDeliveryTime, final common.Fraction newValue) 
				throws PersistenceException;
    public void changeCustomerDeliveryTimeTime(final CustomerDeliveryTime4Public customerDeliveryTime, final long newValue) 
				throws PersistenceException;
    public void changeNewCustomerDefaultBalance(final common.Fraction newValue) 
				throws PersistenceException;
    public void changeNewCustomerDefaultLimit(final common.Fraction newValue) 
				throws PersistenceException;
    public void changeReturnPercentage(final common.Fraction newValue) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void createCustomerDeliveryTime(final String name, final common.Fraction price, final long time) 
				throws model.DoubleDefinitionException, PersistenceException;
    public void createProducer(final String name) 
				throws model.DoubleDefinitionException, PersistenceException;
    public Article4Public getArticle(final ArticleWrapper4Public wrapper) 
				throws PersistenceException;
    public void increaseArticleStock(final ArticleWrapper4Public article, final long quantity) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;
    public void moveTo(final Component4Public component, final ComponentContainer newParentGroup) 
				throws model.CycleException, PersistenceException;
    public void newArticle(final ProductGroup4Public parent, final String name, final common.Fraction price, final long minStock, final long maxStock, final long producerDeliveryTime, final Producer4Public producer) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException;
    public void newProductGroup(final ProductGroup4Public parent, final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException;
    public void newProductGroup(final String name) 
				throws model.DoubleDefinitionException, model.CycleException, PersistenceException;
    public void reduceArticleStock(final ArticleWrapper4Public article, final long quantity) 
				throws model.NotEnoughStockException, PersistenceException;
    public void startSelling(final ArticleWrapper4Public article) 
				throws PersistenceException;
    public void stopSelling(final ArticleWrapper4Public article) 
				throws PersistenceException;

}

