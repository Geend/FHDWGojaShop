
package model.visitor;

import persistence.*;

public interface ArticleWrapperExceptionVisitor<E extends model.UserException> {
    
    public void handleCustomerShopArticleWrapper(CustomerShopArticleWrapper4Public customerShopArticleWrapper) throws PersistenceException, E;
    public void handleOrderArticleWrapper(OrderArticleWrapper4Public orderArticleWrapper) throws PersistenceException, E;
    public void handleOwnerArticleWrapper(OwnerArticleWrapper4Public ownerArticleWrapper) throws PersistenceException, E;
    public void handleShopArticleWrapper(ShopArticleWrapper4Public shopArticleWrapper) throws PersistenceException, E;
    public void handleShoppingCartArticleWrapper(ShoppingCartArticleWrapper4Public shoppingCartArticleWrapper) throws PersistenceException, E;
    public void handleStandardArticleWrapper(StandardArticleWrapper4Public standardArticleWrapper) throws PersistenceException, E;
    
}
