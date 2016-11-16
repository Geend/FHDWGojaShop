
package model.visitor;

import persistence.*;

public abstract class OwnerArticleWrapperCommandStandardVisitor implements OwnerArticleWrapperCommandVisitor {
    
    public void handleIncreaseStockCommand(IncreaseStockCommand4Public increaseStockCommand) throws PersistenceException{
        this.standardHandling(increaseStockCommand);
    }
    public void handleStopSellingCommand(StopSellingCommand4Public stopSellingCommand) throws PersistenceException{
        this.standardHandling(stopSellingCommand);
    }
    public void handleStartSellingCommand(StartSellingCommand4Public startSellingCommand) throws PersistenceException{
        this.standardHandling(startSellingCommand);
    }
    public void handleReduceStockCommand(ReduceStockCommand4Public reduceStockCommand) throws PersistenceException{
        this.standardHandling(reduceStockCommand);
    }
    protected abstract void standardHandling(OwnerArticleWrapperCommand ownerArticleWrapperCommand) throws PersistenceException;
}
