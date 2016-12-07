
package view.visitor;

import view.*;

public abstract class ComponentStandardVisitor implements ComponentVisitor {
    
    public void handleProductGroup(ProductGroupView productGroup) throws ModelException{
        this.standardHandling(productGroup);
    }
    public void handleArticleWrapper(ArticleWrapperView articleWrapper) throws ModelException{
        this.standardHandling(articleWrapper);
    }
    protected abstract void standardHandling(ComponentView component) throws ModelException;
}
