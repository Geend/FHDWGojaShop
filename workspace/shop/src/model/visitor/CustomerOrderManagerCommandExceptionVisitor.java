
package model.visitor;

import persistence.*;

public interface CustomerOrderManagerCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleNewOrderCommand(NewOrderCommand4Public newOrderCommand) throws PersistenceException, E;
    public void handleNewPreOrderCommand(NewPreOrderCommand4Public newPreOrderCommand) throws PersistenceException, E;
    
}
