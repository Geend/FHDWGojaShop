
package model.visitor;

import persistence.*;

public interface ReturnManagerCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleAddArticleReturnCommand(AddArticleReturnCommand4Public addArticleReturnCommand) throws PersistenceException, E;
    
}
