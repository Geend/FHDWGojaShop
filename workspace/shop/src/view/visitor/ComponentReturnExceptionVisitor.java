
package view.visitor;

import view.*;

public interface ComponentReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleArticle(ArticleView article) throws ModelException, E;
    public R handleProductGroup(ProductGroupView productGroup) throws ModelException, E;
    
}
