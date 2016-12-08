package persistence;


import model.visitor.*;

public interface ReOrderManagerReorderArticles4Public extends Anything, ObsInterface, PersistentListProxiInterface<ReOrderQuantifiedArticle4Public>, AbstractPersistentProxi {
    
    public ReOrderManagerReorderArticles_ObserveeProxi getObservee() throws PersistenceException ;
    
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void add(final ReOrderQuantifiedArticle4Public observee) 
				throws PersistenceException;
    public <E extends model.UserException,R> R aggregateException(final persistence.AggregtionException<ReOrderQuantifiedArticle4Public,R,E> aggregtion) 
				throws E, PersistenceException;
    public <R> R aggregate(final persistence.Aggregtion<ReOrderQuantifiedArticle4Public,R> aggregtion) 
				throws PersistenceException;
    public <E extends model.UserException> void applyToAllException(final persistence.ProcdureException<ReOrderQuantifiedArticle4Public,E> procdure) 
				throws E, PersistenceException;
    public void applyToAll(final persistence.Procdure<ReOrderQuantifiedArticle4Public> procdure) 
				throws PersistenceException;
    public <E extends model.UserException> void filterException(final persistence.PredcateException<ReOrderQuantifiedArticle4Public,E> predcate) 
				throws E, PersistenceException;
    public void filter(final persistence.Predcate<ReOrderQuantifiedArticle4Public> predcate) 
				throws PersistenceException;
    public <E extends model.UserException> SearchListRoot<ReOrderQuantifiedArticle4Public> findAllException(final persistence.PredcateException<ReOrderQuantifiedArticle4Public,E> predcate) 
				throws E, PersistenceException;
    public SearchListRoot<ReOrderQuantifiedArticle4Public> findAll(final persistence.Predcate<ReOrderQuantifiedArticle4Public> predcate) 
				throws PersistenceException;
    public <E extends model.UserException> ReOrderQuantifiedArticle4Public findFirstException(final persistence.PredcateException<ReOrderQuantifiedArticle4Public,E> predcate) 
				throws E, PersistenceException;
    public ReOrderQuantifiedArticle4Public findFirst(final persistence.Predcate<ReOrderQuantifiedArticle4Public> predcate) 
				throws PersistenceException;
    public long getLength() 
				throws PersistenceException;
    public ReOrderQuantifiedArticleSearchList getList() 
				throws PersistenceException;
    public java.util.Iterator<ReOrderQuantifiedArticle4Public> iterator() 
				throws PersistenceException;
    public <E extends model.UserException> void removeFirstFailureException(final persistence.PredcateException<ReOrderQuantifiedArticle4Public,E> predcate) 
				throws E, PersistenceException;
    public void removeFirstFailure(final persistence.Predcate<ReOrderQuantifiedArticle4Public> predcate) 
				throws PersistenceException;
    public <E extends model.UserException> void removeFirstSuccessException(final persistence.PredcateException<ReOrderQuantifiedArticle4Public,E> predcate) 
				throws E, PersistenceException;
    public void removeFirstSuccess(final persistence.Predcate<ReOrderQuantifiedArticle4Public> predcate) 
				throws PersistenceException;
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException;

}

