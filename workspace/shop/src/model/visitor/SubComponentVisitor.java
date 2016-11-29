
package model.visitor;

import persistence.*;

public interface SubComponentVisitor {
    
    public void handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException;
    public void handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException;
    
}
