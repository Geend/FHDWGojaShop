
package model.visitor;

import persistence.*;

public interface ProductGroupCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException, E;
    public R handleNewSubProductGroupCommand(NewSubProductGroupCommand4Public newSubProductGroupCommand) throws PersistenceException, E;
    
}
