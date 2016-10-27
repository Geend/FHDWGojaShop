package persistence;



import model.visitor.*;

public class OrderArticleWrapperICProxi extends ArticleWrapperICProxi implements PersistentOrderArticleWrapper{
    
    public OrderArticleWrapperICProxi(long objectId) {
        super(objectId);
    }
    public OrderArticleWrapperICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theOrderArticleWrapperFacade
            .getOrderArticleWrapper(this.getId());
    }
    
    public long getClassId() {
        return 167;
    }
    
    public common.Fraction getPriceAtOrder() throws PersistenceException {
        return ((PersistentOrderArticleWrapper)this.getTheObject()).getPriceAtOrder();
    }
    public void setPriceAtOrder(common.Fraction newValue) throws PersistenceException {
        ((PersistentOrderArticleWrapper)this.getTheObject()).setPriceAtOrder(newValue);
    }
    public PersistentOrderArticleWrapper getThis() throws PersistenceException {
        return ((PersistentOrderArticleWrapper)this.getTheObject()).getThis();
    }
    
    public void accept(ArticleWrapperVisitor visitor) throws PersistenceException {
        visitor.handleOrderArticleWrapper(this);
    }
    public <R> R accept(ArticleWrapperReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(ArticleWrapperExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(ArticleWrapperReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderArticleWrapper(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOrderArticleWrapper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderArticleWrapper(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOrderArticleWrapper(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderArticleWrapper(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOrderArticleWrapper)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentOrderArticleWrapper)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOrderArticleWrapper)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentOrderArticleWrapper)this.getTheObject()).updateObservers(event);
    }
    public void accept() 
				throws PersistenceException{
        ((PersistentOrderArticleWrapper)this.getTheObject()).accept();
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentOrderArticleWrapper)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public String getName() 
				throws PersistenceException{
        return ((PersistentOrderArticleWrapper)this.getTheObject()).getName();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentOrderArticleWrapper)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentOrderArticleWrapper)this.getTheObject()).initializeOnInstantiation();
    }
    public void sendBack() 
				throws PersistenceException{
        ((PersistentOrderArticleWrapper)this.getTheObject()).sendBack();
    }

    
}
