
package view.visitor;

import view.*;

public abstract class SubComponentStandardVisitor implements SubComponentVisitor {
    
    public void handleSubProductGroup(SubProductGroupView subProductGroup) throws ModelException{
        this.standardHandling(subProductGroup);
    }
    public void handleArticleWrapper(ArticleWrapperView articleWrapper) throws ModelException{
        this.standardHandling(articleWrapper);
    }
    protected abstract void standardHandling(SubComponent subComponent) throws ModelException;
}
