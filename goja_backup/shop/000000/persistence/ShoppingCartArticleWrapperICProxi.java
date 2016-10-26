package persistence;



import model.visitor.*;

public class ShoppingCartArticleWrapperICProxi extends ArticleWrapperICProxi implements PersistentShoppingCartArticleWrapper{
    
    public ShoppingCartArticleWrapperICProxi(long objectId) {
        super(objectId);
    }
    public ShoppingCartArticleWrapperICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theShoppingCartArticleWrapperFacade
            .getShoppingCartArticleWrapper(this.getId());
    }
    
    public long getClassId() {
        return 163;
    }
    
    public PersistentShoppingCartArticleWrapper getThis() throws PersistenceException {
        return ((PersistentShoppingCartArticleWrapper)this.getTheObject()).getThis();
    }
    
    public void accept(ArticleWrapperVisitor visitor) throws PersistenceException {
        visitor.handleShoppingCartArticleWrapper(this);
    }
    public <R> R accept(ArticleWrapperReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShoppingCartArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(ArticleWrapperExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShoppingCartArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(ArticleWrapperReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShoppingCartArticleWrapper(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShoppingCartArticleWrapper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShoppingCartArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShoppingCartArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShoppingCartArticleWrapper(this);
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentShoppingCartArticleWrapper)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentShoppingCartArticleWrapper)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public String getName() 
				throws PersistenceException{
        return ((PersistentShoppingCartArticleWrapper)this.getTheObject()).getName();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentShoppingCartArticleWrapper)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentShoppingCartArticleWrapper)this.getTheObject()).initializeOnInstantiation();
    }
    public void removeFromCart() 
				throws PersistenceException{
        ((PersistentShoppingCartArticleWrapper)this.getTheObject()).removeFromCart();
    }

    
}