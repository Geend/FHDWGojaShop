package persistence;



import model.visitor.*;

public class GlobalOrderManagerICProxi extends OrderManagerICProxi implements PersistentGlobalOrderManager{
    
    public GlobalOrderManagerICProxi(long objectId) {
        super(objectId);
    }
    public GlobalOrderManagerICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theGlobalOrderManagerFacade
            .getGlobalOrderManager(this.getId());
    }
    
    public long getClassId() {
        return 343;
    }
    
    public BackgroundTask4Public getMyCONCBackgroundTask() throws PersistenceException {
        return ((PersistentGlobalOrderManager)this.getTheObject()).getMyCONCBackgroundTask();
    }
    public void setMyCONCBackgroundTask(BackgroundTask4Public newValue) throws PersistenceException {
        ((PersistentGlobalOrderManager)this.getTheObject()).setMyCONCBackgroundTask(newValue);
    }
    public PersistentGlobalOrderManager getThis() throws PersistenceException {
        return ((PersistentGlobalOrderManager)this.getTheObject()).getThis();
    }
    
    public void accept(OrderManagerVisitor visitor) throws PersistenceException {
        visitor.handleGlobalOrderManager(this);
    }
    public <R> R accept(OrderManagerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleGlobalOrderManager(this);
    }
    public <E extends model.UserException>  void accept(OrderManagerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleGlobalOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(OrderManagerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleGlobalOrderManager(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleGlobalOrderManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleGlobalOrderManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleGlobalOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleGlobalOrderManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleGlobalOrderManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleGlobalOrderManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleGlobalOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleGlobalOrderManager(this);
    }
    public void accept(BackgroundTaskVisitor visitor) throws PersistenceException {
        visitor.handleGlobalOrderManager(this);
    }
    public <R> R accept(BackgroundTaskReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleGlobalOrderManager(this);
    }
    public <E extends model.UserException>  void accept(BackgroundTaskExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleGlobalOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(BackgroundTaskReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleGlobalOrderManager(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentGlobalOrderManager)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentGlobalOrderManager)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentGlobalOrderManager)this.getTheObject()).register(observee);
    }
    public void step() 
				throws PersistenceException{
        ((PersistentGlobalOrderManager)this.getTheObject()).step();
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentGlobalOrderManager)this.getTheObject()).updateObservers(event);
    }
    public void addOrder(final Order4Public order) 
				throws PersistenceException{
        ((PersistentGlobalOrderManager)this.getTheObject()).addOrder(order);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentGlobalOrderManager)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void finishOrder(final Order4Public order) 
				throws PersistenceException{
        ((PersistentGlobalOrderManager)this.getTheObject()).finishOrder(order);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentGlobalOrderManager)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentGlobalOrderManager)this.getTheObject()).initializeOnInstantiation();
    }
    public void startTask(final long tickTime) 
				throws PersistenceException{
        ((PersistentGlobalOrderManager)this.getTheObject()).startTask(tickTime);
    }
    public void stepImplementation() 
				throws PersistenceException{
        ((PersistentGlobalOrderManager)this.getTheObject()).stepImplementation();
    }
    public void stopTask() 
				throws PersistenceException{
        ((PersistentGlobalOrderManager)this.getTheObject()).stopTask();
    }

    
}
