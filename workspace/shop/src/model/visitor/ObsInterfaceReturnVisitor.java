
package model.visitor;

import persistence.*;

public interface ObsInterfaceReturnVisitor<R> {
    
    public R handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException;
    public R handleServiceRootProductGroup(ServiceRootProductGroup4Public serviceRootProductGroup) throws PersistenceException;
    
}
