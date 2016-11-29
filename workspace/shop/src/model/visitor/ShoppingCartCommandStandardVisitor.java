
package model.visitor;

import persistence.*;

public abstract class ShoppingCartCommandStandardVisitor implements ShoppingCartCommandVisitor {
    
    public void handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException{
        this.standardHandling(addArticleCommand);
    }
    public void handleRemoveArticleCommand(RemoveArticleCommand4Public removeArticleCommand) throws PersistenceException{
        this.standardHandling(removeArticleCommand);
    }
    protected abstract void standardHandling(ShoppingCartCommand shoppingCartCommand) throws PersistenceException;
}
