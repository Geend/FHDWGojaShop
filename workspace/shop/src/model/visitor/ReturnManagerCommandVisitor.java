
package model.visitor;

import persistence.*;

public interface ReturnManagerCommandVisitor {
    
    public void handleAddArticleReturnCommand(AddArticleReturnCommand4Public addArticleReturnCommand) throws PersistenceException;
    
}
