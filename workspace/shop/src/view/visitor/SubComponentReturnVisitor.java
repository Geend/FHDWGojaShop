
package view.visitor;

import view.*;

public interface SubComponentReturnVisitor<R> {
    
    public R handleArticleWrapper(ArticleWrapperView articleWrapper) throws ModelException;
    public R handleSubProductGroup(SubProductGroupView subProductGroup) throws ModelException;
    
}
