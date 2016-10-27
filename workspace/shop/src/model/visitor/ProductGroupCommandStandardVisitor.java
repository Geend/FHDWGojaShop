
package model.visitor;

import persistence.*;

public abstract class ProductGroupCommandStandardVisitor implements ProductGroupCommandVisitor {
    
    public void handleCreateSubProductGroupCommand(PersistentCreateSubProductGroupCommand createSubProductGroupCommand) throws PersistenceException{
        this.standardHandling(createSubProductGroupCommand);
    }
    public void handleCreateArticleCommand(PersistentCreateArticleCommand createArticleCommand) throws PersistenceException{
        this.standardHandling(createArticleCommand);
    }
    protected abstract void standardHandling(ProductGroupCommand productGroupCommand) throws PersistenceException;
}
