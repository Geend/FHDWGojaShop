
package view.visitor;

import view.*;

public interface ServiceReturnVisitor<R> {
    
    public R handleCustomerRegisterService(CustomerRegisterServiceView customerRegisterService) throws ModelException;
    public R handleCustomerService(CustomerServiceView customerService) throws ModelException;
    public R handleOwnerService(OwnerServiceView ownerService) throws ModelException;
    
}
