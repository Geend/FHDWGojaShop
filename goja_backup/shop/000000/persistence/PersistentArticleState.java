package persistence;


public interface PersistentArticleState extends Anything, AbstractPersistentProxi, ArticleState4Public {
    
    public abstract PersistentArticleState getThis() throws PersistenceException ;
    
    

}

