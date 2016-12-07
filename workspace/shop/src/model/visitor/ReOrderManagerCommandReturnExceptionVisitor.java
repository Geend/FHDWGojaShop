
package model.visitor;

import persistence.*;

public interface ReOrderManagerCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleReOrderCommand(ReOrderCommand4Public reOrderCommand) throws PersistenceException, E;
    public R handleReOrderForPreorderCommand(ReOrderForPreorderCommand4Public reOrderForPreorderCommand) throws PersistenceException, E;
    
}
