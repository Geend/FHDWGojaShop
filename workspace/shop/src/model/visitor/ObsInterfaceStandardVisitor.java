
package model.visitor;

import persistence.*;

public abstract class ObsInterfaceStandardVisitor implements ObsInterfaceVisitor {
    
    public void handleOrderManagerOrders(OrderManagerOrders4Public orderManagerOrders) throws PersistenceException{
        this.standardHandling(orderManagerOrders);
    }
    public void handleCustomerServiceComponentManager(CustomerServiceComponentManager4Public customerServiceComponentManager) throws PersistenceException{
        this.standardHandling(customerServiceComponentManager);
    }
    public void handleCustomerServiceOrderManager(CustomerServiceOrderManager4Public customerServiceOrderManager) throws PersistenceException{
        this.standardHandling(customerServiceOrderManager);
    }
    protected abstract void standardHandling(ObsInterface obsInterface) throws PersistenceException;
}
