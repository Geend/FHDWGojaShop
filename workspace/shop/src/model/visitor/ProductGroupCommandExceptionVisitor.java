
package model.visitor;

import persistence.*;

public interface ProductGroupCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleCreateArticleCommand(PersistentCreateArticleCommand createArticleCommand) throws PersistenceException, E;
    public void handleCreateSubProductGroupCommand(PersistentCreateSubProductGroupCommand createSubProductGroupCommand) throws PersistenceException, E;
    
}
