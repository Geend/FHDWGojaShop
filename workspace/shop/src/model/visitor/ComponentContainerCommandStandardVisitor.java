
package model.visitor;

import persistence.*;

public abstract class ComponentContainerCommandStandardVisitor implements ComponentContainerCommandVisitor {
    
    public void handleNewProductGroupCommand(NewProductGroupCommand4Public newProductGroupCommand) throws PersistenceException{
        this.standardHandling(newProductGroupCommand);
    }
    public void handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException{
        this.standardHandling(newArticleCommand);
    }
    protected abstract void standardHandling(ComponentContainerCommand componentContainerCommand) throws PersistenceException;
}
