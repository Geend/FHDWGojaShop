
package view.visitor;

import view.*;

public interface ComponentVisitor {
    
    public void handleArticleWrapper(ArticleWrapperView articleWrapper) throws ModelException;
    public void handleProductGroup(ProductGroupView productGroup) throws ModelException;
    
}
