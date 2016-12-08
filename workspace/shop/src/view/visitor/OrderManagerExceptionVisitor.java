
package view.visitor;

import view.*;

public interface OrderManagerExceptionVisitor<E extends view.UserException> {
    
    public void handleCustomerOrderManager(CustomerOrderManagerView customerOrderManager) throws ModelException, E;
    public void handleGlobalOrderManager(GlobalOrderManagerView globalOrderManager) throws ModelException, E;
    
}
