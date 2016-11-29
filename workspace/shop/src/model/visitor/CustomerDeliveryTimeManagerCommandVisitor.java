
package model.visitor;

import persistence.*;

public interface CustomerDeliveryTimeManagerCommandVisitor {
    
    public void handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException;
    
}
