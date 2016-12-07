
package model.visitor;

import persistence.*;

public interface ArticleCommandReturnVisitor<R> {
    
    public R handleIncreaseStockCommand(IncreaseStockCommand4Public increaseStockCommand) throws PersistenceException;
    public R handleReduceStockCommand(ReduceStockCommand4Public reduceStockCommand) throws PersistenceException;
    
}
