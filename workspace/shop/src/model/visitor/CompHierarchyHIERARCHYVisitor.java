
package model.visitor;

import persistence.*;

public interface CompHierarchyHIERARCHYVisitor extends ComponentVisitor{
    
    public void handleComponentManager(ComponentManager4Public componentManager) throws PersistenceException;
    
}
