package persistence;



import model.visitor.*;

public class ShoppingCartICProxi extends PersistentInCacheProxiOptimistic implements PersistentShoppingCart{
    
    public ShoppingCartICProxi(long objectId) {
        super(objectId);
    }
    public ShoppingCartICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theShoppingCartFacade
            .getShoppingCart(this.getId());
    }
    
    public long getClassId() {
        return 152;
    }
    
    public ShoppingCart_ArticlesProxi getArticles() throws PersistenceException {
        return ((PersistentShoppingCart)this.getTheObject()).getArticles();
    }
    public PersistentShoppingCart getThis() throws PersistenceException {
        return ((PersistentShoppingCart)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShoppingCart(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShoppingCart(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShoppingCart(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShoppingCart(this);
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentShoppingCart)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentShoppingCart)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentShoppingCart)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentShoppingCart)this.getTheObject()).initializeOnInstantiation();
    }

    
}
