package persistence;



import model.visitor.*;

public class InTransitOrderStateProxi extends OrderStateProxi implements PersistentInTransitOrderState{
    
    public InTransitOrderStateProxi(long objectId) {
        super(objectId);
    }
    public InTransitOrderStateProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 336;
    }
    
    public long getTicksLeft() throws PersistenceException {
        return ((PersistentInTransitOrderState)this.getTheObject()).getTicksLeft();
    }
    public void setTicksLeft(long newValue) throws PersistenceException {
        ((PersistentInTransitOrderState)this.getTheObject()).setTicksLeft(newValue);
    }
    public PersistentInTransitOrderState getThis() throws PersistenceException {
        return ((PersistentInTransitOrderState)this.getTheObject()).getThis();
    }
    
    public void accept(OrderStateVisitor visitor) throws PersistenceException {
        visitor.handleInTransitOrderState(this);
    }
    public <R> R accept(OrderStateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleInTransitOrderState(this);
    }
    public <E extends model.UserException>  void accept(OrderStateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleInTransitOrderState(this);
    }
    public <R, E extends model.UserException> R accept(OrderStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleInTransitOrderState(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleInTransitOrderState(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleInTransitOrderState(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleInTransitOrderState(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleInTransitOrderState(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleInTransitOrderState(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleInTransitOrderState(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleInTransitOrderState(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleInTransitOrderState(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentInTransitOrderState)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentInTransitOrderState)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentInTransitOrderState)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentInTransitOrderState)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentInTransitOrderState)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentInTransitOrderState)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentInTransitOrderState)this.getTheObject()).initializeOnInstantiation();
    }

    
}
