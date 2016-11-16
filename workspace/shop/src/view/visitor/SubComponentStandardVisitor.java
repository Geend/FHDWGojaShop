
package view.visitor;

import view.*;

public abstract class SubComponentStandardVisitor implements SubComponentVisitor {
    
    public void handleArticle(ArticleView article) throws ModelException{
        this.standardHandling(article);
    }
    public void handleSubProductGroup(SubProductGroupView subProductGroup) throws ModelException{
        this.standardHandling(subProductGroup);
    }
    protected abstract void standardHandling(SubComponent subComponent) throws ModelException;
}
