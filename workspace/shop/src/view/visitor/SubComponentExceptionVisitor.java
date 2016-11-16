
package view.visitor;

import view.*;

public interface SubComponentExceptionVisitor<E extends view.UserException> {
    
    public void handleArticle(ArticleView article) throws ModelException, E;
    public void handleSubProductGroup(SubProductGroupView subProductGroup) throws ModelException, E;
    
}
