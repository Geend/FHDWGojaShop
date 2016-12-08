
package model.visitor;

import persistence.*;

public interface ShoppingCartCommandVisitor {
    
    public void handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException;
    public void handleRemoveArticleCommand(RemoveArticleCommand4Public removeArticleCommand) throws PersistenceException;
    
}
