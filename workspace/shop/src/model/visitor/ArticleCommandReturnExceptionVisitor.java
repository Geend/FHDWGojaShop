
package model.visitor;

import persistence.*;

public interface ArticleCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleIncreaseStockCommand(IncreaseStockCommand4Public increaseStockCommand) throws PersistenceException, E;
    public R handleReduceStockCommand(ReduceStockCommand4Public reduceStockCommand) throws PersistenceException, E;
    
}
