
package view.visitor;

import view.*;

public interface OrderManagerReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleCustomerOrderManager(CustomerOrderManagerView customerOrderManager) throws ModelException, E;
    public R handleGlobalOrderManager(GlobalOrderManagerView globalOrderManager) throws ModelException, E;
    
}
