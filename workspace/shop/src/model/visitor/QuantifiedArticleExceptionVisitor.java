
package model.visitor;

import persistence.*;

public interface QuantifiedArticleExceptionVisitor<E extends model.UserException> {
    
    public void handleOrderQuantifiedArticle(OrderQuantifiedArticle4Public orderQuantifiedArticle) throws PersistenceException, E;
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticle4Public shoppingCartQuantifiedArticle) throws PersistenceException, E;
    
}
