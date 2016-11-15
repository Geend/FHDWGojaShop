
package model.visitor;

import persistence.*;

public interface ProductGroupCommandReturnVisitor<R> {
    
    public R handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException;
    public R handleNewSubProductGroupCommand(NewSubProductGroupCommand4Public newSubProductGroupCommand) throws PersistenceException;
    
}
