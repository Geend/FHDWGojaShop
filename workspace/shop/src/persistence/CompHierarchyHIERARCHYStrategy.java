package persistence;


/* Additional import section end */

public interface CompHierarchyHIERARCHYStrategy<T> {
    
    
    public T ArticleWrapper$$finalize(final ArticleWrapper4Public ths) 
				throws PersistenceException;
    public T ComponentManager$$components$$$initialize(final ComponentManager4Public ths) 
				throws PersistenceException;
    public T ComponentManager$$components$$consolidate(final ComponentManager4Public ths, final T result, final T current) 
				throws PersistenceException;
    public T ComponentManager$$finalize(final ComponentManager4Public ths, final T components) 
				throws PersistenceException;
    public T ProductGroup$$components$$$initialize(final ProductGroup4Public ths) 
				throws PersistenceException;
    public T ProductGroup$$components$$consolidate(final ProductGroup4Public ths, final T result, final T current) 
				throws PersistenceException;
    public T ProductGroup$$finalize(final ProductGroup4Public ths, final T components) 
				throws PersistenceException;

    
}

