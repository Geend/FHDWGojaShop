package persistence;



public abstract class ArticleWrapperICProxi extends PersistentInCacheProxiOptimistic implements PersistentArticleWrapper{
    
    public ArticleWrapperICProxi(long objectId) {
        super(objectId);
    }
    public ArticleWrapperICProxi(PersistentObject object) {
        super(object);
    }
    
    
    public PersistentArticle getArticle() throws PersistenceException {
        return ((PersistentArticleWrapper)this.getTheObject()).getArticle();
    }
    public void setArticle(PersistentArticle newValue) throws PersistenceException {
        ((PersistentArticleWrapper)this.getTheObject()).setArticle(newValue);
    }
    public abstract PersistentArticleWrapper getThis() throws PersistenceException ;
    
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public String getName() 
				throws PersistenceException{
        return ((PersistentArticleWrapper)this.getTheObject()).getName();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).initializeOnInstantiation();
    }

    
}