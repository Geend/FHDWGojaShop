
package model.visitor;

import persistence.*;

public interface ServiceVisitor {
    
    public void handleCustomerRegisterService(CustomerRegisterService4Public customerRegisterService) throws PersistenceException;
    public void handleCustomerService(CustomerService4Public customerService) throws PersistenceException;
    public void handleOwnerService(OwnerService4Public ownerService) throws PersistenceException;
    
}
