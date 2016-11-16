
package model.visitor;

import persistence.*;

public interface ServiceExceptionVisitor<E extends model.UserException> {
    
    public void handleCustomerRegisterService(CustomerRegisterService4Public customerRegisterService) throws PersistenceException, E;
    public void handleCustomerService(CustomerService4Public customerService) throws PersistenceException, E;
    public void handleOwnerService(OwnerService4Public ownerService) throws PersistenceException, E;
    
}
