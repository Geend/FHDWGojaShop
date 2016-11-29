package persistence;


import model.visitor.*;

public interface OrderState4Public extends Anything, SubjInterface, AbstractPersistentProxi {
    
    
    public void accept(OrderStateVisitor visitor) throws PersistenceException;
    public <R> R accept(OrderStateReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(OrderStateExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(OrderStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;

}

