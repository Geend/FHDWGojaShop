
package model.visitor;

import persistence.*;

public interface ComponentLstCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleCreateProductGroupCommand(CreateProductGroupCommand4Public createProductGroupCommand) throws PersistenceException, E;
    
}
