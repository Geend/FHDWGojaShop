
package model.visitor;

import persistence.*;

public interface ObsInterfaceReturnVisitor<R> {
    
    public R handleCustomerServiceOrderManager(CustomerServiceOrderManager4Public customerServiceOrderManager) throws PersistenceException;
    public R handleCustomerServiceShop(CustomerServiceShop4Public customerServiceShop) throws PersistenceException;
    public R handleOrderManagerOrders(OrderManagerOrders4Public orderManagerOrders) throws PersistenceException;
    public R handleOwnerServiceShop(OwnerServiceShop4Public ownerServiceShop) throws PersistenceException;
    
}
