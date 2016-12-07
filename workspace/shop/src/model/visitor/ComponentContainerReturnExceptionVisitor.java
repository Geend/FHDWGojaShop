
package model.visitor;

import persistence.*;

public interface ComponentContainerReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleComponentContainerImplementation(ComponentContainerImplementation4Public componentContainerImplementation) throws PersistenceException, E;
    public R handleComponentManager(ComponentManager4Public componentManager) throws PersistenceException, E;
    public R handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException, E;
    
}
