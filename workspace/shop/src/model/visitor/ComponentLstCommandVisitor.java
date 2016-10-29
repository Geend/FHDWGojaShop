
package model.visitor;

import persistence.*;

public interface ComponentLstCommandVisitor {
    
    public void handleCreateProductGroupCommand(CreateProductGroupCommand4Public createProductGroupCommand) throws PersistenceException;
    
}
