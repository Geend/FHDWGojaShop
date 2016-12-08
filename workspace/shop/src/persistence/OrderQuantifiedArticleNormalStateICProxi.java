package persistence;



import model.visitor.*;

public class OrderQuantifiedArticleNormalStateICProxi extends OrderQuantifiedArticleStateICProxi implements PersistentOrderQuantifiedArticleNormalState{
    
    public OrderQuantifiedArticleNormalStateICProxi(long objectId) {
        super(objectId);
    }
    public OrderQuantifiedArticleNormalStateICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticleNormalStateFacade
            .getOrderQuantifiedArticleNormalState(this.getId());
    }
    
    public long getClassId() {
        return 356;
    }
    
    public PersistentOrderQuantifiedArticleNormalState getThis() throws PersistenceException {
        return ((PersistentOrderQuantifiedArticleNormalState)this.getTheObject()).getThis();
    }
    
    public void accept(OrderQuantifiedArticleStateVisitor visitor) throws PersistenceException {
        visitor.handleOrderQuantifiedArticleNormalState(this);
    }
    public <R> R accept(OrderQuantifiedArticleStateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderQuantifiedArticleNormalState(this);
    }
    public <E extends model.UserException>  void accept(OrderQuantifiedArticleStateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderQuantifiedArticleNormalState(this);
    }
    public <R, E extends model.UserException> R accept(OrderQuantifiedArticleStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderQuantifiedArticleNormalState(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOrderQuantifiedArticleNormalState(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderQuantifiedArticleNormalState(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderQuantifiedArticleNormalState(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderQuantifiedArticleNormalState(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOrderQuantifiedArticleNormalState(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderQuantifiedArticleNormalState(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderQuantifiedArticleNormalState(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderQuantifiedArticleNormalState(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticleNormalState)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticleNormalState)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticleNormalState)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticleNormalState)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticleNormalState)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticleNormalState)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticleNormalState)this.getTheObject()).initializeOnInstantiation();
    }

    
}
