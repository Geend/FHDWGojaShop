
package model.visitor;

import persistence.*;

public interface ObsInterfaceVisitor {
    
    public void handleComponentContainerImplementationComponents(ComponentContainerImplementationComponents4Public componentContainerImplementationComponents) throws PersistenceException;
    public void handleCustomerServiceComponentManager(CustomerServiceComponentManager4Public customerServiceComponentManager) throws PersistenceException;
    public void handleCustomerServiceOrderManager(CustomerServiceOrderManager4Public customerServiceOrderManager) throws PersistenceException;
    public void handleOrderManagerOrders(OrderManagerOrders4Public orderManagerOrders) throws PersistenceException;
    public void handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException;
    
}
