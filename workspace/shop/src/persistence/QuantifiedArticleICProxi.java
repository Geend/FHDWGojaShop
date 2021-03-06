package persistence;



public abstract class QuantifiedArticleICProxi extends PersistentInCacheProxiOptimistic implements PersistentQuantifiedArticle{
    
    public QuantifiedArticleICProxi(long objectId) {
        super(objectId);
    }
    public QuantifiedArticleICProxi(PersistentObject object) {
        super(object);
    }
    
    
    public long getQuantity() throws PersistenceException {
        return ((PersistentQuantifiedArticle)this.getTheObject()).getQuantity();
    }
    public void setQuantity(long newValue) throws PersistenceException {
        ((PersistentQuantifiedArticle)this.getTheObject()).setQuantity(newValue);
    }
    public ArticleWrapper4Public getArticle() throws PersistenceException {
        return ((PersistentQuantifiedArticle)this.getTheObject()).getArticle();
    }
    public void setArticle(ArticleWrapper4Public newValue) throws PersistenceException {
        ((PersistentQuantifiedArticle)this.getTheObject()).setArticle(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentQuantifiedArticle)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentQuantifiedArticle)this.getTheObject()).setSubService(newValue);
    }
    public abstract PersistentQuantifiedArticle getThis() throws PersistenceException ;
    
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentQuantifiedArticle)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentQuantifiedArticle)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentQuantifiedArticle)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentQuantifiedArticle)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentQuantifiedArticle)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void increaseQuantity(final long amount) 
				throws PersistenceException{
        ((PersistentQuantifiedArticle)this.getTheObject()).increaseQuantity(amount);
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
