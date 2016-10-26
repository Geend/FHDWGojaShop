package persistence;



public abstract class ArticleStateProxi extends PersistentProxi implements PersistentArticleState{
    
    public ArticleStateProxi(long objectId) {
        super(objectId);
    }
    public ArticleStateProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public abstract PersistentArticleState getThis() throws PersistenceException ;
    
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentArticleState)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentArticleState)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentArticleState)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentArticleState)this.getTheObject()).initializeOnInstantiation();
    }

    
}
