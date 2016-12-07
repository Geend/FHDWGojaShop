
package model.visitor;

import persistence.*;

public interface ComponentContainerVisitor {
    
    public void handleComponentManager(ComponentManager4Public componentManager) throws PersistenceException;
    public void handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException;
    
}
