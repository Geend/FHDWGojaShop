
package model.visitor;

import persistence.*;

public interface SubComponentReturnVisitor<R> {
    
    public R handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException;
    public R handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException;
    
}
