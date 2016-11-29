
package model.visitor;

import persistence.*;

public abstract class ShoppingCartQuantifiedArticleCommandStandardVisitor implements ShoppingCartQuantifiedArticleCommandVisitor {
    
    public void handleChangeArticleQuantityCommand(ChangeArticleQuantityCommand4Public changeArticleQuantityCommand) throws PersistenceException{
        this.standardHandling(changeArticleQuantityCommand);
    }
    protected abstract void standardHandling(ShoppingCartQuantifiedArticleCommand shoppingCartQuantifiedArticleCommand) throws PersistenceException;
}
