package persistence;


import model.visitor.*;

public interface ProductGroupWrapper4Public extends ComponentWrapper4Public {
    
    
    public void accept(ProductGroupWrapperVisitor visitor) throws PersistenceException;
    public <R> R accept(ProductGroupWrapperReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ProductGroupWrapperExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ProductGroupWrapperReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;

}

