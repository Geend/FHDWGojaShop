
package view.visitor;

import view.*;

public interface ArticleOrderExceptionReturnVisitor<R> {
    
    public R handleArticleNotInSaleException(ArticleNotInSaleException articleNotInSaleException) throws ModelException;
    public R handleNotEnoughStockException(NotEnoughStockException notEnoughStockException) throws ModelException;
    
}
