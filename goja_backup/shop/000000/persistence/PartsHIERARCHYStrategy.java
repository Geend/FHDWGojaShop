package persistence;


/* Additional import section end */

public interface PartsHIERARCHYStrategy<T> {
    
    
    public T Article$$finalize(final PersistentArticle ths) 
				throws PersistenceException;
    public T ProductGroup$$components$$$initialize(final PersistentProductGroup ths) 
				throws PersistenceException;
    public T ProductGroup$$components$$consolidate(final PersistentProductGroup ths, final T result, final T current) 
				throws PersistenceException;
    public T ProductGroup$$finalize(final PersistentProductGroup ths, final T components) 
				throws PersistenceException;

    
}

