
package model.visitor;

import persistence.*;

public abstract class SubComponentStandardVisitor implements SubComponentVisitor {
    
    public void handleArticle(Article4Public article) throws PersistenceException{
        this.standardHandling(article);
    }
    public void handleSubProductGroup(SubProductGroup4Public subProductGroup) throws PersistenceException{
        this.standardHandling(subProductGroup);
    }
    protected abstract void standardHandling(SubComponent subComponent) throws PersistenceException;
}
