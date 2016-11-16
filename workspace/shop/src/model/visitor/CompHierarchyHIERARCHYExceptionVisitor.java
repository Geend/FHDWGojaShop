
package model.visitor;

import persistence.*;

public interface CompHierarchyHIERARCHYExceptionVisitor<E extends model.UserException> extends ComponentExceptionVisitor<E>,ComponentWrapperExceptionVisitor<E>{
    
    public void handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException, E;
    
}
