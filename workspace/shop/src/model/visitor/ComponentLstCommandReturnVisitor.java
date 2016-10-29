
package model.visitor;

import persistence.*;

public interface ComponentLstCommandReturnVisitor<R> {
    
    public R handleCreateProductGroupCommand(CreateProductGroupCommand4Public createProductGroupCommand) throws PersistenceException;
    
}
