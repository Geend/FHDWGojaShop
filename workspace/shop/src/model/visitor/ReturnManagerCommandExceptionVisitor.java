
package model.visitor;

import persistence.*;

public interface ReturnManagerCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleAddArticleReturnCommand(AddArticleReturnCommand4Public addArticleReturnCommand) throws PersistenceException, E;
    
}
