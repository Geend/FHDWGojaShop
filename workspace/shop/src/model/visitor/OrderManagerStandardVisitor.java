
package model.visitor;

import persistence.*;

public abstract class OrderManagerStandardVisitor implements OrderManagerVisitor {
    
    public void handleCustomerOrderManager(CustomerOrderManager4Public customerOrderManager) throws PersistenceException{
        this.standardHandling(customerOrderManager);
    }
    protected abstract void standardHandling(OrderManager4Public orderManager) throws PersistenceException;
}
