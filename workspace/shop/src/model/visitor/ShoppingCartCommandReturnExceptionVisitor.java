
package model.visitor;

import persistence.*;

public interface ShoppingCartCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException, E;
    public R handleRemoveArticleCommand(RemoveArticleCommand4Public removeArticleCommand) throws PersistenceException, E;
    
}
