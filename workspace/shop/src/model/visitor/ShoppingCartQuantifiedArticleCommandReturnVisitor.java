
package model.visitor;

import persistence.*;

public interface ShoppingCartQuantifiedArticleCommandReturnVisitor<R> {
    
    public R handleChangeArticleQuantityCommand(ChangeArticleQuantityCommand4Public changeArticleQuantityCommand) throws PersistenceException;
    
}
