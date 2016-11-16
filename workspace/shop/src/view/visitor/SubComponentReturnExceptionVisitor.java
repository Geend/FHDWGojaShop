
package view.visitor;

import view.*;

public interface SubComponentReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleArticle(ArticleView article) throws ModelException, E;
    public R handleSubProductGroup(SubProductGroupView subProductGroup) throws ModelException, E;
    
}
