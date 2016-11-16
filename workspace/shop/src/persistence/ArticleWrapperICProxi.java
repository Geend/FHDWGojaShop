package persistence;



public abstract class ArticleWrapperICProxi extends ComponentWrapperICProxi implements PersistentArticleWrapper{
    
    public ArticleWrapperICProxi(long objectId) {
        super(objectId);
    }
    public ArticleWrapperICProxi(PersistentObject object) {
        super(object);
    }
    
    
    public abstract PersistentArticleWrapper getThis() throws PersistenceException ;
    public Article4Public getComponent() throws PersistenceException {
        return ((PersistentArticleWrapper)this.getTheObject()).getComponent();
    }
    
    
    
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
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part) 
				throws PersistenceException{
        return ((PersistentArticleWrapper)this.getTheObject()).containsCompHierarchy(part);
    }
    public boolean containsCompHierarchy(final CompHierarchyHIERARCHY part, final java.util.HashSet<CompHierarchyHIERARCHY> visited) 
				throws PersistenceException{
        return ((PersistentArticleWrapper)this.getTheObject()).containsCompHierarchy(part, visited);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentArticleWrapper)this.getTheObject()).initializeOnInstantiation();
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy) 
				throws PersistenceException{
        return ((PersistentArticleWrapper)this.getTheObject()).strategyCompHierarchy(strategy);
    }
    public <T> T strategyCompHierarchy(final CompHierarchyHIERARCHYStrategy<T> strategy, final java.util.HashMap<CompHierarchyHIERARCHY,T> visited) 
				throws PersistenceException{
        return ((PersistentArticleWrapper)this.getTheObject()).strategyCompHierarchy(strategy, visited);
    }

    
}
