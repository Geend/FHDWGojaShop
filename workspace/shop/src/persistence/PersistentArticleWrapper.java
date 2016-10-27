package persistence;


import model.visitor.*;

public interface PersistentArticleWrapper extends Anything, SubjInterface, AbstractPersistentProxi {
    
    public PersistentArticle getArticle() throws PersistenceException ;
    public void setArticle(PersistentArticle newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public abstract PersistentArticleWrapper getThis() throws PersistenceException ;
    
    public void accept(ArticleWrapperVisitor visitor) throws PersistenceException;
    public <R> R accept(ArticleWrapperReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ArticleWrapperExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ArticleWrapperReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public String getName() 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;

}

