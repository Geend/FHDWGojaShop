
package model.visitor;

import persistence.*;

public interface QuantifiedArticleReturnVisitor<R> {
    
    public R handleOrderQuantifiedArticle(OrderQuantifiedArticle4Public orderQuantifiedArticle) throws PersistenceException;
    public R handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticle4Public shoppingCartQuantifiedArticle) throws PersistenceException;
    
}
