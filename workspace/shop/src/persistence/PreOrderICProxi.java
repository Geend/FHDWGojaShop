package persistence;



import model.visitor.*;

public class PreOrderICProxi extends AbstractOrderICProxi implements PersistentPreOrder{
    
    public PreOrderICProxi(long objectId) {
        super(objectId);
    }
    public PreOrderICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().thePreOrderFacade
            .getPreOrder(this.getId());
    }
    
    public long getClassId() {
        return 149;
    }
    
    public PersistentPreOrder getThis() throws PersistenceException {
        return ((PersistentPreOrder)this.getTheObject()).getThis();
    }
    
    public void accept(AbstractOrderVisitor visitor) throws PersistenceException {
        visitor.handlePreOrder(this);
    }
    public <R> R accept(AbstractOrderReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreOrder(this);
    }
    public <E extends model.UserException>  void accept(AbstractOrderExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreOrder(this);
    }
    public <R, E extends model.UserException> R accept(AbstractOrderReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreOrder(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handlePreOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreOrder(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreOrder(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreOrder(this);
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentPreOrder)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentPreOrder)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentPreOrder)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentPreOrder)this.getTheObject()).initializeOnInstantiation();
    }

    
}
