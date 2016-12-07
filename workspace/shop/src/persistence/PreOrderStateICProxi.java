package persistence;



import model.visitor.*;

public class PreOrderStateICProxi extends OrderStatusICProxi implements PersistentPreOrderState{
    
    public PreOrderStateICProxi(long objectId) {
        super(objectId);
    }
    public PreOrderStateICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().thePreOrderStateFacade
            .getPreOrderState(this.getId());
    }
    
    public long getClassId() {
        return 337;
    }
    
    public PersistentPreOrderState getThis() throws PersistenceException {
        return ((PersistentPreOrderState)this.getTheObject()).getThis();
    }
    
    public void accept(OrderStatusVisitor visitor) throws PersistenceException {
        visitor.handlePreOrderState(this);
    }
    public <R> R accept(OrderStatusReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreOrderState(this);
    }
    public <E extends model.UserException>  void accept(OrderStatusExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreOrderState(this);
    }
    public <R, E extends model.UserException> R accept(OrderStatusReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreOrderState(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handlePreOrderState(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreOrderState(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreOrderState(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreOrderState(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handlePreOrderState(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreOrderState(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreOrderState(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreOrderState(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentPreOrderState)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentPreOrderState)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentPreOrderState)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentPreOrderState)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentPreOrderState)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentPreOrderState)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentPreOrderState)this.getTheObject()).initializeOnInstantiation();
    }

    
}
