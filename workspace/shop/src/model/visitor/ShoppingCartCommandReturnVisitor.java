
package model.visitor;

import persistence.*;

public interface ShoppingCartCommandReturnVisitor<R> {
    
    public R handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException;
    public R handleRemoveArticleCommand(RemoveArticleCommand4Public removeArticleCommand) throws PersistenceException;
    
}
