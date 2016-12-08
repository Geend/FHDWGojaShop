
package view.visitor;

import view.*;

public abstract class OrderManagerStandardVisitor implements OrderManagerVisitor {
    
    public void handleGlobalOrderManager(GlobalOrderManagerView globalOrderManager) throws ModelException{
        this.standardHandling(globalOrderManager);
    }
    public void handleCustomerOrderManager(CustomerOrderManagerView customerOrderManager) throws ModelException{
        this.standardHandling(customerOrderManager);
    }
    protected abstract void standardHandling(OrderManagerView orderManager) throws ModelException;
}
