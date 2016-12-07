
package model.visitor;

import persistence.*;

public interface ObsInterfaceReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleCustomerServiceComponentManager(CustomerServiceComponentManager4Public customerServiceComponentManager) throws PersistenceException, E;
    public R handleCustomerServiceOrderManager(CustomerServiceOrderManager4Public customerServiceOrderManager) throws PersistenceException, E;
    public R handleOrderManagerOrders(OrderManagerOrders4Public orderManagerOrders) throws PersistenceException, E;
    
}
