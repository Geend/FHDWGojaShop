package persistence;


import model.visitor.*;

public interface Component4Public extends Anything, CompHierarchyHIERARCHY, SubjInterface, AbstractPersistentProxi {
    
    
    public void accept(ComponentVisitor visitor) throws PersistenceException;
    public <R> R accept(ComponentReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ComponentExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ComponentReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void moveTo(final ComponentContainer container) 
				throws model.CycleException, PersistenceException;
    public void moveTo(final ComponentContainer container, final Invoker invoker) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;
    public void moveToImplementation(final ComponentContainer container) 
				throws model.CycleException, PersistenceException;

}

