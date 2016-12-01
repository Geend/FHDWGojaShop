
package view.visitor;

import view.*;

public interface QuantifiedArticleReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleOrderQuantifiedArticle(OrderQuantifiedArticleView orderQuantifiedArticle) throws ModelException, E;
    public R handleReOrderQuantifiedArticle(ReOrderQuantifiedArticleView reOrderQuantifiedArticle) throws ModelException, E;
    public R handleReturnQuantifiedArticle(ReturnQuantifiedArticleView returnQuantifiedArticle) throws ModelException, E;
    public R handleShoppingCartQuantifiedArticle(ShoppingCartQuantifiedArticleView shoppingCartQuantifiedArticle) throws ModelException, E;
    
}
