
package model.visitor;

import persistence.*;

public abstract class ObsInterfaceStandardVisitor implements ObsInterfaceVisitor {
    
    public void handleOrderManagerOrders(OrderManagerOrders4Public orderManagerOrders) throws PersistenceException{
        this.standardHandling(orderManagerOrders);
    }
    public void handleCustomerServiceOrderManager(CustomerServiceOrderManager4Public customerServiceOrderManager) throws PersistenceException{
        this.standardHandling(customerServiceOrderManager);
    }
    public void handleOwnerServiceShop(OwnerServiceShop4Public ownerServiceShop) throws PersistenceException{
        this.standardHandling(ownerServiceShop);
    }
    public void handleCustomerServiceShop(CustomerServiceShop4Public customerServiceShop) throws PersistenceException{
        this.standardHandling(customerServiceShop);
    }
    protected abstract void standardHandling(ObsInterface obsInterface) throws PersistenceException;
}
