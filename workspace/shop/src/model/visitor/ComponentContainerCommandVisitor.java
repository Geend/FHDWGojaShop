
package model.visitor;

import persistence.*;

public interface ComponentContainerCommandVisitor {
    
    public void handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException;
    public void handleNewProductGroupCommand(NewProductGroupCommand4Public newProductGroupCommand) throws PersistenceException;
    
}
