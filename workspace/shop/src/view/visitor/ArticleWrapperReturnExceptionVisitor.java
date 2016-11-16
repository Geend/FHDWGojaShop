
package view.visitor;

import view.*;

public interface ArticleWrapperReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleCustomerShopArticleWrapper(CustomerShopArticleWrapperView customerShopArticleWrapper) throws ModelException, E;
    public R handleOrderArticleWrapper(OrderArticleWrapperView orderArticleWrapper) throws ModelException, E;
    public R handleOwnerArticleWrapper(OwnerArticleWrapperView ownerArticleWrapper) throws ModelException, E;
    public R handleShopArticleWrapper(ShopArticleWrapperView shopArticleWrapper) throws ModelException, E;
    public R handleShoppingCartArticleWrapper(ShoppingCartArticleWrapperView shoppingCartArticleWrapper) throws ModelException, E;
    public R handleStandardArticleWrapper(StandardArticleWrapperView standardArticleWrapper) throws ModelException, E;
    
}
