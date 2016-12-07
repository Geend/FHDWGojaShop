
package model.visitor;

import persistence.*;

public interface CompHierarchyHIERARCHYReturnExceptionVisitor<R, E extends model.UserException> extends ComponentReturnExceptionVisitor<R, E> {
    
    public R handleComponentContainerImplementation(ComponentContainerImplementation4Public componentContainerImplementation) throws PersistenceException, E;
    public R handleComponentContainerImplementationComponents(ComponentContainerImplementationComponents4Public componentContainerImplementationComponents) throws PersistenceException, E;
    public R handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException, E;
    
}
