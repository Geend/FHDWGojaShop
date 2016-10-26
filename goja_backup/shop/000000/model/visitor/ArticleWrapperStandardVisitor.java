
package model.visitor;

import persistence.*;

public abstract class ArticleWrapperStandardVisitor implements ArticleWrapperVisitor {
    
    public void handleOrderArticleWrapper(PersistentOrderArticleWrapper orderArticleWrapper) throws PersistenceException{
        this.standardHandling(orderArticleWrapper);
    }
    public void handleShopArticleWrapper(PersistentShopArticleWrapper shopArticleWrapper) throws PersistenceException{
        this.standardHandling(shopArticleWrapper);
    }
    public void handleShoppingCartArticleWrapper(PersistentShoppingCartArticleWrapper shoppingCartArticleWrapper) throws PersistenceException{
        this.standardHandling(shoppingCartArticleWrapper);
    }
    protected abstract void standardHandling(PersistentArticleWrapper articleWrapper) throws PersistenceException;
}
