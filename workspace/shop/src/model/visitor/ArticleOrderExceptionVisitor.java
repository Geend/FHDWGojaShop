
package model.visitor;

import persistence.*;

public interface ArticleOrderExceptionVisitor {
    
    public void handleArticleNotInSaleException(model.ArticleNotInSaleException articleNotInSaleException) throws PersistenceException;
    public void handleNotEnoughStockException(model.NotEnoughStockException notEnoughStockException) throws PersistenceException;
    
}
