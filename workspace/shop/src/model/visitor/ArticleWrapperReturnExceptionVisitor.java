
package model.visitor;

import persistence.*;

public interface ArticleWrapperReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleOrderArticleWrapper(PersistentOrderArticleWrapper orderArticleWrapper) throws PersistenceException, E;
    public R handleShopArticleWrapper(PersistentShopArticleWrapper shopArticleWrapper) throws PersistenceException, E;
    public R handleShoppingCartArticleWrapper(PersistentShoppingCartArticleWrapper shoppingCartArticleWrapper) throws PersistenceException, E;
    
}
