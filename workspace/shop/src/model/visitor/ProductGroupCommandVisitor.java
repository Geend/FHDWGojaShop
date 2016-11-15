
package model.visitor;

import persistence.*;

public interface ProductGroupCommandVisitor {
    
    public void handleNewArticleCommand(NewArticleCommand4Public newArticleCommand) throws PersistenceException;
    public void handleNewSubProductGroupCommand(NewSubProductGroupCommand4Public newSubProductGroupCommand) throws PersistenceException;
    
}
