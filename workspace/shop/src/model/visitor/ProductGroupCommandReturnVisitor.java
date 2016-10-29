
package model.visitor;

import persistence.*;

public interface ProductGroupCommandReturnVisitor<R> {
    
    public R handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException;
    public R handleAddSubProductGroupCommand(AddSubProductGroupCommand4Public addSubProductGroupCommand) throws PersistenceException;
    
}
