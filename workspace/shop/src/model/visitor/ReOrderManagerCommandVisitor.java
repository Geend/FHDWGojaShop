
package model.visitor;

import persistence.*;

public interface ReOrderManagerCommandVisitor {
    
    public void handleReOrderCommand(ReOrderCommand4Public reOrderCommand) throws PersistenceException;
    public void handleReOrderForPreorderCommand(ReOrderForPreorderCommand4Public reOrderForPreorderCommand) throws PersistenceException;
    
}
