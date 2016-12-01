
package model.visitor;

import persistence.*;

public interface ReOrderManagerCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleReOrderCommand(ReOrderCommand4Public reOrderCommand) throws PersistenceException, E;
    public void handleStartOrderingCommand(StartOrderingCommand4Public startOrderingCommand) throws PersistenceException, E;
    
}
