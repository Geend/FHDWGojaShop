package persistence;


/* Additional import section end */

public interface CompHierarchyHIERARCHYStrategy<T> {
    
    
    public T Article$$finalize(final Article4Public ths) 
				throws PersistenceException;
    public T ArticleWrapper$$finalize(final ArticleWrapper4Public ths) 
				throws PersistenceException;
    public T ProductGroupComponents$$finalize(final ProductGroupComponents4Public ths, final T observee) 
				throws PersistenceException;
    public T ProductGroupComponents$$observee$$$initialize(final ProductGroupComponents4Public ths) 
				throws PersistenceException;
    public T ProductGroupComponents$$observee$$consolidate(final ProductGroupComponents4Public ths, final T result, final T current) 
				throws PersistenceException;
    public T RootProductGroup$$finalize(final RootProductGroup4Public ths, final T components) 
				throws PersistenceException;
    public T SubProductGroup$$finalize(final SubProductGroup4Public ths, final T components) 
				throws PersistenceException;

    
}

