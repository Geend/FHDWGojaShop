
package view.visitor;

import view.*;

public interface ComponentExceptionVisitor<E extends view.UserException> {
    
    public void handleArticleWrapper(ArticleWrapperView articleWrapper) throws ModelException, E;
    public void handleProductGroup(ProductGroupView productGroup) throws ModelException, E;
    
}
