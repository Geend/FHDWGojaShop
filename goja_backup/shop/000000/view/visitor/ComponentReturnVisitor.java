
package view.visitor;

import view.*;

public interface ComponentReturnVisitor<R> {
    
    public R handleArticle(ArticleView article) throws ModelException;
    public R handleProductGroup(ProductGroupView productGroup) throws ModelException;
    
}
