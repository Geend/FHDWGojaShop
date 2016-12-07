package persistence;



import model.visitor.*;

public class ReOrderManagerProxi extends PersistentProxi implements PersistentReOrderManager{
    
    public ReOrderManagerProxi(long objectId) {
        super(objectId);
    }
    public ReOrderManagerProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 327;
    }
    
    public ReOrderManager_ReorderArticlesProxi getReorderArticles() throws PersistenceException {
        return ((PersistentReOrderManager)this.getTheObject()).getReorderArticles();
    }
    public BackgroundTask4Public getMyCONCBackgroundTask() throws PersistenceException {
        return ((PersistentReOrderManager)this.getTheObject()).getMyCONCBackgroundTask();
    }
    public void setMyCONCBackgroundTask(BackgroundTask4Public newValue) throws PersistenceException {
        ((PersistentReOrderManager)this.getTheObject()).setMyCONCBackgroundTask(newValue);
    }
    public PersistentReOrderManager getThis() throws PersistenceException {
        return ((PersistentReOrderManager)this.getTheObject()).getThis();
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentReOrderManager)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentReOrderManager)this.getTheObject()).setSubService(newValue);
    }
    
    public void accept(BackgroundTaskVisitor visitor) throws PersistenceException {
        visitor.handleReOrderManager(this);
    }
    public <R> R accept(BackgroundTaskReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderManager(this);
    }
    public <E extends model.UserException>  void accept(BackgroundTaskExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(BackgroundTaskReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderManager(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleReOrderManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleReOrderManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleReOrderManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleReOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleReOrderManager(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentReOrderManager)this.getTheObject()).deregister(observee);
    }
    public OwnerService4Public getMyServer() 
				throws PersistenceException{
        return ((PersistentReOrderManager)this.getTheObject()).getMyServer();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentReOrderManager)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void reOrderForPreorder(final ArticleWrapper4Public article, final long quantity, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentReOrderManager)this.getTheObject()).reOrderForPreorder(article, quantity, invoker);
    }
    public void reOrder(final ArticleWrapper4Public article, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentReOrderManager)this.getTheObject()).reOrder(article, invoker);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentReOrderManager)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentReOrderManager)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentReOrderManager)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentReOrderManager)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentReOrderManager)this.getTheObject()).initializeOnInstantiation();
    }
    public void reOrderForPreorder(final ArticleWrapper4Public article, final long quantity) 
				throws PersistenceException{
        ((PersistentReOrderManager)this.getTheObject()).reOrderForPreorder(article, quantity);
    }
    public void reOrder(final ArticleWrapper4Public article) 
				throws PersistenceException{
        ((PersistentReOrderManager)this.getTheObject()).reOrder(article);
    }
    public void startTask(final long tickTime) 
				throws PersistenceException{
        ((PersistentReOrderManager)this.getTheObject()).startTask(tickTime);
    }
    public void step() 
				throws PersistenceException{
        ((PersistentReOrderManager)this.getTheObject()).step();
    }
    public void stopTask() 
				throws PersistenceException{
        ((PersistentReOrderManager)this.getTheObject()).stopTask();
    }

    
}
