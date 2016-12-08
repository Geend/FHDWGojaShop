
package model.visitor;

import persistence.*;

public abstract class RemoteStandardVisitor implements RemoteVisitor {
    
    public void handleCustomerService(CustomerService4Public customerService) throws PersistenceException{
        this.standardHandling(customerService);
    }
    public void handleOwnerService(OwnerService4Public ownerService) throws PersistenceException{
        this.standardHandling(ownerService);
    }
    public void handleServer(Server4Public server) throws PersistenceException{
        this.standardHandling(server);
    }
    public void handleCustomerRegisterService(CustomerRegisterService4Public customerRegisterService) throws PersistenceException{
        this.standardHandling(customerRegisterService);
    }
    protected abstract void standardHandling(Remote remote) throws PersistenceException;
}
