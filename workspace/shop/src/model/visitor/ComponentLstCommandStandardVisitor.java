
package model.visitor;

import persistence.*;

public abstract class ComponentLstCommandStandardVisitor implements ComponentLstCommandVisitor {
    
    public void handleCreateProductGroupCommand(CreateProductGroupCommand4Public createProductGroupCommand) throws PersistenceException{
        this.standardHandling(createProductGroupCommand);
    }
    protected abstract void standardHandling(ComponentLstCommand componentLstCommand) throws PersistenceException;
}
