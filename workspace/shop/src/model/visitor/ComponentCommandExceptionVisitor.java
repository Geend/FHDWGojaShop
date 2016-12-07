
package model.visitor;

import persistence.*;

public interface ComponentCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException, E;
    
}
