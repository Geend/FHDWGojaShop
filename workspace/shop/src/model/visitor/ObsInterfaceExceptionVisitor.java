
package model.visitor;

import persistence.*;

public interface ObsInterfaceExceptionVisitor<E extends model.UserException> {
    
    public void handleCustomerServiceRootProductGroup(CustomerServiceRootProductGroup4Public customerServiceRootProductGroup) throws PersistenceException, E;
    public void handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException, E;
    
}
