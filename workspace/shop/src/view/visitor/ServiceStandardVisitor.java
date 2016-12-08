
package view.visitor;

import view.*;

public abstract class ServiceStandardVisitor implements ServiceVisitor {
    
    public void handleCustomerService(CustomerServiceView customerService) throws ModelException{
        this.standardHandling(customerService);
    }
    public void handleOwnerService(OwnerServiceView ownerService) throws ModelException{
        this.standardHandling(ownerService);
    }
    public void handleCustomerRegisterService(CustomerRegisterServiceView customerRegisterService) throws ModelException{
        this.standardHandling(customerRegisterService);
    }
    protected abstract void standardHandling(ServiceView service) throws ModelException;
}
