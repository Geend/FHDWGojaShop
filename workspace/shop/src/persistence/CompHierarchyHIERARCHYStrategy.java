package persistence;


/* Additional import section end */

public interface CompHierarchyHIERARCHYStrategy<T> {
    
    
    public T ArticleWrapper$$finalize(final ArticleWrapper4Public ths) 
				throws PersistenceException;
    public T ComponentContainerImplementation$$finalize(final ComponentContainerImplementation4Public ths, final T components) 
				throws PersistenceException;
    public T ComponentContainerImplementationComponents$$finalize(final ComponentContainerImplementationComponents4Public ths, final T observee) 
				throws PersistenceException;
    public T ComponentContainerImplementationComponents$$observee$$$initialize(final ComponentContainerImplementationComponents4Public ths) 
				throws PersistenceException;
    public T ComponentContainerImplementationComponents$$observee$$consolidate(final ComponentContainerImplementationComponents4Public ths, final T result, final T current) 
				throws PersistenceException;
    public T ProductGroup$$finalize(final ProductGroup4Public ths, final T components) 
				throws PersistenceException;
    public T ProductGroupComponents$$finalize(final ProductGroupComponents4Public ths, final T observee) 
				throws PersistenceException;
    public T ProductGroupComponents$$observee$$$initialize(final ProductGroupComponents4Public ths) 
				throws PersistenceException;
    public T ProductGroupComponents$$observee$$consolidate(final ProductGroupComponents4Public ths, final T result, final T current) 
				throws PersistenceException;

    
}

