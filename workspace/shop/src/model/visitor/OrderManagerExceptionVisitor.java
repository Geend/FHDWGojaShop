
package model.visitor;

import persistence.*;

public interface OrderManagerExceptionVisitor<E extends model.UserException> {
    
    public void handleCustomerOrderManager(CustomerOrderManager4Public customerOrderManager) throws PersistenceException, E;
    
}
