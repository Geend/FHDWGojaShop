package persistence;


/* Additional import section end */

public interface CompHierarchyHIERARCHYStrategy<T> {
    
    
    public T Article$$finalize(final Article4Public ths) 
				throws PersistenceException;
    public T ProductGroup$$components$$$initialize(final ProductGroup4Public ths) 
				throws PersistenceException;
    public T ProductGroup$$components$$consolidate(final ProductGroup4Public ths, final T result, final T current) 
				throws PersistenceException;
    public T ProductGroup$$finalize(final ProductGroup4Public ths, final T components) 
				throws PersistenceException;

    
}

