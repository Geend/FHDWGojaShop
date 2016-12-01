
package view.visitor;

import view.*;

public abstract class OrderManagerStandardVisitor implements OrderManagerVisitor {
    
    public void handleOwnerOrderManager(OwnerOrderManagerView ownerOrderManager) throws ModelException{
        this.standardHandling(ownerOrderManager);
    }
    public void handleCustomerOrderManager(CustomerOrderManagerView customerOrderManager) throws ModelException{
        this.standardHandling(customerOrderManager);
    }
    protected abstract void standardHandling(OrderManagerView orderManager) throws ModelException;
}
