
package model.visitor;

import persistence.*;

public interface ReOrderManagerCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleReOrderCommand(ReOrderCommand4Public reOrderCommand) throws PersistenceException, E;
    public R handleStartOrderingCommand(StartOrderingCommand4Public startOrderingCommand) throws PersistenceException, E;
    
}
