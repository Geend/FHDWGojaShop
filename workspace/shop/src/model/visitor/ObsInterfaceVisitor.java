
package model.visitor;

import persistence.*;

public interface ObsInterfaceVisitor {
    
    public void handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException;
    public void handleServiceRootProductGroup(ServiceRootProductGroup4Public serviceRootProductGroup) throws PersistenceException;
    
}
