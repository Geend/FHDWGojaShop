
package model.visitor;

import persistence.*;

public interface ComponentContainerVisitor {
    
    public void handleComponentContainerImplementation(ComponentContainerImplementation4Public componentContainerImplementation) throws PersistenceException;
    public void handleComponentManager(ComponentManager4Public componentManager) throws PersistenceException;
    public void handleProductGroup(ProductGroup4Public productGroup) throws PersistenceException;
    
}
