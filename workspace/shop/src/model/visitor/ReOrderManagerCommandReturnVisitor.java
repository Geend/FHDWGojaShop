
package model.visitor;

import persistence.*;

public interface ReOrderManagerCommandReturnVisitor<R> {
    
    public R handleReOrderCommand(ReOrderCommand4Public reOrderCommand) throws PersistenceException;
    public R handleReOrderForPreorderCommand(ReOrderForPreorderCommand4Public reOrderForPreorderCommand) throws PersistenceException;
    
}
