
package view.visitor;

import view.*;

public interface ComponentReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleArticleWrapper(ArticleWrapperView articleWrapper) throws ModelException, E;
    public R handleProductGroup(ProductGroupView productGroup) throws ModelException, E;
    
}
