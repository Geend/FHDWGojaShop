
package view.visitor;

import view.*;

public interface ComponentReturnVisitor<R> extends ProductGroupReturnVisitor<R> {
    
    public R handleArticle(ArticleView article) throws ModelException;
    
}
