
package view.visitor;

import view.*;

public interface ArticleStateReturnVisitor<R> {
    
    public R handleInSale(InSaleView inSale) throws ModelException;
    public R handleNewCreated(NewCreatedView newCreated) throws ModelException;
    public R handleNotInSale(NotInSaleView notInSale) throws ModelException;
    public R handleRemainingStock(RemainingStockView remainingStock) throws ModelException;
    
}
