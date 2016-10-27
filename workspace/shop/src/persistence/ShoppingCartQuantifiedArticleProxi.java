package persistence;



import model.visitor.*;

public class ShoppingCartQuantifiedArticleProxi extends QuantifiedArticleProxi implements PersistentShoppingCartQuantifiedArticle{
    
    public ShoppingCartQuantifiedArticleProxi(long objectId) {
        super(objectId);
    }
    public ShoppingCartQuantifiedArticleProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 153;
    }
    
    public PersistentShoppingCartArticleWrapper getArticle() throws PersistenceException {
        return ((PersistentShoppingCartQuantifiedArticle)this.getTheObject()).getArticle();
    }
    public void setArticle(PersistentShoppingCartArticleWrapper newValue) throws PersistenceException {
        ((PersistentShoppingCartQuantifiedArticle)this.getTheObject()).setArticle(newValue);
    }
    public PersistentShoppingCartQuantifiedArticle getThis() throws PersistenceException {
        return ((PersistentShoppingCartQuantifiedArticle)this.getTheObject()).getThis();
    }
    
    public void accept(QuantifiedArticleVisitor visitor) throws PersistenceException {
        visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public <R> R accept(QuantifiedArticleReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(QuantifiedArticleExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(QuantifiedArticleReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShoppingCartQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShoppingCartQuantifiedArticle(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentShoppingCartQuantifiedArticle)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentShoppingCartQuantifiedArticle)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentShoppingCartQuantifiedArticle)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentShoppingCartQuantifiedArticle)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentShoppingCartQuantifiedArticle)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentShoppingCartQuantifiedArticle)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentShoppingCartQuantifiedArticle)this.getTheObject()).initializeOnInstantiation();
    }

    
}
