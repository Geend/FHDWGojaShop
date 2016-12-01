
package model.visitor;

import persistence.*;

public abstract class ReOrderManagerCommandStandardVisitor implements ReOrderManagerCommandVisitor {
    
    public void handleStartOrderingCommand(StartOrderingCommand4Public startOrderingCommand) throws PersistenceException{
        this.standardHandling(startOrderingCommand);
    }
    public void handleReOrderCommand(ReOrderCommand4Public reOrderCommand) throws PersistenceException{
        this.standardHandling(reOrderCommand);
    }
    protected abstract void standardHandling(ReOrderManagerCommand reOrderManagerCommand) throws PersistenceException;
}
