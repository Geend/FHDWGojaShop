
package view.visitor;

import view.*;

public interface OrderManagerVisitor {
    
    public void handleCustomerOrderManager(CustomerOrderManagerView customerOrderManager) throws ModelException;
    
}
