package persistence;



import model.visitor.*;

public class ReturnManagerProxi extends PersistentProxi implements PersistentReturnManager{
    
    public ReturnManagerProxi(long objectId) {
        super(objectId);
    }
    public ReturnManagerProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 351;
    }
    
    public ReturnManager_ArticleReturnProxi getArticleReturn() throws PersistenceException {
        return ((PersistentReturnManager)this.getTheObject()).getArticleReturn();
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentReturnManager)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentReturnManager)this.getTheObject()).setSubService(newValue);
    }
    public PersistentReturnManager getThis() throws PersistenceException {
        return ((PersistentReturnManager)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleReturnManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReturnManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReturnManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReturnManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleReturnManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReturnManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReturnManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReturnManager(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentReturnManager)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentReturnManager)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentReturnManager)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentReturnManager)this.getTheObject()).updateObservers(event);
    }
    public void addArticleReturn(final ArticleReturn4Public articleReturn) 
				throws PersistenceException{
        ((PersistentReturnManager)this.getTheObject()).addArticleReturn(articleReturn);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentReturnManager)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentReturnManager)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentReturnManager)this.getTheObject()).initializeOnInstantiation();
    }
    public void removeArticleReturn(final ArticleReturn4Public articleReturn) 
				throws PersistenceException{
        ((PersistentReturnManager)this.getTheObject()).removeArticleReturn(articleReturn);
    }

    
}
