
package view.visitor;

import view.*;

public interface OrderManagerReturnVisitor<R> {
    
    public R handleCustomerOrderManager(CustomerOrderManagerView customerOrderManager) throws ModelException;
    public R handleOwnerOrderManager(OwnerOrderManagerView ownerOrderManager) throws ModelException;
    
}
