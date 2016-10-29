
package model.visitor;

import persistence.*;

public interface ProductGroupCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException, E;
    public void handleAddSubProductGroupCommand(AddSubProductGroupCommand4Public addSubProductGroupCommand) throws PersistenceException, E;
    
}
