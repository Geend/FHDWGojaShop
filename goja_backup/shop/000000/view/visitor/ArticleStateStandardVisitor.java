
package view.visitor;

import view.*;

public abstract class ArticleStateStandardVisitor implements ArticleStateVisitor {
    
    public void handleRemainingStock(RemainingStockView remainingStock) throws ModelException{
        this.standardHandling(remainingStock);
    }
    public void handleNotInSale(NotInSaleView notInSale) throws ModelException{
        this.standardHandling(notInSale);
    }
    public void handleInSale(InSaleView inSale) throws ModelException{
        this.standardHandling(inSale);
    }
    public void handleNewCreated(NewCreatedView newCreated) throws ModelException{
        this.standardHandling(newCreated);
    }
    protected abstract void standardHandling(ArticleStateView articleState) throws ModelException;
}
