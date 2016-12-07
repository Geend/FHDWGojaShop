
package model.visitor;

import persistence.*;

public abstract class ComponentCommandStandardVisitor implements ComponentCommandVisitor {
    
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException{
        this.standardHandling(moveToCommand);
    }
    protected abstract void standardHandling(ComponentCommand componentCommand) throws PersistenceException;
}
