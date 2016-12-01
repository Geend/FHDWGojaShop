package persistence;



import model.visitor.*;

public class ProcessingOrderStateICProxi extends OrderStateICProxi implements PersistentProcessingOrderState{
    
    public ProcessingOrderStateICProxi(long objectId) {
        super(objectId);
    }
    public ProcessingOrderStateICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theProcessingOrderStateFacade
            .getProcessingOrderState(this.getId());
    }
    
    public long getClassId() {
        return 335;
    }
    
    public PersistentProcessingOrderState getThis() throws PersistenceException {
        return ((PersistentProcessingOrderState)this.getTheObject()).getThis();
    }
    
    public void accept(OrderStateVisitor visitor) throws PersistenceException {
        visitor.handleProcessingOrderState(this);
    }
    public <R> R accept(OrderStateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProcessingOrderState(this);
    }
    public <E extends model.UserException>  void accept(OrderStateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProcessingOrderState(this);
    }
    public <R, E extends model.UserException> R accept(OrderStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProcessingOrderState(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleProcessingOrderState(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProcessingOrderState(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProcessingOrderState(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProcessingOrderState(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleProcessingOrderState(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProcessingOrderState(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProcessingOrderState(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProcessingOrderState(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentProcessingOrderState)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentProcessingOrderState)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentProcessingOrderState)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentProcessingOrderState)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentProcessingOrderState)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentProcessingOrderState)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentProcessingOrderState)this.getTheObject()).initializeOnInstantiation();
    }

    
}
