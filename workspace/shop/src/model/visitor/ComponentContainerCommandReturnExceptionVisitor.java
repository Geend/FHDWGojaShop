
package model.visitor;

import persistence.*;

public interface ComponentContainerCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException, E;
    public R handleNewProductGroupCommand(NewProductGroupCommand4Public newProductGroupCommand) throws PersistenceException, E;
    
}
