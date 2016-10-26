package persistence;



import model.visitor.*;

public class OrderArticleWrapperProxi extends ArticleWrapperProxi implements PersistentOrderArticleWrapper{
    
    public OrderArticleWrapperProxi(long objectId) {
        super(objectId);
    }
    public OrderArticleWrapperProxi(PersistentInCacheProxi object) {
        super(object);
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
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentOrderArticleWrapper)this.getTheObject()).initialize(This, final$$Fields);
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
