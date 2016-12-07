
package model.visitor;

import persistence.*;

public interface ComponentContainerCommandReturnVisitor<R> {
    
    public R handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException;
    public R handleNewProductGroupCommand(NewProductGroupCommand4Public newProductGroupCommand) throws PersistenceException;
    
}
