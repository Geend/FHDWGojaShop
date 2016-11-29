
package model.visitor;

import persistence.*;

public interface ShoppingCartQuantifiedArticleCommandVisitor {
    
    public void handleChangeArticleQuantityCommand(ChangeArticleQuantityCommand4Public changeArticleQuantityCommand) throws PersistenceException;
    
}
