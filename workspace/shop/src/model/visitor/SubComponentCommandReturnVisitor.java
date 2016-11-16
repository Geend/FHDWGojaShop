
package model.visitor;

import persistence.*;

public interface SubComponentCommandReturnVisitor<R> {
    
    public R handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException;
    
}
