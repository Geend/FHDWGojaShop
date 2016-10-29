
package model.visitor;

import persistence.*;

public interface ProductGroupCommandVisitor {
    
    public void handleAddArticleCommand(AddArticleCommand4Public addArticleCommand) throws PersistenceException;
    public void handleAddSubProductGroupCommand(AddSubProductGroupCommand4Public addSubProductGroupCommand) throws PersistenceException;
    
}
