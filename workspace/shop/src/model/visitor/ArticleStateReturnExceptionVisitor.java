
package model.visitor;

import persistence.*;

public interface ArticleStateReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleInSale(InSale4Public inSale) throws PersistenceException, E;
    public R handleNewCreated(NewCreated4Public newCreated) throws PersistenceException, E;
    public R handleNotInSale(NotInSale4Public notInSale) throws PersistenceException, E;
    public R handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException, E;
    
}
