
package view.visitor;

import view.*;

public interface ServiceExceptionVisitor<E extends view.UserException> {
    
    public void handleCustomerRegisterService(CustomerRegisterServiceView customerRegisterService) throws ModelException, E;
    public void handleCustomerService(CustomerServiceView customerService) throws ModelException, E;
    public void handleOwnerService(OwnerServiceView ownerService) throws ModelException, E;
    
}
