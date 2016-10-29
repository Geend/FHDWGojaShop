
package model.visitor;

import persistence.*;

public abstract class ProductGroupCommandStandardVisitor implements ProductGroupCommandVisitor {
    
    public void handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException{
        this.standardHandling(addArticleCommand);
    }
    public void handleAddSubProductGroupCommand(AddSubProductGroupCommand4Public addSubProductGroupCommand) throws PersistenceException{
        this.standardHandling(addSubProductGroupCommand);
    }
    protected abstract void standardHandling(ProductGroupCommand productGroupCommand) throws PersistenceException;
}
