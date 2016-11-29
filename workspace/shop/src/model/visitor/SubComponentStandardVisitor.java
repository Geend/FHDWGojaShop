
package model.visitor;

import persistence.*;

public abstract class SubComponentStandardVisitor implements SubComponentVisitor {
    
    public void handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException{
        this.standardHandling(subProductGroup);
    }
    public void handleArticleWrapper(ArticleWrapper4Public articleWrapper) throws PersistenceException{
        this.standardHandling(articleWrapper);
    }
    protected abstract void standardHandling(SubComponent subComponent) throws PersistenceException;
}
