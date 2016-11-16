
package model.visitor;

import persistence.*;

public abstract class SubComponentCommandStandardVisitor implements SubComponentCommandVisitor {
    
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException{
        this.standardHandling(moveToCommand);
    }
    protected abstract void standardHandling(SubComponentCommand subComponentCommand) throws PersistenceException;
}
