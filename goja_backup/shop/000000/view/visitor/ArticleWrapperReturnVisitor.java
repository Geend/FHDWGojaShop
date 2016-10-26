
package view.visitor;

import view.*;

public interface ArticleWrapperReturnVisitor<R> {
    
    public R handleOrderArticleWrapper(OrderArticleWrapperView orderArticleWrapper) throws ModelException;
    public R handleShopArticleWrapper(ShopArticleWrapperView shopArticleWrapper) throws ModelException;
    public R handleShoppingCartArticleWrapper(ShoppingCartArticleWrapperView shoppingCartArticleWrapper) throws ModelException;
    
}
