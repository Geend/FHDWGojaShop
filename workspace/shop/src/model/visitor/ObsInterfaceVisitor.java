
package model.visitor;

import persistence.*;

public interface ObsInterfaceVisitor {
    
    public void handleCustomerServiceComponentManager(CustomerServiceComponentManager4Public customerServiceComponentManager) throws PersistenceException;
    public void handleCustomerServiceOrderManager(CustomerServiceOrderManager4Public customerServiceOrderManager) throws PersistenceException;
    public void handleOrderManagerOrders(OrderManagerOrders4Public orderManagerOrders) throws PersistenceException;
    
}
