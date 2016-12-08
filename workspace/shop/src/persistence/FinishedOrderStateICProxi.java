package persistence;



import model.visitor.*;

public class FinishedOrderStateICProxi extends OrderStatusICProxi implements PersistentFinishedOrderState{
    
    public FinishedOrderStateICProxi(long objectId) {
        super(objectId);
    }
    public FinishedOrderStateICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theFinishedOrderStateFacade
            .getFinishedOrderState(this.getId());
    }
    
    public long getClassId() {
        return 338;
    }
    
    public PersistentFinishedOrderState getThis() throws PersistenceException {
        return ((PersistentFinishedOrderState)this.getTheObject()).getThis();
    }
    
    public void accept(OrderStatusVisitor visitor) throws PersistenceException {
        visitor.handleFinishedOrderState(this);
    }
    public <R> R accept(OrderStatusReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleFinishedOrderState(this);
    }
    public <E extends model.UserException>  void accept(OrderStatusExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleFinishedOrderState(this);
    }
    public <R, E extends model.UserException> R accept(OrderStatusReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleFinishedOrderState(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleFinishedOrderState(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleFinishedOrderState(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleFinishedOrderState(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleFinishedOrderState(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleFinishedOrderState(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleFinishedOrderState(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleFinishedOrderState(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleFinishedOrderState(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentFinishedOrderState)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentFinishedOrderState)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentFinishedOrderState)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentFinishedOrderState)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentFinishedOrderState)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentFinishedOrderState)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentFinishedOrderState)this.getTheObject()).initializeOnInstantiation();
    }

    
}
