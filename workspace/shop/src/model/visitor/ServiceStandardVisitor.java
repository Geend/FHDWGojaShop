
package model.visitor;

import persistence.*;

public abstract class ServiceStandardVisitor implements ServiceVisitor {
    
    public void handleCustomerService(CustomerService4Public customerService) throws PersistenceException{
        this.standardHandling(customerService);
    }
    public void handleOwnerService(OwnerService4Public ownerService) throws PersistenceException{
        this.standardHandling(ownerService);
    }
    public void handleCustomerRegisterService(CustomerRegisterService4Public customerRegisterService) throws PersistenceException{
        this.standardHandling(customerRegisterService);
    }
    protected abstract void standardHandling(Service4Public service) throws PersistenceException;
}
