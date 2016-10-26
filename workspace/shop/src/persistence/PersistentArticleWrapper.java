package persistence;


public interface PersistentArticleWrapper extends Anything, AbstractPersistentProxi, ArticleWrapper4Public {
    
    public PersistentArticle getArticle() throws PersistenceException ;
    public void setArticle(PersistentArticle newValue) throws PersistenceException ;
    public abstract PersistentArticleWrapper getThis() throws PersistenceException ;
    
    

}

