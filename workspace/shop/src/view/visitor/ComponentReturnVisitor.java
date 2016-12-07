
package view.visitor;

import view.*;

public interface ComponentReturnVisitor<R> {
    
    public R handleArticleWrapper(ArticleWrapperView articleWrapper) throws ModelException;
    public R handleProductGroup(ProductGroupView productGroup) throws ModelException;
    
}
