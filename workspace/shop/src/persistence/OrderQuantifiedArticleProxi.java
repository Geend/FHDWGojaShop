package persistence;



import model.visitor.*;

public class OrderQuantifiedArticleProxi extends QuantifiedArticleProxi implements PersistentOrderQuantifiedArticle{
    
    public OrderQuantifiedArticleProxi(long objectId) {
        super(objectId);
    }
    public OrderQuantifiedArticleProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 148;
    }
    
    public PersistentOrderArticleWrapper getArticle() throws PersistenceException {
        return ((PersistentOrderQuantifiedArticle)this.getTheObject()).getArticle();
    }
    public void setArticle(PersistentOrderArticleWrapper newValue) throws PersistenceException {
        ((PersistentOrderQuantifiedArticle)this.getTheObject()).setArticle(newValue);
    }
    public PersistentOrderQuantifiedArticle getThis() throws PersistenceException {
        return ((PersistentOrderQuantifiedArticle)this.getTheObject()).getThis();
    }
    
    public void accept(QuantifiedArticleVisitor visitor) throws PersistenceException {
        visitor.handleOrderQuantifiedArticle(this);
    }
    public <R> R accept(QuantifiedArticleReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(QuantifiedArticleExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(QuantifiedArticleReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderQuantifiedArticle(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOrderQuantifiedArticle(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderQuantifiedArticle(this);
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticle)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticle)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticle)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticle)this.getTheObject()).initializeOnInstantiation();
    }

    
}
