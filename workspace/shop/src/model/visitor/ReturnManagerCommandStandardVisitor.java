
package model.visitor;

import persistence.*;

public abstract class ReturnManagerCommandStandardVisitor implements ReturnManagerCommandVisitor {
    
    public void handleAddArticleReturnCommand(AddArticleReturnCommand4Public addArticleReturnCommand) throws PersistenceException{
        this.standardHandling(addArticleReturnCommand);
    }
    protected abstract void standardHandling(ReturnManagerCommand returnManagerCommand) throws PersistenceException;
}
