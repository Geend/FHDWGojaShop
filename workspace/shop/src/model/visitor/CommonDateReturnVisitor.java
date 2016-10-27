
package model.visitor;

import persistence.*;

public interface CommonDateReturnVisitor<R> {
    
    public R handleCreateArticleCommand(PersistentCreateArticleCommand createArticleCommand) throws PersistenceException;
    public R handleCreateSubProductGroupCommand(PersistentCreateSubProductGroupCommand createSubProductGroupCommand) throws PersistenceException;
    public R handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException;
    
}
