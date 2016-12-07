
package model.visitor;

import persistence.*;

public interface CustomerOrderManagerCommandReturnVisitor<R> {
    
    public R handleAcceptOrderCommand(AcceptOrderCommand4Public acceptOrderCommand) throws PersistenceException;
    public R handleNewOrderCommand(NewOrderCommand4Public newOrderCommand) throws PersistenceException;
    public R handleNewPreOrderCommand(NewPreOrderCommand4Public newPreOrderCommand) throws PersistenceException;
    
}