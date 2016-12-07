
package model.visitor;

import persistence.*;

public interface CustomerOrderManagerCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleAcceptOrderCommand(AcceptOrderCommand4Public acceptOrderCommand) throws PersistenceException, E;
    public R handleNewOrderCommand(NewOrderCommand4Public newOrderCommand) throws PersistenceException, E;
    public R handleNewPreOrderCommand(NewPreOrderCommand4Public newPreOrderCommand) throws PersistenceException, E;
    
}
