package persistence;


import model.visitor.*;

public interface ComponentWrapper4Public extends Anything, CompHierarchyHIERARCHY, SubjInterface, AbstractPersistentProxi {
    
    public Component4Public getComponent() throws PersistenceException ;
    
    public void accept(ComponentWrapperVisitor visitor) throws PersistenceException;
    public <R> R accept(ComponentWrapperReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ComponentWrapperExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ComponentWrapperReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;

}

