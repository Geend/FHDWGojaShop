
package view.visitor;

import view.*;

public abstract class RemoteDirectVisitor implements RemoteVisitor {
    
    public abstract void handleServer(ServerView server) throws ModelException;
    
    public abstract void handleService(ServiceView service) throws ModelException;
    
    public void handleCustomerService(CustomerServiceView customerService) throws ModelException{
        this.handleService(customerService);
    }
    public void handleOwnerService(OwnerServiceView ownerService) throws ModelException{
        this.handleService(ownerService);
    }
    public void handleCustomerRegisterService(CustomerRegisterServiceView customerRegisterService) throws ModelException{
        this.handleService(customerRegisterService);
    }
    
}
