
package model.visitor;

import persistence.*;

public interface SubComponentCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleMoveToCommand(MoveToCommand4Public moveToCommand) throws PersistenceException, E;
    
}
