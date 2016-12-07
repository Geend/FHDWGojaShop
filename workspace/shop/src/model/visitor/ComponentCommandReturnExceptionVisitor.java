
package model.visitor;

import persistence.*;

public interface ComponentCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException, E;
    
}
