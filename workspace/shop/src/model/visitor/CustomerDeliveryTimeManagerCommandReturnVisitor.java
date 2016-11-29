
package model.visitor;

import persistence.*;

public interface CustomerDeliveryTimeManagerCommandReturnVisitor<R> {
    
    public R handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException;
    
}
