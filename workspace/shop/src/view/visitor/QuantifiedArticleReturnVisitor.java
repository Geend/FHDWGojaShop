
package view.visitor;

import view.*;

public interface QuantifiedArticleReturnVisitor<R> {
    
    public R handleOrderQuantifiedArticle(OrderQuantifiedArticleView orderQuantifiedArticle) throws ModelException;
    public R handleReOrderQuantifiedArticle(ReOrderQuantifiedArticleView reOrderQuantifiedArticle) throws ModelException;
    public R handleReturnQuantifiedArticle(ReturnQuantifiedArticleView returnQuantifiedArticle) throws ModelException;
    public R handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticleView shoppingCartQuantifiedArticle) throws ModelException;
    
}
