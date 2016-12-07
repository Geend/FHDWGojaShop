
package model.visitor;

import persistence.*;

public interface ComponentCommandReturnVisitor<R> {
    
    public R handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException;
    
}
