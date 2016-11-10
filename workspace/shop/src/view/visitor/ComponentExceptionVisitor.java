
package view.visitor;

import view.*;

public interface ComponentExceptionVisitor<E extends view.UserException> extends ProductGroupExceptionVisitor<E>{
    
    public void handleArticle(ArticleView article) throws ModelException, E;
    
}
