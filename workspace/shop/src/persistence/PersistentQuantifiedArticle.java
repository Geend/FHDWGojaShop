package persistence;


public interface PersistentQuantifiedArticle extends Anything, SubjInterface, AbstractPersistentProxi, QuantifiedArticle4Public {
    
    public void setQuantity(long newValue) throws PersistenceException ;
    public void setArticle(ArticleWrapper4Public newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public abstract PersistentQuantifiedArticle getThis() throws PersistenceException ;
    
    

}

