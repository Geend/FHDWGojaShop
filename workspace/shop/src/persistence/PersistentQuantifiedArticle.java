package persistence;


import model.visitor.*;

public interface PersistentQuantifiedArticle extends Anything, SubjInterface, AbstractPersistentProxi {
    
    public long getQuantity() throws PersistenceException ;
    public void setQuantity(long newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public abstract PersistentQuantifiedArticle getThis() throws PersistenceException ;
    
    public void accept(QuantifiedArticleVisitor visitor) throws PersistenceException;
    public <R> R accept(QuantifiedArticleReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(QuantifiedArticleExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(QuantifiedArticleReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;

}

