package persistence;



public abstract class ArticleWrapperProxi extends PersistentProxi implements PersistentArticleWrapper{
    
    public ArticleWrapperProxi(long objectId) {
        super(objectId);
    }
    public ArticleWrapperProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public PersistentArticle getArticle() throws PersistenceException {
        return ((PersistentArticleWrapper)this.getTheObject()).getArticle();
    }
    public void setArticle(PersistentArticle newValue) throws PersistenceException {
        ((PersistentArticleWrapper)this.getTheObject()).setArticle(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentArticleWrapper)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentArticleWrapper)this.getTheObject()).setSubService(newValue);
    }
    public abstract PersistentArticleWrapper getThis() throws PersistenceException ;
    
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).updateObservers(event);
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
