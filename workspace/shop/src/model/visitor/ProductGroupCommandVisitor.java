
package model.visitor;

import persistence.*;

public interface ProductGroupCommandVisitor {
    
    public void handleCreateArticleCommand(PersistentCreateArticleCommand createArticleCommand) throws PersistenceException;
    public void handleCreateSubProductGroupCommand(PersistentCreateSubProductGroupCommand createSubProductGroupCommand) throws PersistenceException;
    
}
