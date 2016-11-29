
package model.visitor;

import persistence.*;

public interface CustomerDeliveryTimeManagerCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleCreateCustomerDeliveryTimeCommand(CreateCustomerDeliveryTimeCommand4Public createCustomerDeliveryTimeCommand) throws PersistenceException, E;
    
}
