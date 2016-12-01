package persistence;



import model.visitor.*;

public class ArticleReturnProxi extends PersistentProxi implements PersistentArticleReturn{
    
    public ArticleReturnProxi(long objectId) {
        super(objectId);
    }
    public ArticleReturnProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 349;
    }
    
    public Order4Public getOrder() throws PersistenceException {
        return ((PersistentArticleReturn)this.getTheObject()).getOrder();
    }
    public void setOrder(Order4Public newValue) throws PersistenceException {
        ((PersistentArticleReturn)this.getTheObject()).setOrder(newValue);
    }
    public ArticleReturn_ReturnArticlesProxi getReturnArticles() throws PersistenceException {
        return ((PersistentArticleReturn)this.getTheObject()).getReturnArticles();
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentArticleReturn)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentArticleReturn)this.getTheObject()).setSubService(newValue);
    }
    public PersistentArticleReturn getThis() throws PersistenceException {
        return ((PersistentArticleReturn)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleArticleReturn(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticleReturn(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticleReturn(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticleReturn(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleArticleReturn(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticleReturn(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticleReturn(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticleReturn(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentArticleReturn)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentArticleReturn)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentArticleReturn)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentArticleReturn)this.getTheObject()).updateObservers(event);
    }
    public void addArticle(final ReturnQuantifiedArticle4Public orderQuantifiedArticle) 
				throws PersistenceException{
        ((PersistentArticleReturn)this.getTheObject()).addArticle(orderQuantifiedArticle);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentArticleReturn)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentArticleReturn)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentArticleReturn)this.getTheObject()).initializeOnInstantiation();
    }

    
}
