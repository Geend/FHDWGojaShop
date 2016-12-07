
package model.visitor;

import persistence.*;

public abstract class ArticleCommandStandardVisitor implements ArticleCommandVisitor {
    
    public void handleIncreaseStockCommand(IncreaseStockCommand4Public increaseStockCommand) throws PersistenceException{
        this.standardHandling(increaseStockCommand);
    }
    public void handleReduceStockCommand(ReduceStockCommand4Public reduceStockCommand) throws PersistenceException{
        this.standardHandling(reduceStockCommand);
    }
    protected abstract void standardHandling(ArticleCommand articleCommand) throws PersistenceException;
}
