
package model.visitor;

import persistence.*;

public interface ReturnManagerCommandReturnVisitor<R> {
    
    public R handleAddArticleReturnCommand(AddArticleReturnCommand4Public addArticleReturnCommand) throws PersistenceException;
    
}
