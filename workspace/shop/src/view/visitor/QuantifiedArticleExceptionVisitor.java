
package view.visitor;

import view.*;

public interface QuantifiedArticleExceptionVisitor<E extends view.UserException> {
    
    public void handleOrderQuantifiedArticle(OrderQuantifiedArticleView orderQuantifiedArticle) throws ModelException, E;
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticleView shoppingCartQuantifiedArticle) throws ModelException, E;
    
}
