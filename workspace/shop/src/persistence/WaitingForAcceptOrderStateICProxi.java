package persistence;



import model.visitor.*;

public class WaitingForAcceptOrderStateICProxi extends OrderStateICProxi implements PersistentWaitingForAcceptOrderState{
    
    public WaitingForAcceptOrderStateICProxi(long objectId) {
        super(objectId);
    }
    public WaitingForAcceptOrderStateICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theWaitingForAcceptOrderStateFacade
            .getWaitingForAcceptOrderState(this.getId());
    }
    
    public long getClassId() {
        return 332;
    }
    
    public long getTicksLeft() throws PersistenceException {
        return ((PersistentWaitingForAcceptOrderState)this.getTheObject()).getTicksLeft();
    }
    public void setTicksLeft(long newValue) throws PersistenceException {
        ((PersistentWaitingForAcceptOrderState)this.getTheObject()).setTicksLeft(newValue);
    }
    public PersistentWaitingForAcceptOrderState getThis() throws PersistenceException {
        return ((PersistentWaitingForAcceptOrderState)this.getTheObject()).getThis();
    }
    
    public void accept(OrderStateVisitor visitor) throws PersistenceException {
        visitor.handleWaitingForAcceptOrderState(this);
    }
    public <R> R accept(OrderStateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleWaitingForAcceptOrderState(this);
    }
    public <E extends model.UserException>  void accept(OrderStateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleWaitingForAcceptOrderState(this);
    }
    public <R, E extends model.UserException> R accept(OrderStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleWaitingForAcceptOrderState(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleWaitingForAcceptOrderState(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleWaitingForAcceptOrderState(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleWaitingForAcceptOrderState(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleWaitingForAcceptOrderState(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleWaitingForAcceptOrderState(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleWaitingForAcceptOrderState(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleWaitingForAcceptOrderState(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleWaitingForAcceptOrderState(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentWaitingForAcceptOrderState)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentWaitingForAcceptOrderState)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentWaitingForAcceptOrderState)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentWaitingForAcceptOrderState)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentWaitingForAcceptOrderState)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentWaitingForAcceptOrderState)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentWaitingForAcceptOrderState)this.getTheObject()).initializeOnInstantiation();
    }

    
}
