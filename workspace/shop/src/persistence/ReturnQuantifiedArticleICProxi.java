package persistence;



import model.visitor.*;

public class ReturnQuantifiedArticleICProxi extends QuantifiedArticleICProxi implements PersistentReturnQuantifiedArticle{
    
    public ReturnQuantifiedArticleICProxi(long objectId) {
        super(objectId);
    }
    public ReturnQuantifiedArticleICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theReturnQuantifiedArticleFacade
            .getReturnQuantifiedArticle(this.getId());
    }
    
    public long getClassId() {
        return 346;
    }
    
    public PersistentReturnQuantifiedArticle getThis() throws PersistenceException {
        return ((PersistentReturnQuantifiedArticle)this.getTheObject()).getThis();
    }
    
    public void accept(QuantifiedArticleVisitor visitor) throws PersistenceException {
        visitor.handleReturnQuantifiedArticle(this);
    }
    public <R> R accept(QuantifiedArticleReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReturnQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(QuantifiedArticleExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReturnQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(QuantifiedArticleReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReturnQuantifiedArticle(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleReturnQuantifiedArticle(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReturnQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReturnQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReturnQuantifiedArticle(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleReturnQuantifiedArticle(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReturnQuantifiedArticle(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReturnQuantifiedArticle(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReturnQuantifiedArticle(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentReturnQuantifiedArticle)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentReturnQuantifiedArticle)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentReturnQuantifiedArticle)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentReturnQuantifiedArticle)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentReturnQuantifiedArticle)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void increaseQuantity(final long amount) 
				throws PersistenceException{
        ((PersistentReturnQuantifiedArticle)this.getTheObject()).increaseQuantity(amount);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentReturnQuantifiedArticle)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentReturnQuantifiedArticle)this.getTheObject()).initializeOnInstantiation();
    }

    
}
