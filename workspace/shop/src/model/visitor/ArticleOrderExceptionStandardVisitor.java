
package model.visitor;

import persistence.*;

public abstract class ArticleOrderExceptionStandardVisitor implements ArticleOrderExceptionVisitor {
    
    public void handleArticleNotInSaleException(model.ArticleNotInSaleException articleNotInSaleException) throws PersistenceException{
        this.standardHandling(articleNotInSaleException);
    }
    public void handleNotEnoughStockException(model.NotEnoughStockException notEnoughStockException) throws PersistenceException{
        this.standardHandling(notEnoughStockException);
    }
    protected abstract void standardHandling(model.ArticleOrderException articleOrderException) throws PersistenceException;
}
