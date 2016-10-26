
package model.visitor;

import persistence.*;

public interface ArticleStateReturnVisitor<R> {
    
    public R handleInSale(PersistentInSale inSale) throws PersistenceException;
    public R handleNewCreated(PersistentNewCreated newCreated) throws PersistenceException;
    public R handleNotInSale(PersistentNotInSale notInSale) throws PersistenceException;
    public R handleRemainingStock(PersistentRemainingStock remainingStock) throws PersistenceException;
    
}
