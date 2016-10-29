
package model.visitor;

import persistence.*;

public interface ArticleStateReturnVisitor<R> {
    
    public R handleInSale(InSale4Public inSale) throws PersistenceException;
    public R handleNewCreated(NewCreated4Public newCreated) throws PersistenceException;
    public R handleNotInSale(NotInSale4Public notInSale) throws PersistenceException;
    public R handleRemainingStock(RemainingStock4Public remainingStock) throws PersistenceException;
    
}
