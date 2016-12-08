
package view.visitor;

import view.*;

public abstract class ArticleOrderExceptionStandardVisitor implements ArticleOrderExceptionVisitor {
    
    public void handleArticleNotInSaleException(ArticleNotInSaleException articleNotInSaleException) throws ModelException{
        this.standardHandling(articleNotInSaleException);
    }
    public void handleNotEnoughStockException(NotEnoughStockException notEnoughStockException) throws ModelException{
        this.standardHandling(notEnoughStockException);
    }
    protected abstract void standardHandling(ArticleOrderException articleOrderException) throws ModelException;
}
