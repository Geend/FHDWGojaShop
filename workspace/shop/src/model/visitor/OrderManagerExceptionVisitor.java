
package model.visitor;

import persistence.*;

public interface OrderManagerExceptionVisitor<E extends model.UserException> {
    
    public void handleCustomerOrderManager(CustomerOrderManager4Public customerOrderManager) throws PersistenceException, E;
    public void handleOwnerOrderManager(OwnerOrderManager4Public ownerOrderManager) throws PersistenceException, E;
    
}
