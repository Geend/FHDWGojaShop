
package model.visitor;

import persistence.*;

public interface CommonDateVisitor {
    
    public void handleCreateArticleCommand(PersistentCreateArticleCommand createArticleCommand) throws PersistenceException;
    public void handleCreateSubProductGroupCommand(PersistentCreateSubProductGroupCommand createSubProductGroupCommand) throws PersistenceException;
    public void handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException;
    
}
