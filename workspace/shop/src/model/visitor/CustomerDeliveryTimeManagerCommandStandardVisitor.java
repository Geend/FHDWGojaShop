
package model.visitor;

import persistence.*;

public abstract class CustomerDeliveryTimeManagerCommandStandardVisitor implements CustomerDeliveryTimeManagerCommandVisitor {
    
    public void handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException{
        this.standardHandling(createCustomerDeliveryTimeCommand);
    }
    protected abstract void standardHandling(CustomerDeliveryTimeManagerCommand customerDeliveryTimeManagerCommand) throws PersistenceException;
}
