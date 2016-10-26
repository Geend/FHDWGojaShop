
package model.visitor;

import persistence.*;

public interface ArticleWrapperReturnVisitor<R> {
    
    public R handleOrderArticleWrapper(PersistentOrderArticleWrapper orderArticleWrapper) throws PersistenceException;
    public R handleShopArticleWrapper(PersistentShopArticleWrapper shopArticleWrapper) throws PersistenceException;
    public R handleShoppingCartArticleWrapper(PersistentShoppingCartArticleWrapper shoppingCartArticleWrapper) throws PersistenceException;
    
}
