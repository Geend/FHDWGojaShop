
package model.visitor;

import persistence.*;

public interface ReOrderManagerCommandVisitor {
    
    public void handleReOrderCommand(ReOrderCommand4Public reOrderCommand) throws PersistenceException;
    public void handleStartOrderingCommand(StartOrderingCommand4Public startOrderingCommand) throws PersistenceException;
    
}
