
package view.visitor;

import view.*;

public abstract class ArticleWrapperStandardVisitor implements ArticleWrapperVisitor {
    
    public void handleOrderArticleWrapper(OrderArticleWrapperView orderArticleWrapper) throws ModelException{
        this.standardHandling(orderArticleWrapper);
    }
    public void handleStandardArticleWrapper(StandardArticleWrapperView standardArticleWrapper) throws ModelException{
        this.standardHandling(standardArticleWrapper);
    }
    public void handleCustomerShopArticleWrapper(CustomerShopArticleWrapperView customerShopArticleWrapper) throws ModelException{
        this.standardHandling(customerShopArticleWrapper);
    }
    public void handleOwnerArticleWrapper(OwnerArticleWrapperView ownerArticleWrapper) throws ModelException{
        this.standardHandling(ownerArticleWrapper);
    }
    public void handleShopArticleWrapper(ShopArticleWrapperView shopArticleWrapper) throws ModelException{
        this.standardHandling(shopArticleWrapper);
    }
    public void handleShoppingCartArticleWrapper(ShoppingCartArticleWrapperView shoppingCartArticleWrapper) throws ModelException{
        this.standardHandling(shoppingCartArticleWrapper);
    }
    protected abstract void standardHandling(ArticleWrapperView articleWrapper) throws ModelException;
}
