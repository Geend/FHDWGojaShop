
package model.visitor;

import persistence.*;

public interface ObsInterfaceExceptionVisitor<E extends model.UserException> {
    
    public void handleCustomerServiceComponentManager(CustomerServiceComponentManager4Public customerServiceComponentManager) throws PersistenceException, E;
    public void handleCustomerServiceOrderManager(CustomerServiceOrderManager4Public customerServiceOrderManager) throws PersistenceException, E;
    public void handleOrderManagerOrders(OrderManagerOrders4Public orderManagerOrders) throws PersistenceException, E;
    
}
