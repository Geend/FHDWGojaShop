package persistence;



import model.visitor.*;

public class ReOrderManagerReorderArticlesICProxi extends PersistentInCacheProxiOptimistic implements PersistentReOrderManagerReorderArticles{
    
    public ReOrderManagerReorderArticlesICProxi(long objectId) {
        super(objectId);
    }
    public ReOrderManagerReorderArticlesICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theReOrderManagerReorderArticlesFacade
            .getReOrderManagerReorderArticles(this.getId());
    }
    
    public long getClassId() {
        return 432;
    }
    
    public ReOrderManager4Public getObserver() throws PersistenceException {
        return ((PersistentReOrderManagerReorderArticles)this.getTheObject()).getObserver();
    }
    public void setObserver(ReOrderManager4Public newValue) throws PersistenceException {
        ((PersistentReOrderManagerReorderArticles)this.getTheObject()).setObserver(newValue);
    }
    public ReOrderManagerReorderArticles_ObserveeProxi getObservee() throws PersistenceException {
        return ((PersistentReOrderManagerReorderArticles)this.getTheObject()).getObservee();
    }
    public PersistentReOrderManagerReorderArticles getThis() throws PersistenceException {
        return ((PersistentReOrderManagerReorderArticles)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleReOrderManagerReorderArticles(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderManagerReorderArticles(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderManagerReorderArticles(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderManagerReorderArticles(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleReOrderManagerReorderArticles(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderManagerReorderArticles(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderManagerReorderArticles(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderManagerReorderArticles(this);
    }
    
    
    public void add(final ReOrderQuantifiedArticle4Public observee) 
				throws PersistenceException{
        ((PersistentReOrderManagerReorderArticles)this.getTheObject()).add(observee);
    }
    public <E extends model.UserException,R> R aggregateException(final persistence.AggregtionException<ReOrderQuantifiedArticle4Public,R,E> aggregtion) 
				throws E, PersistenceException{
        return ((PersistentReOrderManagerReorderArticles)this.getTheObject()).aggregateException(aggregtion);
    }
    public <R> R aggregate(final persistence.Aggregtion<ReOrderQuantifiedArticle4Public,R> aggregtion) 
				throws PersistenceException{
        return ((PersistentReOrderManagerReorderArticles)this.getTheObject()).aggregate(aggregtion);
    }
    public <E extends model.UserException> void applyToAllException(final persistence.ProcdureException<ReOrderQuantifiedArticle4Public,E> procdure) 
				throws E, PersistenceException{
        ((PersistentReOrderManagerReorderArticles)this.getTheObject()).applyToAllException(procdure);
    }
    public void applyToAll(final persistence.Procdure<ReOrderQuantifiedArticle4Public> procdure) 
				throws PersistenceException{
        ((PersistentReOrderManagerReorderArticles)this.getTheObject()).applyToAll(procdure);
    }
    public <E extends model.UserException> void filterException(final persistence.PredcateException<ReOrderQuantifiedArticle4Public,E> predcate) 
				throws E, PersistenceException{
        ((PersistentReOrderManagerReorderArticles)this.getTheObject()).filterException(predcate);
    }
    public void filter(final persistence.Predcate<ReOrderQuantifiedArticle4Public> predcate) 
				throws PersistenceException{
        ((PersistentReOrderManagerReorderArticles)this.getTheObject()).filter(predcate);
    }
    public <E extends model.UserException> SearchListRoot<ReOrderQuantifiedArticle4Public> findAllException(final persistence.PredcateException<ReOrderQuantifiedArticle4Public,E> predcate) 
				throws E, PersistenceException{
        return ((PersistentReOrderManagerReorderArticles)this.getTheObject()).findAllException(predcate);
    }
    public SearchListRoot<ReOrderQuantifiedArticle4Public> findAll(final persistence.Predcate<ReOrderQuantifiedArticle4Public> predcate) 
				throws PersistenceException{
        return ((PersistentReOrderManagerReorderArticles)this.getTheObject()).findAll(predcate);
    }
    public <E extends model.UserException> ReOrderQuantifiedArticle4Public findFirstException(final persistence.PredcateException<ReOrderQuantifiedArticle4Public,E> predcate) 
				throws E, PersistenceException{
        return ((PersistentReOrderManagerReorderArticles)this.getTheObject()).findFirstException(predcate);
    }
    public ReOrderQuantifiedArticle4Public findFirst(final persistence.Predcate<ReOrderQuantifiedArticle4Public> predcate) 
				throws PersistenceException{
        return ((PersistentReOrderManagerReorderArticles)this.getTheObject()).findFirst(predcate);
    }
    public long getLength() 
				throws PersistenceException{
        return ((PersistentReOrderManagerReorderArticles)this.getTheObject()).getLength();
    }
    public ReOrderQuantifiedArticleSearchList getList() 
				throws PersistenceException{
        return ((PersistentReOrderManagerReorderArticles)this.getTheObject()).getList();
    }
    public java.util.Iterator<ReOrderQuantifiedArticle4Public> iterator() 
				throws PersistenceException{
        return ((PersistentReOrderManagerReorderArticles)this.getTheObject()).iterator();
    }
    public <E extends model.UserException> void removeFirstFailureException(final persistence.PredcateException<ReOrderQuantifiedArticle4Public,E> predcate) 
				throws E, PersistenceException{
        ((PersistentReOrderManagerReorderArticles)this.getTheObject()).removeFirstFailureException(predcate);
    }
    public void removeFirstFailure(final persistence.Predcate<ReOrderQuantifiedArticle4Public> predcate) 
				throws PersistenceException{
        ((PersistentReOrderManagerReorderArticles)this.getTheObject()).removeFirstFailure(predcate);
    }
    public <E extends model.UserException> void removeFirstSuccessException(final persistence.PredcateException<ReOrderQuantifiedArticle4Public,E> predcate) 
				throws E, PersistenceException{
        ((PersistentReOrderManagerReorderArticles)this.getTheObject()).removeFirstSuccessException(predcate);
    }
    public void removeFirstSuccess(final persistence.Predcate<ReOrderQuantifiedArticle4Public> predcate) 
				throws PersistenceException{
        ((PersistentReOrderManagerReorderArticles)this.getTheObject()).removeFirstSuccess(predcate);
    }
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentReOrderManagerReorderArticles)this.getTheObject()).update(event);
    }

    
}
