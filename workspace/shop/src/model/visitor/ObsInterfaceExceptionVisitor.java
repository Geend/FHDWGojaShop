
package model.visitor;

import persistence.*;

public interface ObsInterfaceExceptionVisitor<E extends model.UserException> {
    
    public void handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException, E;
    public void handleServiceRootProductGroup(ServiceRootProductGroup4Public serviceRootProductGroup) throws PersistenceException, E;
    
}
