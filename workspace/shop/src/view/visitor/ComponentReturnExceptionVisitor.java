
package view.visitor;

import view.*;

public interface ComponentReturnExceptionVisitor<R, E extends view.UserException> extends ProductGroupReturnExceptionVisitor<R, E> {
    
    public R handleArticle(ArticleView article) throws ModelException, E;
    
}
