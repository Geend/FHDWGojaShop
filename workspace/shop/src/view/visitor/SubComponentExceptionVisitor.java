
package view.visitor;

import view.*;

public interface SubComponentExceptionVisitor<E extends view.UserException> {
    
    public void handleArticleWrapper(ArticleWrapperView articleWrapper) throws ModelException, E;
    public void handleSubProductGroup(SubProductGroupView subProductGroup) throws ModelException, E;
    
}
