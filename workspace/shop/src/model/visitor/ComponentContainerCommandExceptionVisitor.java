
package model.visitor;

import persistence.*;

public interface ComponentContainerCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException, E;
    public void handleNewProductGroupCommand(NewProductGroupCommand4Public newProductGroupCommand) throws PersistenceException, E;
    
}
