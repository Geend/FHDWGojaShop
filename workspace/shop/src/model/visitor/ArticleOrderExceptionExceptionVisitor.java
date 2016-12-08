
package model.visitor;

import persistence.*;

public interface ArticleOrderExceptionExceptionVisitor<E extends model.UserException> {
    
    public void handleArticleNotInSaleException(model.ArticleNotInSaleException articleNotInSaleException) throws PersistenceException, E;
    public void handleNotEnoughStockException(model.NotEnoughStockException notEnoughStockException) throws PersistenceException, E;
    
}
