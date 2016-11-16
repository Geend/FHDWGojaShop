
package model.visitor;

import persistence.*;

public interface ObsInterfaceReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException, E;
    public R handleServiceRootProductGroup(ServiceRootProductGroup4Public serviceRootProductGroup) throws PersistenceException, E;
    
}
