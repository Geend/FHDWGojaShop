
package model.visitor;

import persistence.*;

public interface CompHierarchyHIERARCHYVisitor extends ComponentVisitor{
    
    public void handleComponentContainerImplementation(ComponentContainerImplementation4Public componentContainerImplementation) throws PersistenceException;
    public void handleComponentManager(ComponentManager4Public componentManager) throws PersistenceException;
    
}
