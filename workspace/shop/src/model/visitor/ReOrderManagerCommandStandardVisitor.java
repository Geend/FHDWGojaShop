
package model.visitor;

import persistence.*;

public abstract class ReOrderManagerCommandStandardVisitor implements ReOrderManagerCommandVisitor {
    
    public void handleReOrderForPreorderCommand(ReOrderForPreorderCommand4Public reOrderForPreorderCommand) throws PersistenceException{
        this.standardHandling(reOrderForPreorderCommand);
    }
    public void handleReOrderCommand(ReOrderCommand4Public reOrderCommand) throws PersistenceException{
        this.standardHandling(reOrderCommand);
    }
    protected abstract void standardHandling(ReOrderManagerCommand reOrderManagerCommand) throws PersistenceException;
}
