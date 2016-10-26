
package model.visitor;

import persistence.*;

public interface ArticleWrapperExceptionVisitor<E extends model.UserException> {
    
    public void handleOrderArticleWrapper(PersistentOrderArticleWrapper orderArticleWrapper) throws PersistenceException, E;
    public void handleShopArticleWrapper(PersistentShopArticleWrapper shopArticleWrapper) throws PersistenceException, E;
    public void handleShoppingCartArticleWrapper(PersistentShoppingCartArticleWrapper shoppingCartArticleWrapper) throws PersistenceException, E;
    
}
