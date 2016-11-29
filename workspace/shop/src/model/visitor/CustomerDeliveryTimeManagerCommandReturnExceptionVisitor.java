
package model.visitor;

import persistence.*;

public interface CustomerDeliveryTimeManagerCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException, E;
    
}
