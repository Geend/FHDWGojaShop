
package model.visitor;

import persistence.*;

public abstract class ProductGroupCommandStandardVisitor implements ProductGroupCommandVisitor {
    
    public void handleNewSubProductGroupCommand(NewSubProductGroupCommand4Public newSubProductGroupCommand) throws PersistenceException{
        this.standardHandling(newSubProductGroupCommand);
    }
    public void handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException{
        this.standardHandling(newArticleCommand);
    }
    protected abstract void standardHandling(ProductGroupCommand productGroupCommand) throws PersistenceException;
}
