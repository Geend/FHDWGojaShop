package persistence;


import model.visitor.*;

public interface OrderManager4Public extends Anything, SubjInterface, AbstractPersistentProxi {
    
    
    public void accept(OrderManagerVisitor visitor) throws PersistenceException;
    public <R> R accept(OrderManagerReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(OrderManagerExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(OrderManagerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public OrderManagerOrders4Public getOrders() 
				throws PersistenceException;
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;

}

