
package model.visitor;

import persistence.*;

public interface ShoppingCartQuantifiedArticleCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleChangeArticleQuantityCommand(ChangeArticleQuantityCommand4Public changeArticleQuantityCommand) throws PersistenceException, E;
    
}
