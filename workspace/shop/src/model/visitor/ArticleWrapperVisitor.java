
package model.visitor;

import persistence.*;

public interface ArticleWrapperVisitor {
    
    public void handleOrderArticleWrapper(PersistentOrderArticleWrapper orderArticleWrapper) throws PersistenceException;
    public void handleShopArticleWrapper(PersistentShopArticleWrapper shopArticleWrapper) throws PersistenceException;
    public void handleShoppingCartArticleWrapper(PersistentShoppingCartArticleWrapper shoppingCartArticleWrapper) throws PersistenceException;
    
}
