
package model.visitor;

import persistence.*;

public interface ProductGroupCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleCreateArticleCommand(PersistentCreateArticleCommand createArticleCommand) throws PersistenceException, E;
    public R handleCreateSubProductGroupCommand(PersistentCreateSubProductGroupCommand createSubProductGroupCommand) throws PersistenceException, E;
    
}
