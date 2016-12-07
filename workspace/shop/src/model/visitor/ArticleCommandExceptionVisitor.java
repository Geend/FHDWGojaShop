
package model.visitor;

import persistence.*;

public interface ArticleCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleIncreaseStockCommand(IncreaseStockCommand4Public increaseStockCommand) throws PersistenceException, E;
    public void handleReduceStockCommand(ReduceStockCommand4Public reduceStockCommand) throws PersistenceException, E;
    
}
