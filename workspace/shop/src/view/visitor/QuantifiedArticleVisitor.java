
package view.visitor;

import view.*;

public interface QuantifiedArticleVisitor {
    
    public void handleOrderQuantifiedArticle(OrderQuantifiedArticleView orderQuantifiedArticle) throws ModelException;
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticleView shoppingCartQuantifiedArticle) throws ModelException;
    
}
