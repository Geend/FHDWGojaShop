
package model.visitor;

import persistence.*;

public interface ServiceReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleCustomerRegisterService(CustomerRegisterService4Public customerRegisterService) throws PersistenceException, E;
    public R handleCustomerService(CustomerService4Public customerService) throws PersistenceException, E;
    public R handleOwnerService(OwnerService4Public ownerService) throws PersistenceException, E;
    
}
