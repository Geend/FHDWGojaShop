
package view.visitor;

import view.*;

public interface ComponentExceptionVisitor<E extends view.UserException> {
    
    public void handleArticle(ArticleView article) throws ModelException, E;
    public void handleProductGroup(ProductGroupView productGroup) throws ModelException, E;
    
}
