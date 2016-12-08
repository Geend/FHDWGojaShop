package persistence;


import model.visitor.*;

public interface OrderStatus4Public extends Anything, SubjInterface, AbstractPersistentProxi {
    
    
    public void accept(OrderStatusVisitor visitor) throws PersistenceException;
    public <R> R accept(OrderStatusReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(OrderStatusExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(OrderStatusReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;

}

