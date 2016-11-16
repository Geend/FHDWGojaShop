package persistence;


/* Additional import section end */

public interface CompHierarchyHIERARCHYStrategy<T> {
    
    
    public T Article$$finalize(final Article4Public ths) 
				throws PersistenceException;
    public T CustomerShopArticleWrapper$$finalize(final CustomerShopArticleWrapper4Public ths, final T component) 
				throws PersistenceException;
    public T DefaultProductGroupWrapper$$finalize(final DefaultProductGroupWrapper4Public ths, final T component) 
				throws PersistenceException;
    public T OrderArticleWrapper$$finalize(final OrderArticleWrapper4Public ths, final T component) 
				throws PersistenceException;
    public T OwnerArticleWrapper$$finalize(final OwnerArticleWrapper4Public ths, final T component) 
				throws PersistenceException;
    public T ProductGroupComponents$$finalize(final ProductGroupComponents4Public ths, final T observee) 
				throws PersistenceException;
    public T ProductGroupComponents$$observee$$$initialize(final ProductGroupComponents4Public ths) 
				throws PersistenceException;
    public T ProductGroupComponents$$observee$$consolidate(final ProductGroupComponents4Public ths, final T result, final T current) 
				throws PersistenceException;
    public T RootProductGroup$$finalize(final RootProductGroup4Public ths, final T components) 
				throws PersistenceException;
    public T ShopArticleWrapper$$finalize(final ShopArticleWrapper4Public ths, final T component) 
				throws PersistenceException;
    public T ShoppingCartArticleWrapper$$finalize(final ShoppingCartArticleWrapper4Public ths, final T component) 
				throws PersistenceException;
    public T StandardArticleWrapper$$finalize(final StandardArticleWrapper4Public ths, final T component) 
				throws PersistenceException;
    public T SubProductGroup$$finalize(final SubProductGroup4Public ths, final T components) 
				throws PersistenceException;

    
}

