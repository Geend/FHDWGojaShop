
package view.visitor;

import view.*;

public interface ArticleStateVisitor {
    
    public void handleInSale(InSaleView inSale) throws ModelException;
    public void handleNewCreated(NewCreatedView newCreated) throws ModelException;
    public void handleNotInSale(NotInSaleView notInSale) throws ModelException;
    public void handleRemainingStock(RemainingStockView remainingStock) throws ModelException;
    
}
