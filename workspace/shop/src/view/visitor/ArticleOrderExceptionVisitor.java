
package view.visitor;

import view.*;

public interface ArticleOrderExceptionVisitor {
    
    public void handleArticleNotInSaleException(ArticleNotInSaleException articleNotInSaleException) throws ModelException;
    public void handleNotEnoughStockException(NotEnoughStockException notEnoughStockException) throws ModelException;
    
}
