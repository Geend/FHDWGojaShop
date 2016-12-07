
package model.visitor;

import persistence.*;

public interface ObsInterfaceVisitor {
    
    public void handleCustomerServiceOrderManager(CustomerServiceOrderManager4Public customerServiceOrderManager) throws PersistenceException;
    public void handleCustomerServiceShop(CustomerServiceShop4Public customerServiceShop) throws PersistenceException;
    public void handleOrderManagerOrders(OrderManagerOrders4Public orderManagerOrders) throws PersistenceException;
    public void handleOwnerServiceShop(OwnerServiceShop4Public ownerServiceShop) throws PersistenceException;
    
}
