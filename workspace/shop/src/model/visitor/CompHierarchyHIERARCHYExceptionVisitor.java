
package model.visitor;

import persistence.*;

public interface CompHierarchyHIERARCHYExceptionVisitor<E extends model.UserException> extends ComponentExceptionVisitor<E>{
    
    public void handleComponentContainerImplementation(ComponentContainerImplementation4Public componentContainerImplementation) throws PersistenceException, E;
    public void handleComponentManager(ComponentManager4Public componentManager) throws PersistenceException, E;
    
}
