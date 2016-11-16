
package model.visitor;

import persistence.*;

public interface QuantifiedArticleReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleOrderQuantifiedArticle(OrderQuantifiedArticle4Public orderQuantifiedArticle) throws PersistenceException, E;
    public R handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticle4Public shoppingCartQuantifiedArticle) throws PersistenceException, E;
    
}
