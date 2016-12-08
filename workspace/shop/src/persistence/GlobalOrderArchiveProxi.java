package persistence;



import model.visitor.*;

public class GlobalOrderArchiveProxi extends PersistentProxi implements PersistentGlobalOrderArchive{
    
    public GlobalOrderArchiveProxi(long objectId) {
        super(objectId);
    }
    public GlobalOrderArchiveProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 436;
    }
    
    public GlobalOrderArchive_OrdersProxi getOrders() throws PersistenceException {
        return ((PersistentGlobalOrderArchive)this.getTheObject()).getOrders();
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentGlobalOrderArchive)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentGlobalOrderArchive)this.getTheObject()).setSubService(newValue);
    }
    public PersistentGlobalOrderArchive getThis() throws PersistenceException {
        return ((PersistentGlobalOrderArchive)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleGlobalOrderArchive(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleGlobalOrderArchive(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleGlobalOrderArchive(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleGlobalOrderArchive(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleGlobalOrderArchive(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleGlobalOrderArchive(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleGlobalOrderArchive(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleGlobalOrderArchive(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentGlobalOrderArchive)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentGlobalOrderArchive)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentGlobalOrderArchive)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentGlobalOrderArchive)this.getTheObject()).updateObservers(event);
    }
    public void addOrder(final Order4Public order) 
				throws PersistenceException{
        ((PersistentGlobalOrderArchive)this.getTheObject()).addOrder(order);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentGlobalOrderArchive)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentGlobalOrderArchive)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentGlobalOrderArchive)this.getTheObject()).initializeOnInstantiation();
    }

    
}
