
package model.visitor;

import persistence.*;

public interface ArticleWrapperReturnVisitor<R> {
    
    public R handleCustomerShopArticleWrapper(CustomerShopArticleWrapper4Public customerShopArticleWrapper) throws PersistenceException;
    public R handleOrderArticleWrapper(OrderArticleWrapper4Public orderArticleWrapper) throws PersistenceException;
    public R handleOwnerArticleWrapper(OwnerArticleWrapper4Public ownerArticleWrapper) throws PersistenceException;
    public R handleShopArticleWrapper(ShopArticleWrapper4Public shopArticleWrapper) throws PersistenceException;
    public R handleShoppingCartArticleWrapper(ShoppingCartArticleWrapper4Public shoppingCartArticleWrapper) throws PersistenceException;
    public R handleStandardArticleWrapper(StandardArticleWrapper4Public standardArticleWrapper) throws PersistenceException;
    
}
