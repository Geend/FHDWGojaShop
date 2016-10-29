
package model.visitor;

import persistence.*;

public interface ComponentLstCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleCreateProductGroupCommand(CreateProductGroupCommand4Public createProductGroupCommand) throws PersistenceException, E;
    
}
