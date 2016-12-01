
package model.visitor;

import persistence.*;

public interface OrderManagerReturnVisitor<R> {
    
    public R handleCustomerOrderManager(CustomerOrderManager4Public customerOrderManager) throws PersistenceException;
    public R handleOwnerOrderManager(OwnerOrderManager4Public ownerOrderManager) throws PersistenceException;
    
}
