
package model.visitor;

import persistence.*;

public interface CompHierarchyHIERARCHYReturnVisitor<R> extends ComponentReturnVisitor<R> ,ComponentWrapperReturnVisitor<R> {
    
    public R handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException;
    
}
