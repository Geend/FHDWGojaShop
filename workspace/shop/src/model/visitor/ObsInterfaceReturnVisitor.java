
package model.visitor;

import persistence.*;

public interface ObsInterfaceReturnVisitor<R> {
    
    public R handleCustomerServiceRootProductGroup(CustomerServiceRootProductGroup4Public customerServiceRootProductGroup) throws PersistenceException;
    public R handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException;
    
}
