
package model.visitor;

import persistence.*;

public interface CompHierarchyHIERARCHYReturnVisitor<R> extends ComponentReturnVisitor<R> {
    
    public R handleComponentManager(ComponentManager4Public componentManager) throws PersistenceException;
    
}
