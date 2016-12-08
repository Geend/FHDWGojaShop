
package model.visitor;

import persistence.*;

public interface ArticleOrderExceptionReturnVisitor<R> {
    
    public R handleArticleNotInSaleException(model.ArticleNotInSaleException articleNotInSaleException) throws PersistenceException;
    public R handleNotEnoughStockException(model.NotEnoughStockException notEnoughStockException) throws PersistenceException;
    
}
