
package model.visitor;

import persistence.*;

public interface SubComponentCommandVisitor {
    
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException;
    
}
