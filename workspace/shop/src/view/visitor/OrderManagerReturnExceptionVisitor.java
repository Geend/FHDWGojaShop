
package view.visitor;

import view.*;

public interface OrderManagerReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleCustomerOrderManager(CustomerOrderManagerView customerOrderManager) throws ModelException, E;
    public R handleOwnerOrderManager(OwnerOrderManagerView ownerOrderManager) throws ModelException, E;
    
}
