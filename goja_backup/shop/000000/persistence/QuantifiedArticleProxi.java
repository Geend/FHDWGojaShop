package persistence;



public abstract class QuantifiedArticleProxi extends PersistentProxi implements PersistentQuantifiedArticle{
    
    public QuantifiedArticleProxi(long objectId) {
        super(objectId);
    }
    public QuantifiedArticleProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getQuantity() throws PersistenceException {
        return ((PersistentQuantifiedArticle)this.getTheObject()).getQuantity();
    }
    public void setQuantity(long newValue) throws PersistenceException {
        ((PersistentQuantifiedArticle)this.getTheObject()).setQuantity(newValue);
    }
    public abstract PersistentQuantifiedArticle getThis() throws PersistenceException ;
    
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentQuantifiedArticle)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentQuantifiedArticle)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentQuantifiedArticle)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentQuantifiedArticle)this.getTheObject()).initializeOnInstantiation();
    }

    
}
