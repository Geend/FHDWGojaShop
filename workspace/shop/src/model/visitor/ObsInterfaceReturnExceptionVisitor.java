
package model.visitor;

import persistence.*;

public interface ObsInterfaceReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleCustomerServiceRootProductGroup(CustomerServiceRootProductGroup4Public customerServiceRootProductGroup) throws PersistenceException, E;
    public R handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException, E;
    
}
