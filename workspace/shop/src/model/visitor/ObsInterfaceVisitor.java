
package model.visitor;

import persistence.*;

public interface ObsInterfaceVisitor {
    
    public void handleCustomerServiceRootProductGroup(CustomerServiceRootProductGroup4Public customerServiceRootProductGroup) throws PersistenceException;
    public void handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException;
    
}
