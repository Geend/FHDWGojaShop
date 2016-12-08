package persistence;



import model.visitor.*;

public class CustomerOrderManagerICProxi extends OrderManagerICProxi implements PersistentCustomerOrderManager{
    
    public CustomerOrderManagerICProxi(long objectId) {
        super(objectId);
    }
    public CustomerOrderManagerICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCustomerOrderManagerFacade
            .getCustomerOrderManager(this.getId());
    }
    
    public long getClassId() {
        return 308;
    }
    
    public CustomerAccount4Public getAccount() throws PersistenceException {
        return ((PersistentCustomerOrderManager)this.getTheObject()).getAccount();
    }
    public void setAccount(CustomerAccount4Public newValue) throws PersistenceException {
        ((PersistentCustomerOrderManager)this.getTheObject()).setAccount(newValue);
    }
    public PersistentCustomerOrderManager getThis() throws PersistenceException {
        return ((PersistentCustomerOrderManager)this.getTheObject()).getThis();
    }
    
    public void accept(OrderManagerVisitor visitor) throws PersistenceException {
        visitor.handleCustomerOrderManager(this);
    }
    public <R> R accept(OrderManagerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerOrderManager(this);
    }
    public <E extends model.UserException>  void accept(OrderManagerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(OrderManagerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerOrderManager(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerOrderManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerOrderManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerOrderManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerOrderManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerOrderManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerOrderManager(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCustomerOrderManager)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentCustomerOrderManager)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCustomerOrderManager)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCustomerOrderManager)this.getTheObject()).updateObservers(event);
    }
    public void acceptOrder(final Order4Public order) 
				throws model.OrderNotAcceptableException, model.NotEnoughMoneyException, PersistenceException{
        ((PersistentCustomerOrderManager)this.getTheObject()).acceptOrder(order);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentCustomerOrderManager)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentCustomerOrderManager)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentCustomerOrderManager)this.getTheObject()).initializeOnInstantiation();
    }
    public void newOrder(final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.EmptyCartException, model.ArticleOrderException, model.NotEnoughMoneyException, PersistenceException{
        ((PersistentCustomerOrderManager)this.getTheObject()).newOrder(cart, customerDeliveryTime);
    }
    public void newPreOrder(final ShoppingCart4Public cart, final CustomerDeliveryTime4Public customerDeliveryTime) 
				throws model.EmptyCartException, model.NotEnoughMoneyException, model.ArticleNotInSaleException, PersistenceException{
        ((PersistentCustomerOrderManager)this.getTheObject()).newPreOrder(cart, customerDeliveryTime);
    }

    
}
