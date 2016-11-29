
package model.visitor;

import persistence.*;

public interface CustomerOrderManagerCommandVisitor {
    
    public void handleNewOrderCommand(NewOrderCommand4Public newOrderCommand) throws PersistenceException;
    public void handleNewPreOrderCommand(NewPreOrderCommand4Public newPreOrderCommand) throws PersistenceException;
    
}
