
package view.visitor;

import view.*;

public interface ComponentVisitor extends ProductGroupVisitor{
    
    public void handleArticle(ArticleView article) throws ModelException;
    
}
