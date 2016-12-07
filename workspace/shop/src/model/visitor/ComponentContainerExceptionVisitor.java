
package model.visitor;

import persistence.*;

public interface ComponentContainerExceptionVisitor<E extends model.UserException> {
    
    public void handleComponentManager(ComponentManager4Public componentManager) throws PersistenceException, E;
    public void handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException, E;
    
}
