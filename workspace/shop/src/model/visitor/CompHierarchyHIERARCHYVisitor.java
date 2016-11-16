
package model.visitor;

import persistence.*;

public interface CompHierarchyHIERARCHYVisitor extends ComponentVisitor,ComponentWrapperVisitor{
    
    public void handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException;
    
}
