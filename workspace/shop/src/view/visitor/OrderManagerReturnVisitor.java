
package view.visitor;

import view.*;

public interface OrderManagerReturnVisitor<R> {
    
    public R handleCustomerOrderManager(CustomerOrderManagerView customerOrderManager) throws ModelException;
    public R handleGlobalOrderManager(GlobalOrderManagerView globalOrderManager) throws ModelException;
    
}
