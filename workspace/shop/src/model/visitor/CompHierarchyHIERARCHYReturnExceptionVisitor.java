
package model.visitor;

import persistence.*;

public interface CompHierarchyHIERARCHYReturnExceptionVisitor<R, E extends model.UserException> extends ComponentReturnExceptionVisitor<R, E> {
    
    public R handleComponentContainerImplementation(ComponentContainerImplementation4Public componentContainerImplementation) throws PersistenceException, E;
    public R handleComponentManager(ComponentManager4Public componentManager) throws PersistenceException, E;
    
}
