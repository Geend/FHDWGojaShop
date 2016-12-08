
package view.visitor;

import view.*;

public interface ServiceReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleCustomerRegisterService(CustomerRegisterServiceView customerRegisterService) throws ModelException, E;
    public R handleCustomerService(CustomerServiceView customerService) throws ModelException, E;
    public R handleOwnerService(OwnerServiceView ownerService) throws ModelException, E;
    
}
