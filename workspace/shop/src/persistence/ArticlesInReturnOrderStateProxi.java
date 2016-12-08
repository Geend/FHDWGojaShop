package persistence;



import model.visitor.*;

public class ArticlesInReturnOrderStateProxi extends OrderStatusProxi implements PersistentArticlesInReturnOrderState{
    
    public ArticlesInReturnOrderStateProxi(long objectId) {
        super(objectId);
    }
    public ArticlesInReturnOrderStateProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 361;
    }
    
    public ArticleReturn4Public getArticleReturn() throws PersistenceException {
        return ((PersistentArticlesInReturnOrderState)this.getTheObject()).getArticleReturn();
    }
    public void setArticleReturn(ArticleReturn4Public newValue) throws PersistenceException {
        ((PersistentArticlesInReturnOrderState)this.getTheObject()).setArticleReturn(newValue);
    }
    public long getTicksLeft() throws PersistenceException {
        return ((PersistentArticlesInReturnOrderState)this.getTheObject()).getTicksLeft();
    }
    public void setTicksLeft(long newValue) throws PersistenceException {
        ((PersistentArticlesInReturnOrderState)this.getTheObject()).setTicksLeft(newValue);
    }
    public PersistentArticlesInReturnOrderState getThis() throws PersistenceException {
        return ((PersistentArticlesInReturnOrderState)this.getTheObject()).getThis();
    }
    
    public void accept(OrderStatusVisitor visitor) throws PersistenceException {
        visitor.handleArticlesInReturnOrderState(this);
    }
    public <R> R accept(OrderStatusReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticlesInReturnOrderState(this);
    }
    public <E extends model.UserException>  void accept(OrderStatusExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticlesInReturnOrderState(this);
    }
    public <R, E extends model.UserException> R accept(OrderStatusReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticlesInReturnOrderState(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleArticlesInReturnOrderState(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticlesInReturnOrderState(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticlesInReturnOrderState(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticlesInReturnOrderState(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleArticlesInReturnOrderState(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticlesInReturnOrderState(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticlesInReturnOrderState(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticlesInReturnOrderState(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentArticlesInReturnOrderState)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentArticlesInReturnOrderState)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentArticlesInReturnOrderState)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentArticlesInReturnOrderState)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentArticlesInReturnOrderState)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentArticlesInReturnOrderState)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentArticlesInReturnOrderState)this.getTheObject()).initializeOnInstantiation();
    }

    
}
