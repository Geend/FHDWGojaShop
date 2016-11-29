
package model.visitor;

import persistence.*;

public interface CompHierarchyHIERARCHYVisitor extends ComponentVisitor{
    
    public void handleProductGroupComponents(ProductGroupComponents4Public productGroupComponents) throws PersistenceException;
    
}
