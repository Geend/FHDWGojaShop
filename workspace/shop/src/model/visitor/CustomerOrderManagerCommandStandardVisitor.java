
package model.visitor;

import persistence.*;

public abstract class CustomerOrderManagerCommandStandardVisitor implements CustomerOrderManagerCommandVisitor {
    
    public void handleNewPreOrderCommand(NewPreOrderCommand4Public newPreOrderCommand) throws PersistenceException{
        this.standardHandling(newPreOrderCommand);
    }
    public void handleNewOrderCommand(NewOrderCommand4Public newOrderCommand) throws PersistenceException{
        this.standardHandling(newOrderCommand);
    }
    protected abstract void standardHandling(CustomerOrderManagerCommand customerOrderManagerCommand) throws PersistenceException;
}
