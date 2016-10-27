
package model.visitor;

import persistence.*;

public interface ProductGroupCommandReturnVisitor<R> {
    
    public R handleCreateArticleCommand(PersistentCreateArticleCommand createArticleCommand) throws PersistenceException;
    public R handleCreateSubProductGroupCommand(PersistentCreateSubProductGroupCommand createSubProductGroupCommand) throws PersistenceException;
    
}
