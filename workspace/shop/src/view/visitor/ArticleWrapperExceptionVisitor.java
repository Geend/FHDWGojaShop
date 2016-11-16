
package view.visitor;

import view.*;

public interface ArticleWrapperExceptionVisitor<E extends view.UserException> {
    
    public void handleCustomerShopArticleWrapper(CustomerShopArticleWrapperView customerShopArticleWrapper) throws ModelException, E;
    public void handleOrderArticleWrapper(OrderArticleWrapperView orderArticleWrapper) throws ModelException, E;
    public void handleOwnerArticleWrapper(OwnerArticleWrapperView ownerArticleWrapper) throws ModelException, E;
    public void handleShopArticleWrapper(ShopArticleWrapperView shopArticleWrapper) throws ModelException, E;
    public void handleShoppingCartArticleWrapper(ShoppingCartArticleWrapperView shoppingCartArticleWrapper) throws ModelException, E;
    public void handleStandardArticleWrapper(StandardArticleWrapperView standardArticleWrapper) throws ModelException, E;
    
}
