package persistence;



import model.visitor.*;

public class OrderQuantifiedArticleMarkedForReturnStateICProxi extends OrderQuantifiedArticleStateICProxi implements PersistentOrderQuantifiedArticleMarkedForReturnState{
    
    public OrderQuantifiedArticleMarkedForReturnStateICProxi(long objectId) {
        super(objectId);
    }
    public OrderQuantifiedArticleMarkedForReturnStateICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticleMarkedForReturnStateFacade
            .getOrderQuantifiedArticleMarkedForReturnState(this.getId());
    }
    
    public long getClassId() {
        return 355;
    }
    
    public PersistentOrderQuantifiedArticleMarkedForReturnState getThis() throws PersistenceException {
        return ((PersistentOrderQuantifiedArticleMarkedForReturnState)this.getTheObject()).getThis();
    }
    
    public void accept(OrderQuantifiedArticleStateVisitor visitor) throws PersistenceException {
        visitor.handleOrderQuantifiedArticleMarkedForReturnState(this);
    }
    public <R> R accept(OrderQuantifiedArticleStateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderQuantifiedArticleMarkedForReturnState(this);
    }
    public <E extends model.UserException>  void accept(OrderQuantifiedArticleStateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderQuantifiedArticleMarkedForReturnState(this);
    }
    public <R, E extends model.UserException> R accept(OrderQuantifiedArticleStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderQuantifiedArticleMarkedForReturnState(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOrderQuantifiedArticleMarkedForReturnState(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderQuantifiedArticleMarkedForReturnState(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderQuantifiedArticleMarkedForReturnState(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderQuantifiedArticleMarkedForReturnState(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOrderQuantifiedArticleMarkedForReturnState(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderQuantifiedArticleMarkedForReturnState(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderQuantifiedArticleMarkedForReturnState(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderQuantifiedArticleMarkedForReturnState(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticleMarkedForReturnState)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticleMarkedForReturnState)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticleMarkedForReturnState)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticleMarkedForReturnState)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticleMarkedForReturnState)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticleMarkedForReturnState)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticleMarkedForReturnState)this.getTheObject()).initializeOnInstantiation();
    }

    
}
