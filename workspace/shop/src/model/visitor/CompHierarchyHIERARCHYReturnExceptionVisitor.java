
package model.visitor;

import persistence.*;

public interface CompHierarchyHIERARCHYReturnExceptionVisitor<R, E extends model.UserException> extends ComponentReturnExceptionVisitor<R, E> {
    
    public R handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException, E;
    
}
