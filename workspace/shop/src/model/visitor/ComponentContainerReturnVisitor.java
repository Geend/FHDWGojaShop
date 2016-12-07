
package model.visitor;

import persistence.*;

public interface ComponentContainerReturnVisitor<R> {
    
    public R handleComponentContainerImplementation(ComponentContainerImplementation4Public componentContainerImplementation) throws PersistenceException;
    public R handleComponentManager(ComponentManager4Public componentManager) throws PersistenceException;
    public R handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException;
    
}
