
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ReOrderManagerReorderArticles extends PersistentObject implements PersistentReOrderManagerReorderArticles{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static ReOrderManagerReorderArticles4Public getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theReOrderManagerReorderArticlesFacade.getClass(objectId);
        return (ReOrderManagerReorderArticles4Public)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static ReOrderManagerReorderArticles4Public createReOrderManagerReorderArticles() throws PersistenceException{
        return createReOrderManagerReorderArticles(false);
    }
    
    public static ReOrderManagerReorderArticles4Public createReOrderManagerReorderArticles(boolean delayed$Persistence) throws PersistenceException {
        PersistentReOrderManagerReorderArticles result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theReOrderManagerReorderArticlesFacade
                .newDelayedReOrderManagerReorderArticles();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theReOrderManagerReorderArticlesFacade
                .newReOrderManagerReorderArticles(-1);
        }
        while (!(result instanceof ReOrderManagerReorderArticles)) result = (PersistentReOrderManagerReorderArticles)result.getTheObject();
        ((ReOrderManagerReorderArticles)result).setThis(result);
        return result;
    }
    
    public ReOrderManagerReorderArticles provideCopy() throws PersistenceException{
        ReOrderManagerReorderArticles result = this;
        result = new ReOrderManagerReorderArticles(this.observer, 
                                                   this.This, 
                                                   this.getId());
        result.observee = this.observee.copy(result);
        
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentReOrderManager observer;
    protected ReOrderManagerReorderArticles_ObserveeProxi observee;
    protected PersistentReOrderManagerReorderArticles This;
    
    public ReOrderManagerReorderArticles(PersistentReOrderManager observer,PersistentReOrderManagerReorderArticles This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.observer = observer;
        this.observee = new ReOrderManagerReorderArticles_ObserveeProxi(this);
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 432;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 432) ConnectionHandler.getTheConnectionHandler().theReOrderManagerReorderArticlesFacade
            .newReOrderManagerReorderArticles(this.getId());
        super.store();
        if(this.getObserver() != null){
            this.getObserver().store();
            ConnectionHandler.getTheConnectionHandler().theReOrderManagerReorderArticlesFacade.observerSet(this.getId(), getObserver());
        }
        this.getObservee().store();
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theReOrderManagerReorderArticlesFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public ReOrderManager4Public getObserver() throws PersistenceException {
        return this.observer;
    }
    public void setObserver(ReOrderManager4Public newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observer)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observer = (PersistentReOrderManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theReOrderManagerReorderArticlesFacade.observerSet(this.getId(), newValue);
        }
    }
    public ReOrderManagerReorderArticles_ObserveeProxi getObservee() throws PersistenceException {
        return this.observee;
    }
    protected void setThis(PersistentReOrderManagerReorderArticles newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentReOrderManagerReorderArticles)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theReOrderManagerReorderArticlesFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentReOrderManagerReorderArticles getThis() throws PersistenceException {
        if(this.This == null){
            PersistentReOrderManagerReorderArticles result = (PersistentReOrderManagerReorderArticles)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentReOrderManagerReorderArticles)this.This;
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
    public int getLeafInfo() throws PersistenceException{
        if (this.getObserver() != null) return 1;
        if (this.getObservee().getLength() > 0) return 1;
        return 0;
    }
    
    
    public void add(final ReOrderQuantifiedArticle4Public observee) 
				throws PersistenceException{
        this.getObservee().add(observee);
    }
    public <E extends model.UserException,R> R aggregateException(final persistence.AggregtionException<ReOrderQuantifiedArticle4Public,R,E> aggregtion) 
				throws E, PersistenceException{
        return this.getObservee().aggregateException(aggregtion);
    }
    public <R> R aggregate(final persistence.Aggregtion<ReOrderQuantifiedArticle4Public,R> aggregtion) 
				throws PersistenceException{
        return this.getObservee().aggregate(aggregtion);
    }
    public <E extends model.UserException> void applyToAllException(final persistence.ProcdureException<ReOrderQuantifiedArticle4Public,E> procdure) 
				throws E, PersistenceException{
        this.getObservee().applyToAllException(procdure);
    }
    public void applyToAll(final persistence.Procdure<ReOrderQuantifiedArticle4Public> procdure) 
				throws PersistenceException{
        this.getObservee().applyToAll(procdure);
    }
    public <E extends model.UserException> void filterException(final persistence.PredcateException<ReOrderQuantifiedArticle4Public,E> predcate) 
				throws E, PersistenceException{
        this.getObservee().filterException(predcate);
    }
    public void filter(final persistence.Predcate<ReOrderQuantifiedArticle4Public> predcate) 
				throws PersistenceException{
        this.getObservee().filter(predcate);
    }
    public <E extends model.UserException> SearchListRoot<ReOrderQuantifiedArticle4Public> findAllException(final persistence.PredcateException<ReOrderQuantifiedArticle4Public,E> predcate) 
				throws E, PersistenceException{
        return this.getObservee().findAllException(predcate);
    }
    public SearchListRoot<ReOrderQuantifiedArticle4Public> findAll(final persistence.Predcate<ReOrderQuantifiedArticle4Public> predcate) 
				throws PersistenceException{
        return this.getObservee().findAll(predcate);
    }
    public <E extends model.UserException> ReOrderQuantifiedArticle4Public findFirstException(final persistence.PredcateException<ReOrderQuantifiedArticle4Public,E> predcate) 
				throws E, PersistenceException{
        return this.getObservee().findFirstException(predcate);
    }
    public ReOrderQuantifiedArticle4Public findFirst(final persistence.Predcate<ReOrderQuantifiedArticle4Public> predcate) 
				throws PersistenceException{
        return this.getObservee().findFirst(predcate);
    }
    public long getLength() 
				throws PersistenceException{
        		return this.getObservee().getLength();
    }
    public ReOrderQuantifiedArticleSearchList getList() 
				throws PersistenceException{
        return this.getObservee().getList();
    }
    public java.util.Iterator<ReOrderQuantifiedArticle4Public> iterator() 
				throws PersistenceException{
        return this.getObservee().iterator();
    }
    public <E extends model.UserException> void removeFirstFailureException(final persistence.PredcateException<ReOrderQuantifiedArticle4Public,E> predcate) 
				throws E, PersistenceException{
        this.getObservee().removeFirstFailureException(predcate);
    }
    public void removeFirstFailure(final persistence.Predcate<ReOrderQuantifiedArticle4Public> predcate) 
				throws PersistenceException{
        this.getObservee().removeFirstFailure(predcate);
    }
    public <E extends model.UserException> void removeFirstSuccessException(final persistence.PredcateException<ReOrderQuantifiedArticle4Public,E> predcate) 
				throws E, PersistenceException{
        this.getObservee().removeFirstSuccessException(predcate);
    }
    public void removeFirstSuccess(final persistence.Predcate<ReOrderQuantifiedArticle4Public> predcate) 
				throws PersistenceException{
        this.getObservee().removeFirstSuccess(predcate);
    }
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        this.observer.getThis().reorderArticles_update((model.meta.ReOrderQuantifiedArticleMssgs)event);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
