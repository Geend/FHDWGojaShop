
package model.visitor;

import persistence.*;

public interface ShoppingCartCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException, E;
    public void handleRemoveArticleCommand(RemoveArticleCommand4Public removeArticleCommand) throws PersistenceException, E;
    
}
