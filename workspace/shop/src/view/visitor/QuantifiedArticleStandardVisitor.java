
package view.visitor;

import view.*;

public abstract class QuantifiedArticleStandardVisitor implements QuantifiedArticleVisitor {
    
    public void handleOrderQuantifiedArticle(OrderQuantifiedArticleView orderQuantifiedArticle) throws ModelException{
        this.standardHandling(orderQuantifiedArticle);
    }
    public void handleReOrderQuantifiedArticle(ReOrderQuantifiedArticleView reOrderQuantifiedArticle) throws ModelException{
        this.standardHandling(reOrderQuantifiedArticle);
    }
    public void handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticleView shoppingCartQuantifiedArticle) throws ModelException{
        this.standardHandling(shoppingCartQuantifiedArticle);
    }
    public void handleReturnQuantifiedArticle(ReturnQuantifiedArticleView returnQuantifiedArticle) throws ModelException{
        this.standardHandling(returnQuantifiedArticle);
    }
    protected abstract void standardHandling(QuantifiedArticleView quantifiedArticle) throws ModelException;
}
