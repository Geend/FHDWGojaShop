package persistence;


import model.visitor.*;

public interface CustomerService4Public extends Service4Public {
    
    
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
    
    public String customerService_Menu_Filter(final Anything anything) 
				throws PersistenceException;
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void acceptOrder(final Order4Public order) 
				throws PersistenceException;
    public void addToCart(final ArticleWrapper4Public article, final long quantity) 
				throws PersistenceException;
    public void changeArticleQuantity(final ShoppingCartQuantifiedArticle4Public article, final long newQuantity) 
				throws PersistenceException;
    public void clearError(final ErrorDisplay4Public error) 
				throws PersistenceException;
    public void clear() 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void deposit(final common.Fraction amount) 
				throws PersistenceException;
    public void emptyCart(final ShoppingCart4Public cart) 
				throws PersistenceException;
    public void findArticle(final String name) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;
    public void markForReturn(final OrderQuantifiedArticle4Public article) 
				throws PersistenceException;
    public void order(final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.EmptyCartException, model.NotEnoughStockException, model.NotEnoughMoneyException, PersistenceException;
    public void preOrder(final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.EmptyCartException, model.NotEnoughMoneyException, PersistenceException;
    public void removeFromCart(final ShoppingCartQuantifiedArticle4Public article) 
				throws PersistenceException;
    public void unmarkForReturn(final OrderQuantifiedArticle4Public article) 
				throws PersistenceException;
    public void withdraw(final common.Fraction amount) 
				throws model.NotEnoughMoneyException, PersistenceException;

}

