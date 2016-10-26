package persistence;



import model.visitor.*;

public class ShopArticleWrapperProxi extends ArticleWrapperProxi implements PersistentShopArticleWrapper{
    
    public ShopArticleWrapperProxi(long objectId) {
        super(objectId);
    }
    public ShopArticleWrapperProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 161;
    }
    
    public PersistentShopArticleWrapper getThis() throws PersistenceException {
        return ((PersistentShopArticleWrapper)this.getTheObject()).getThis();
    }
    
    public void accept(ArticleWrapperVisitor visitor) throws PersistenceException {
        visitor.handleShopArticleWrapper(this);
    }
    public <R> R accept(ArticleWrapperReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(ArticleWrapperExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(ArticleWrapperReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopArticleWrapper(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShopArticleWrapper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopArticleWrapper(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopArticleWrapper(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopArticleWrapper(this);
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentShopArticleWrapper)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void addToCart(final long amount) 
				throws PersistenceException{
        ((PersistentShopArticleWrapper)this.getTheObject()).addToCart(amount);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentShopArticleWrapper)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public String getName() 
				throws PersistenceException{
        return ((PersistentShopArticleWrapper)this.getTheObject()).getName();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentShopArticleWrapper)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentShopArticleWrapper)this.getTheObject()).initializeOnInstantiation();
    }

    
}
