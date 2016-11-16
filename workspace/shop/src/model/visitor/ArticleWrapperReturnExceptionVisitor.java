
package model.visitor;

import persistence.*;

public interface ArticleWrapperReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleCustomerShopArticleWrapper(CustomerShopArticleWrapper4Public customerShopArticleWrapper) throws PersistenceException, E;
    public R handleOrderArticleWrapper(OrderArticleWrapper4Public orderArticleWrapper) throws PersistenceException, E;
    public R handleOwnerArticleWrapper(OwnerArticleWrapper4Public ownerArticleWrapper) throws PersistenceException, E;
    public R handleShopArticleWrapper(ShopArticleWrapper4Public shopArticleWrapper) throws PersistenceException, E;
    public R handleShoppingCartArticleWrapper(ShoppingCartArticleWrapper4Public shoppingCartArticleWrapper) throws PersistenceException, E;
    public R handleStandardArticleWrapper(StandardArticleWrapper4Public standardArticleWrapper) throws PersistenceException, E;
    
}
