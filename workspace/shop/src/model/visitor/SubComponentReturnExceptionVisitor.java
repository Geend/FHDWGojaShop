
package model.visitor;

import persistence.*;

public interface SubComponentReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException, E;
    public R handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException, E;
    
}
