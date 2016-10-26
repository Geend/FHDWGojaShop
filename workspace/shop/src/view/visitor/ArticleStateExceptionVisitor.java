
package view.visitor;

import view.*;

public interface ArticleStateExceptionVisitor<E extends view.UserException> {
    
    public void handleInSale(InSaleView inSale) throws ModelException, E;
    public void handleNewCreated(NewCreatedView newCreated) throws ModelException, E;
    public void handleNotInSale(NotInSaleView notInSale) throws ModelException, E;
    public void handleRemainingStock(RemainingStockView remainingStock) throws ModelException, E;
    
}
