package persistence;



import model.visitor.*;

public class OrderICProxi extends PersistentInCacheProxiOptimistic implements PersistentOrder{
    
    public OrderICProxi(long objectId) {
        super(objectId);
    }
    public OrderICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theOrderFacade
            .getOrder(this.getId());
    }
    
    public long getClassId() {
        return 238;
    }
    
    public Order_ArticlesProxi getArticles() throws PersistenceException {
        return ((PersistentOrder)this.getTheObject()).getArticles();
    }
    public CustomerDeliveryTime4Public getCustomerDeliveryTime() throws PersistenceException {
        return ((PersistentOrder)this.getTheObject()).getCustomerDeliveryTime();
    }
    public void setCustomerDeliveryTime(CustomerDeliveryTime4Public newValue) throws PersistenceException {
        ((PersistentOrder)this.getTheObject()).setCustomerDeliveryTime(newValue);
    }
    public CustomerAccount4Public getCustomerAccount() throws PersistenceException {
        return ((PersistentOrder)this.getTheObject()).getCustomerAccount();
    }
    public void setCustomerAccount(CustomerAccount4Public newValue) throws PersistenceException {
        ((PersistentOrder)this.getTheObject()).setCustomerAccount(newValue);
    }
    public common.Fraction getTotalPrice() throws PersistenceException {
        return ((PersistentOrder)this.getTheObject()).getTotalPrice();
    }
    public void setTotalPrice(common.Fraction newValue) throws PersistenceException {
        ((PersistentOrder)this.getTheObject()).setTotalPrice(newValue);
    }
    public common.Fraction getReturnPercentageAtOrderTime() throws PersistenceException {
        return ((PersistentOrder)this.getTheObject()).getReturnPercentageAtOrderTime();
    }
    public void setReturnPercentageAtOrderTime(common.Fraction newValue) throws PersistenceException {
        ((PersistentOrder)this.getTheObject()).setReturnPercentageAtOrderTime(newValue);
    }
    public OrderStatus4Public getState() throws PersistenceException {
        return ((PersistentOrder)this.getTheObject()).getState();
    }
    public void setState(OrderStatus4Public newValue) throws PersistenceException {
        ((PersistentOrder)this.getTheObject()).setState(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentOrder)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentOrder)this.getTheObject()).setSubService(newValue);
    }
    public PersistentOrder getThis() throws PersistenceException {
        return ((PersistentOrder)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrder(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrder(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrder(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOrder(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrder(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrder(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrder(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOrder)this.getTheObject()).deregister(observee);
    }
    public ArticleReturn4Public getMyOrder() 
				throws PersistenceException{
        return ((PersistentOrder)this.getTheObject()).getMyOrder();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentOrder)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOrder)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentOrder)this.getTheObject()).updateObservers(event);
    }
    public void addArticle(final OrderQuantifiedArticle4Public orderQuantifiedArticle) 
				throws PersistenceException{
        ((PersistentOrder)this.getTheObject()).addArticle(orderQuantifiedArticle);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentOrder)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentOrder)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentOrder)this.getTheObject()).initializeOnInstantiation();
    }

    
}
