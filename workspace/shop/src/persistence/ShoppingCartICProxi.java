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
        return 241;
    }
    
    public ShoppingCart_ArticlesProxi getArticles() throws PersistenceException {
        return ((PersistentShoppingCart)this.getTheObject()).getArticles();
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentShoppingCart)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentShoppingCart)this.getTheObject()).setSubService(newValue);
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
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleShoppingCart(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShoppingCart(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShoppingCart(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShoppingCart(this);
    }
    
    
    public void addArticle(final ShoppingCartQuantifiedArticle4Public article, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShoppingCart)this.getTheObject()).addArticle(article, invoker);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentShoppingCart)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentShoppingCart)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentShoppingCart)this.getTheObject()).register(observee);
    }
    public void removeArticle(final ShoppingCartQuantifiedArticle4Public article, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShoppingCart)this.getTheObject()).removeArticle(article, invoker);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentShoppingCart)this.getTheObject()).updateObservers(event);
    }
    public void addArticle(final ShoppingCartQuantifiedArticle4Public article) 
				throws PersistenceException{
        ((PersistentShoppingCart)this.getTheObject()).addArticle(article);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentShoppingCart)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void empty() 
				throws PersistenceException{
        ((PersistentShoppingCart)this.getTheObject()).empty();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentShoppingCart)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentShoppingCart)this.getTheObject()).initializeOnInstantiation();
    }
    public void removeArticle(final ShoppingCartQuantifiedArticle4Public article) 
				throws PersistenceException{
        ((PersistentShoppingCart)this.getTheObject()).removeArticle(article);
    }

    
}
