
package view.visitor;

import view.*;

public interface ArticleStateReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleInSale(InSaleView inSale) throws ModelException, E;
    public R handleNewCreated(NewCreatedView newCreated) throws ModelException, E;
    public R handleNotInSale(NotInSaleView notInSale) throws ModelException, E;
    public R handleRemainingStock(RemainingStockView remainingStock) throws ModelException, E;
    
}
