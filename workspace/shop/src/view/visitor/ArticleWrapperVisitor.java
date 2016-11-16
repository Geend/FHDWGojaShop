
package view.visitor;

import view.*;

public interface ArticleWrapperVisitor {
    
    public void handleCustomerShopArticleWrapper(CustomerShopArticleWrapperView customerShopArticleWrapper) throws ModelException;
    public void handleOrderArticleWrapper(OrderArticleWrapperView orderArticleWrapper) throws ModelException;
    public void handleOwnerArticleWrapper(OwnerArticleWrapperView ownerArticleWrapper) throws ModelException;
    public void handleShopArticleWrapper(ShopArticleWrapperView shopArticleWrapper) throws ModelException;
    public void handleShoppingCartArticleWrapper(ShoppingCartArticleWrapperView shoppingCartArticleWrapper) throws ModelException;
    public void handleStandardArticleWrapper(StandardArticleWrapperView standardArticleWrapper) throws ModelException;
    
}
