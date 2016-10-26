
package view.visitor;

import view.*;

public abstract class ArticleWrapperStandardVisitor implements ArticleWrapperVisitor {
    
    public void handleOrderArticleWrapper(OrderArticleWrapperView orderArticleWrapper) throws ModelException{
        this.standardHandling(orderArticleWrapper);
    }
    public void handleShopArticleWrapper(ShopArticleWrapperView shopArticleWrapper) throws ModelException{
        this.standardHandling(shopArticleWrapper);
    }
    public void handleShoppingCartArticleWrapper(ShoppingCartArticleWrapperView shoppingCartArticleWrapper) throws ModelException{
        this.standardHandling(shoppingCartArticleWrapper);
    }
    protected abstract void standardHandling(ArticleWrapperView articleWrapper) throws ModelException;
}
