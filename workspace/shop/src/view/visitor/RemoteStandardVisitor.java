
package view.visitor;

import view.*;

public abstract class RemoteStandardVisitor implements RemoteVisitor {
    
    public void handleCustomerService(CustomerServiceView customerService) throws ModelException{
        this.standardHandling(customerService);
    }
    public void handleOwnerService(OwnerServiceView ownerService) throws ModelException{
        this.standardHandling(ownerService);
    }
    public void handleServer(ServerView server) throws ModelException{
        this.standardHandling(server);
    }
    public void handleCustomerRegisterService(CustomerRegisterServiceView customerRegisterService) throws ModelException{
        this.standardHandling(customerRegisterService);
    }
    protected abstract void standardHandling(Remote remote) throws ModelException;
}
