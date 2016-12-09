package persistence;



import model.visitor.*;

public class OrderQuantifiedArticlePreOrderICProxi extends OrderQuantifiedArticleStateICProxi implements PersistentOrderQuantifiedArticlePreOrder{
    
    public OrderQuantifiedArticlePreOrderICProxi(long objectId) {
        super(objectId);
    }
    public OrderQuantifiedArticlePreOrderICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theOrderQuantifiedArticlePreOrderFacade
            .getOrderQuantifiedArticlePreOrder(this.getId());
    }
    
    public long getClassId() {
        return 451;
    }
    
    public long getLeftQuantity() throws PersistenceException {
        return ((PersistentOrderQuantifiedArticlePreOrder)this.getTheObject()).getLeftQuantity();
    }
    public void setLeftQuantity(long newValue) throws PersistenceException {
        ((PersistentOrderQuantifiedArticlePreOrder)this.getTheObject()).setLeftQuantity(newValue);
    }
    public PersistentOrderQuantifiedArticlePreOrder getThis() throws PersistenceException {
        return ((PersistentOrderQuantifiedArticlePreOrder)this.getTheObject()).getThis();
    }
    
    public void accept(OrderQuantifiedArticleStateVisitor visitor) throws PersistenceException {
        visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <R> R accept(OrderQuantifiedArticleStateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <E extends model.UserException>  void accept(OrderQuantifiedArticleStateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <R, E extends model.UserException> R accept(OrderQuantifiedArticleStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderQuantifiedArticlePreOrder(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticlePreOrder)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticlePreOrder)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticlePreOrder)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticlePreOrder)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticlePreOrder)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticlePreOrder)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentOrderQuantifiedArticlePreOrder)this.getTheObject()).initializeOnInstantiation();
    }

    
}
