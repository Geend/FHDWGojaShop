
package model.visitor;

import persistence.*;

public interface ComponentCommandVisitor {
    
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException;
    
}
