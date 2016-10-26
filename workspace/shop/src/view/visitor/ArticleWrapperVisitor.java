
package view.visitor;

import view.*;

public interface ArticleWrapperVisitor {
    
    public void handleOrderArticleWrapper(OrderArticleWrapperView orderArticleWrapper) throws ModelException;
    public void handleShopArticleWrapper(ShopArticleWrapperView shopArticleWrapper) throws ModelException;
    public void handleShoppingCartArticleWrapper(ShoppingCartArticleWrapperView shoppingCartArticleWrapper) throws ModelException;
    
}
