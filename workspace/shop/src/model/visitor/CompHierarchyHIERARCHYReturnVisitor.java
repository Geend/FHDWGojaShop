
package model.visitor;

import persistence.*;

public interface CompHierarchyHIERARCHYReturnVisitor<R> extends ComponentReturnVisitor<R> {
    
    public R handleComponentContainerImplementation(ComponentContainerImplementation4Public componentContainerImplementation) throws PersistenceException;
    
}
