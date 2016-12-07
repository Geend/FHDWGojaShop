
package model.visitor;

import persistence.*;

public interface CustomerOrderManagerCommandVisitor {
    
    public void handleAcceptOrderCommand(AcceptOrderCommand4Public acceptOrderCommand) throws PersistenceException;
    public void handleNewOrderCommand(NewOrderCommand4Public newOrderCommand) throws PersistenceException;
    public void handleNewPreOrderCommand(NewPreOrderCommand4Public newPreOrderCommand) throws PersistenceException;
    
}
