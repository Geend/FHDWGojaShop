
package model.visitor;

import persistence.*;

public interface ObsInterfaceReturnVisitor<R> {
    
    public R handleCustomerServiceComponentManager(CustomerServiceComponentManager4Public customerServiceComponentManager) throws PersistenceException;
    public R handleCustomerServiceOrderManager(CustomerServiceOrderManager4Public customerServiceOrderManager) throws PersistenceException;
    public R handleOrderManagerOrders(OrderManagerOrders4Public orderManagerOrders) throws PersistenceException;
    
}
