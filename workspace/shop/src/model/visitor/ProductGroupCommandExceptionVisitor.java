
package model.visitor;

import persistence.*;

public interface ProductGroupCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException, E;
    public void handleNewSubProductGroupCommand(NewSubProductGroupCommand4Public newSubProductGroupCommand) throws PersistenceException, E;
    
}
