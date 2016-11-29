
package model.visitor;

import persistence.*;

public interface OrderManagerVisitor {
    
    public void handleCustomerOrderManager(CustomerOrderManager4Public customerOrderManager) throws PersistenceException;
    
}
