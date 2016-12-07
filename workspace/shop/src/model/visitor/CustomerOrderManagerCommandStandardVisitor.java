
package model.visitor;

import persistence.*;

public abstract class CustomerOrderManagerCommandStandardVisitor implements CustomerOrderManagerCommandVisitor {
    
    public void handleNewPreOrderCommand(NewPreOrderCommand4Public newPreOrderCommand) throws PersistenceException{
        this.standardHandling(newPreOrderCommand);
    }
    public void handleNewOrderCommand(NewOrderCommand4Public newOrderCommand) throws PersistenceException{
        this.standardHandling(newOrderCommand);
    }
    public void handleAcceptOrderCommand(AcceptOrderCommand4Public acceptOrderCommand) throws PersistenceException{
        this.standardHandling(acceptOrderCommand);
    }
    protected abstract void standardHandling(CustomerOrderManagerCommand customerOrderManagerCommand) throws PersistenceException;
}
