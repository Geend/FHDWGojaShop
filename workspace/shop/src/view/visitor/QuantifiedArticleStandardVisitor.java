
package view.visitor;

import view.*;

public abstract class QuantifiedArticleStandardVisitor implements QuantifiedArticleVisitor {
    
    public void handleOrderQuantifiedArticle(OrderQuantifiedArticleView orderQuantifiedArticle) throws ModelException{
        this.standardHandling(orderQuantifiedArticle);
    }
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticleView shoppingCartQuantifiedArticle) throws ModelException{
        this.standardHandling(shoppingCartQuantifiedArticle);
    }
    protected abstract void standardHandling(QuantifiedArticleView quantifiedArticle) throws ModelException;
}
