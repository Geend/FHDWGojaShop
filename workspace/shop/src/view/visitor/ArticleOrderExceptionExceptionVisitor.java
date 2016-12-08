
package view.visitor;

import view.*;

public interface ArticleOrderExceptionExceptionVisitor<E extends view.UserException> {
    
    public void handleArticleNotInSaleException(ArticleNotInSaleException articleNotInSaleException) throws ModelException, E;
    public void handleNotEnoughStockException(NotEnoughStockException notEnoughStockException) throws ModelException, E;
    
}
