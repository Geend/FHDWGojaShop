
package model.visitor;

import persistence.*;

public interface OrderManagerReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleCustomerOrderManager(CustomerOrderManager4Public customerOrderManager) throws PersistenceException, E;
    public R handleGlobalOrderManager(GlobalOrderManager4Public globalOrderManager) throws PersistenceException, E;
    
}
