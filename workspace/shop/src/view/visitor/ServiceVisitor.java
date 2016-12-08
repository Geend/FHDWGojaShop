
package view.visitor;

import view.*;

public interface ServiceVisitor {
    
    public void handleCustomerRegisterService(CustomerRegisterServiceView customerRegisterService) throws ModelException;
    public void handleCustomerService(CustomerServiceView customerService) throws ModelException;
    public void handleOwnerService(OwnerServiceView ownerService) throws ModelException;
    
}
