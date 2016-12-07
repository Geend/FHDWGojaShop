
package model.visitor;

import persistence.*;

public interface ReOrderManagerCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleReOrderCommand(ReOrderCommand4Public reOrderCommand) throws PersistenceException, E;
    public void handleReOrderForPreorderCommand(ReOrderForPreorderCommand4Public reOrderForPreorderCommand) throws PersistenceException, E;
    
}
