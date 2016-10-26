
package view.visitor;

import view.*;

public abstract class ComponentStandardVisitor implements ComponentVisitor {
    
    public void handleProductGroup(ProductGroupView productGroup) throws ModelException{
        this.standardHandling(productGroup);
    }
    public void handleArticle(ArticleView article) throws ModelException{
        this.standardHandling(article);
    }
    protected abstract void standardHandling(ComponentView component) throws ModelException;
}
