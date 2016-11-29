
package model.visitor;

import persistence.*;

public interface ShoppingCartQuantifiedArticleCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleChangeArticleQuantityCommand(ChangeArticleQuantityCommand4Public changeArticleQuantityCommand) throws PersistenceException, E;
    
}
