
package model.visitor;

import persistence.*;

public interface OrderManagerVisitor {
    
    public void handleCustomerOrderManager(CustomerOrderManager4Public customerOrderManager) throws PersistenceException;
    public void handleGlobalOrderManager(GlobalOrderManager4Public globalOrderManager) throws PersistenceException;
    
}
