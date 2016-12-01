
package model.visitor;

import persistence.*;

public interface ReOrderManagerCommandReturnVisitor<R> {
    
    public R handleReOrderCommand(ReOrderCommand4Public reOrderCommand) throws PersistenceException;
    public R handleStartOrderingCommand(StartOrderingCommand4Public startOrderingCommand) throws PersistenceException;
    
}
