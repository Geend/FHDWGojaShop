
package view.visitor;

import view.*;

public interface ArticleOrderExceptionReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleArticleNotInSaleException(ArticleNotInSaleException articleNotInSaleException) throws ModelException, E;
    public R handleNotEnoughStockException(NotEnoughStockException notEnoughStockException) throws ModelException, E;
    
}
