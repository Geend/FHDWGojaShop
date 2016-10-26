
package model.visitor;

import persistence.*;

public interface ArticleStateReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleInSale(PersistentInSale inSale) throws PersistenceException, E;
    public R handleNewCreated(PersistentNewCreated newCreated) throws PersistenceException, E;
    public R handleNotInSale(PersistentNotInSale notInSale) throws PersistenceException, E;
    public R handleRemainingStock(PersistentRemainingStock remainingStock) throws PersistenceException, E;
    
}
