
package model.visitor;

import persistence.*;

public interface ArticleOrderExceptionReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleArticleNotInSaleException(model.ArticleNotInSaleException articleNotInSaleException) throws PersistenceException, E;
    public R handleNotEnoughStockException(model.NotEnoughStockException notEnoughStockException) throws PersistenceException, E;
    
}
