
package model.visitor;

import persistence.*;

public interface ProductGroupCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException, E;
    public R handleAddSubProductGroupCommand(AddSubProductGroupCommand4Public addSubProductGroupCommand) throws PersistenceException, E;
    
}
