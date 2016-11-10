
package view.visitor;

import view.*;

public abstract class ComponentStandardVisitor implements ComponentVisitor {
    
    public void handleRootProductGroup(RootProductGroupView rootProductGroup) throws ModelException{
        this.standardHandling(rootProductGroup);
    }
    public void handleArticle(ArticleView article) throws ModelException{
        this.standardHandling(article);
    }
    public void handleSubProductGroup(SubProductGroupView subProductGroup) throws ModelException{
        this.standardHandling(subProductGroup);
    }
    protected abstract void standardHandling(ComponentView component) throws ModelException;
}
