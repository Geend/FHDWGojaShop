package persistence;



import model.visitor.*;

public class RemainingStockProxi extends ArticleStateProxi implements PersistentRemainingStock{
    
    public RemainingStockProxi(long objectId) {
        super(objectId);
    }
    public RemainingStockProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 122;
    }
    
    public PersistentRemainingStock getThis() throws PersistenceException {
        return ((PersistentRemainingStock)this.getTheObject()).getThis();
    }
    
    public void accept(ArticleStateVisitor visitor) throws PersistenceException {
        visitor.handleRemainingStock(this);
    }
    public <R> R accept(ArticleStateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRemainingStock(this);
    }
    public <E extends model.UserException>  void accept(ArticleStateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRemainingStock(this);
    }
    public <R, E extends model.UserException> R accept(ArticleStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRemainingStock(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleRemainingStock(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRemainingStock(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRemainingStock(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRemainingStock(this);
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentRemainingStock)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentRemainingStock)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentRemainingStock)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentRemainingStock)this.getTheObject()).initializeOnInstantiation();
    }

    
}
