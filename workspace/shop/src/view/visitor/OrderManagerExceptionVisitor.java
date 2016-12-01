
package view.visitor;

import view.*;

public interface OrderManagerExceptionVisitor<E extends view.UserException> {
    
    public void handleCustomerOrderManager(CustomerOrderManagerView customerOrderManager) throws ModelException, E;
    public void handleOwnerOrderManager(OwnerOrderManagerView ownerOrderManager) throws ModelException, E;
    
}
