
package model.visitor;

import persistence.*;

public interface ServiceReturnVisitor<R> {
    
    public R handleCustomerRegisterService(CustomerRegisterService4Public customerRegisterService) throws PersistenceException;
    public R handleCustomerService(CustomerService4Public customerService) throws PersistenceException;
    public R handleOwnerService(OwnerService4Public ownerService) throws PersistenceException;
    
}
