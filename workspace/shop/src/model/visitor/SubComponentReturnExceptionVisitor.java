
package model.visitor;

import persistence.*;

public interface SubComponentReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleArticle(Article4Public article) throws PersistenceException, E;
    public R handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException, E;
    
}
