
package view.visitor;

import view.*;

public interface ArticleWrapperReturnVisitor<R> {
    
    public R handleCustomerShopArticleWrapper(CustomerShopArticleWrapperView customerShopArticleWrapper) throws ModelException;
    public R handleOrderArticleWrapper(OrderArticleWrapperView orderArticleWrapper) throws ModelException;
    public R handleOwnerArticleWrapper(OwnerArticleWrapperView ownerArticleWrapper) throws ModelException;
    public R handleShopArticleWrapper(ShopArticleWrapperView shopArticleWrapper) throws ModelException;
    public R handleShoppingCartArticleWrapper(ShoppingCartArticleWrapperView shoppingCartArticleWrapper) throws ModelException;
    public R handleStandardArticleWrapper(StandardArticleWrapperView standardArticleWrapper) throws ModelException;
    
}
