package persistence;


import model.visitor.*;

public interface CustomerOrderManager4Public extends OrderManager4Public {
    
    
    public void accept(OrderManagerVisitor visitor) throws PersistenceException;
    public <R> R accept(OrderManagerReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(OrderManagerExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(OrderManagerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void acceptOrder(final Order4Public order) 
				throws model.OrderNotAcceptableException, model.NotEnoughMoneyException, PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;
    public void newOrder(final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.EmptyCartException, model.ArticleOrderException, model.NotEnoughMoneyException, PersistenceException;
    public void newPreOrder(final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.EmptyCartException, model.NotEnoughMoneyException, model.ArticleNotInSaleException, PersistenceException;

}

